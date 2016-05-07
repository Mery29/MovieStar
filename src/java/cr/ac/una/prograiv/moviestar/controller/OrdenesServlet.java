/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.controller;

import com.google.gson.Gson;
import cr.ac.una.prograiv.moviestar.bl.OrdenesBL;
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
public class OrdenesServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //String para guardar el JSON generaro por al libreria GSON
            String json;
            
            //Se crea el objeto Persona
            Ordenes o = new Ordenes();

            //Se crea el objeto de la logica de negocio
            OrdenesBL oBL = new OrdenesBL();

            //Se hace una pausa para ver el modal
            Thread.sleep(1000);
            
            //**********************************************************************
            //se consulta cual accion se desea realizar
            //**********************************************************************
            String accion = request.getParameter("accion");
            switch (accion) {
                case "consultarOrdenes":
                    json = new Gson().toJson(oBL.findAll(Ordenes.class.getName()));
                    out.print(json);
                    break;
                case "eliminarOrden":
                    o.setPk_idOrden(Integer.parseInt(request.getParameter("idOrden")));
                     //Se elimina el objeto
                    oBL.delete(o);

                    //Se imprime la respuesta con el response
                    out.print("La orden fue eliminada correctamente");
                    break;
                    
                case "consultarOrdenesPorPersona":   //Se le envía el nombre de usuario para ver cuantas ordenes tiene
                    
                    //se pasa la informacion del objeto a formato JSON
                    json = new Gson().toJson(oBL.findAllByOther("usuario"));
                    out.print(json); 
                    break;
                    
                case "consultarOrdenesPorEstado":   //Se envia un tipo de estado para buscar todas ls ordenes con ese estado
                    json = new Gson().toJson(oBL.findAllByOther("estado"));
                    out.print(json);
                    break; 
               
                case "agregarOrden": case "modificarOrden":

                    //Se llena el objeto con los datos enviados por AJAX por el metodo post
                    o.setPk_idOrden(Integer.parseInt(request.getParameter("id_orden")));
                    o.setEstado(request.getParameter("estado"));
                    o.setFk_idUsuario(Integer.parseInt(request.getParameter("idUsuario")));
                   
                    String fechatxt = request.getParameter("fechaOrden");
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    Date date = format.parse(fechatxt);
                    
                    o.setFecha_orden(date);
                
                    boolean validacion= false;
                    if(accion.equals("agregarOrden")){ //es insertar usuarios
                        List<Ordenes> lista = oBL.findAll(Ordenes.class.getName());
                        for(Ordenes usuarios : lista){
                            if(o.getPk_idOrden()== usuarios.getPk_idOrden()){
                                out.print("E~Usted ha ingresado un código que ya existe");  //Código de la factura = idOrden
                                validacion= true;
                            }
                        }
                        if(!validacion){
                        //Se guarda el objeto
                            oBL.save(o);
                            out.print("C~La orden fue ingresada correctamente");
                        }

                        //Se imprime la respuesta con el response
                    
                        
                    }else{//es modificar persona
                        //Se guarda el objeto
                        oBL.merge(o);

                        //Se imprime la respuesta con el response
                        out.print("C~La orden fue modificada correctamente");
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
