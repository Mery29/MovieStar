/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.controller;

import com.google.gson.Gson;
import cr.ac.una.prograiv.moviestar.bl.CatalogosBL;
import cr.ac.una.prograiv.moviestar.domain.Catalogos;
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
public class CatalogosServlet extends HttpServlet {
    
   protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //String para guardar el JSON generaro por al libreria GSON
            String json;
            
            //Se crea el objeto Persona
            Catalogos c = new Catalogos();

            //Se crea el objeto de la logica de negocio
            CatalogosBL cBL = new CatalogosBL();

            //Se hace una pausa para ver el modal
            Thread.sleep(1000);
            
            //**********************************************************************
            //se consulta cual accion se desea realizar
            //**********************************************************************
            String accion = request.getParameter("accion");
            switch (accion) {
                case "consultarCatalogo":  
                    json = new Gson().toJson(cBL.findAll(Catalogos.class.getName()));
                    out.print(json);
                    break;
                case "eliminarCatalogo":   //Podría darse el caso de eliminar una pelicula o serie
                    c.setPk_idCata(Integer.parseInt(request.getParameter("idCatalogo")));
                     //Se elimina el objeto
                    cBL.delete(c);

                    //Se imprime la respuesta con el response
                    out.print("La pelicula fue eliminada correctamente");
                    break;
                    
                case "buscarCatalogo":  
                    //se consulta la persona por ID
                    Catalogos consultado= null;
                    consultado.setNombre(request.getParameter("nombreCatalogo"));
                    consultado.setDirector(request.getParameter("director"));
                    consultado.setActor_princ(request.getParameter("actorPrincipal"));
                    consultado.setFk_idCateg(Integer.parseInt(request.getParameter("idCategoria")));
                    c = cBL.findByOther(consultado);
                    
                    //se pasa la informacion del objeto a formato JSON
                    json = new Gson().toJson(c);
                    out.print(json);
                    break;
                    
                case "consultarCatalogoPorId":  //Sería buscar pelicula o Serie por código que viene siendo el id 
                    Catalogos buscada= null;
                    buscada.setPk_idCata(Integer.parseInt(request.getParameter("idCatalogo")));
                    c = cBL.findByOther(buscada);
                    
                    //se pasa la informacion del objeto a formato JSON
                    json = new Gson().toJson(c);
                    out.print(json);
                    break;    
               
                case "agregarCatalogo": case "modificarCatalogo":   //Una pelicula o serie no deberia poder ser modificada
                    
                    //Se llena el objeto con los datos enviados por AJAX por el metodo post
                    c.setPk_idCata(Integer.parseInt(request.getParameter("idCatalogo")));
                    c.setNombre(request.getParameter("nombreCatalogo"));
                    c.setActor_princ(request.getParameter("actorPrincipal"));
                    c.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
                    
                    c.setDirector(request.getParameter("director"));
                    c.setPk_idCata(Integer.parseInt(request.getParameter("idCategoria")));
                    c.setPrecio_alquiler(Float.parseFloat(request.getParameter("precioAlqiler")));
                    c.setPrecio_compra(Float.parseFloat(request.getParameter("precioCompra")));
                    c.setTipo(request.getParameter("tipo"));
                    
                    
                    

                    boolean validacion= false;
                    if(accion.equals("agregarCatalogo")){ //es insertar catalogos
                        List<Catalogos> lista = cBL.findAll(Catalogos.class.getName());
                        for(Catalogos catalogo : lista){
                            if(c.getNombre()== catalogo.getNombre()){  //Busca en los que ya se han agregado si ya existe eel nombre del que se está agregando
                                out.print("E~Usted ha ingresado un catalogo que ya existe");
                                validacion= true;
                            }
                        }
                        if(!validacion){
                        //Se guarda el objeto
                            cBL.save(c);
                            out.print("C~El catalogo se ha modificado correctamente");
                        }

                        //Se imprime la respuesta con el response
                    
                        
                    }else{//es modificar persona
                        //Se guarda el objeto
                        cBL.merge(c);

                        //Se imprime la respuesta con el response
                        out.print("C~El catalogo se ha modificado correctamente");
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
