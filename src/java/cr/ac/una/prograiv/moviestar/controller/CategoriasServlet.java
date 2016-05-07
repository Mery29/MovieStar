/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.controller;

import com.google.gson.Gson;
import cr.ac.una.prograiv.moviestar.bl.CategoriasBL;
import cr.ac.una.prograiv.moviestar.domain.Categorias;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mery Zúñiga
 */
public class CategoriasServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //String para guardar el JSON generaro por al libreria GSON
            String json;
            
            //Se crea el objeto Categorías
            Categorias c = new Categorias();

            //Se crea el objeto de la logica de negocio
            CategoriasBL cBL = new CategoriasBL();

            //Se hace una pausa para ver el modal
            Thread.sleep(1000);
            
            //**********************************************************************
            //se consulta cual accion se desea realizar
            //**********************************************************************
            String accion = request.getParameter("accion");
            switch (accion) {
                case "consultarCategorias":
                    json = new Gson().toJson(cBL.findAll(Categorias.class.getName()));
                    out.print(json);
                    break;
                case "eliminarCategorias":  //que no debería necesitarse eliminar categorias, pero igual se implementa por si se necesitara
                    c.setPk_id(Integer.parseInt(request.getParameter("idCategoría")));  //idCategoria viene siendo como un numero
                     //Se elimina el objeto
                    cBL.delete(c);

                    //Se imprime la respuesta con el response
                    out.print("La categoría fue eliminada correctamente");
                    break;
                    
                case "consultarCategoriasPorNombre":   
                    Categorias consultada= null;
                    consultada.setNombre(request.getParameter("nombreCategoria"));
                    c = cBL.findByOther(consultada);
                    
                    //se pasa la informacion del objeto a formato JSON
                    json = new Gson().toJson(c);
                    out.print(json);
                    break;
               
                case "agregarCategoria": case "modificarCategoria":  //Un modificar categoria no se usa

                    //Se llena el objeto con los datos enviados por AJAX por el metodo post
                    c.setPk_id(Integer.parseInt(request.getParameter("idPelicula")));
                    c.setNombre(request.getParameter("nombreCategoria"));
                    c.setObservaciones(request.getParameter("observaciones"));
                   
                    boolean validacion= false;
                    if(accion.equals("agregarCategoria")){ //es insertar categorias
                        List<Categorias> lista = cBL.findAllByOther(Categorias.class.getName());
                        for(Categorias categorias : lista){
                            if(c.getNombre()== categorias.getNombre()){  //Compara si en lista ya se ha ingresado una categoría con el mismo nombre
                                out.print("E~Usted ha ingresado una categoría que ya existe");
                                validacion= true;
                            }
                        }
                        if(!validacion){
                        //Se guarda el objeto
                            cBL.save(c);
                            out.print("C~La categoría fue ingresada correctamente");
                        }

                        //Se imprime la respuesta con el response
                    
                        
                    }else{//es modificar persona
                        //Se guarda el objeto
                        cBL.merge(c);

                        //Se imprime la respuesta con el response
                        out.print("C~La categoria fue modificada correctamente");
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
