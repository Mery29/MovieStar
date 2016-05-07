/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.controller;

import com.google.gson.Gson;
import cr.ac.una.prograiv.moviestar.bl.DetallesBL;
import cr.ac.una.prograiv.moviestar.bl.OrdenesBL;
import cr.ac.una.prograiv.moviestar.domain.Detalles;
import cr.ac.una.prograiv.moviestar.domain.Ordenes;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mery Zúñiga
 */
public class DetallesServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //String para guardar el JSON generaro por al libreria GSON
            String json;
            
            //Se crea el objeto Persona
            Detalles d = new Detalles();

            //Se crea el objeto de la logica de negocio
            DetallesBL dBL = new DetallesBL();

            //Se hace una pausa para ver el modal
            Thread.sleep(1000);
            
            //**********************************************************************
            //se consulta cual accion se desea realizar
            //**********************************************************************
            String accion = request.getParameter("accion");
            switch (accion) {
                case "consultarDetalles":
                    json = new Gson().toJson(dBL.findAll(Ordenes.class.getName()));
                    out.print(json);
                    break;
                case "eliminarOrden":
                    d.setFk_idOrdenes(Integer.parseInt(request.getParameter("idOrden")));  //idCategoria viene siendo como un numero
                    dBL.delete(d);
                    break;
                    
                case "consultarDetallesSegunOrden":    //Se le envía el id de la orden para ver cuantas ordenes tiene
                    Detalles buscado= null;
                    buscado.setFk_idOrdenes(Integer.parseInt(request.getParameter("idOrden")));
                    d = dBL.findByOther(buscado);
                    json = new Gson().toJson(d);
                    out.print(json);
                    break;
                
                case "agregarDetalle": case "modificarDetalle":

                    //Se llena el objeto con los datos enviados por AJAX por el metodo post
                    d.setFk_idCatalogos(Integer.parseInt(request.getParameter("id_catalogo")));
                    d.setFk_idOrdenes(Integer.parseInt(request.getParameter("id_orden")));
                    d.setPrecio(Float.parseFloat(request.getParameter("precio")));
                   
                    String fechatxt = request.getParameter("fechaLimite");
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    Date date = format.parse(fechatxt);
                    
                    d.setFechaLimite(date);
                    d.setTipo(request.getParameter("tipo"));
                
                    boolean validacion= false;
                    if(accion.equals("agregarDetalle")){ //es insertar orden 
                        List<Detalles> lista = dBL.findAll(Ordenes.class.getName());
                        for(Detalles detalles : lista){
                            if(d.getFk_idOrdenes()== detalles.getFk_idOrdenes()){  //Una orden solo debera tener un detalle, entonces se pregunta si esa orden ya existe
                                out.print("E~Usted ha ingresado un detalle a una orden existente");  
                                validacion= true;
                            }
                        }
                        if(!validacion){
                        //Se guarda el objeto
                            dBL.save(d);
                            out.print("C~El detalle se guardo correctamente");
                        }

                        //Se imprime la respuesta con el response
                    
                        
                    }else{//es modificar persona
                        //Se guarda el objeto
                        dBL.merge(d);

                        //Se imprime la respuesta con el response
                        out.print("C~La orden fue modificada correctamente");  //Se dice que la orden fue modificada porque al cambiar el detalle es la orden lo que se modifica
                    }
                    
                    break;
                    
                default:
                    out.print("E~No se indico la acción que se desea realizar");
                    break;
            }

        } catch (NumberFormatException e) {
            out.print("E~" + e.getMessage());
        } catch (Exception e) {
            out.print("E~" + e.getMessage());
        }
    }
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
