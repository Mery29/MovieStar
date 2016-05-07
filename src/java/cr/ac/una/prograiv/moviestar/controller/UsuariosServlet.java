/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.moviestar.controller;

import com.google.gson.Gson;
import cr.ac.una.prograiv.moviestar.domain.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cr.ac.una.prograiv.moviestar.bl.UsuariosBL;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author Mery Zúñiga
 */
public class UsuariosServlet extends HttpServlet {
 
     protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //String para guardar el JSON generaro por al libreria GSON
            String json;
            
            //Se crea el objeto Persona
            Usuarios u = new Usuarios();

            //Se crea el objeto de la logica de negocio
            UsuariosBL uBL = new UsuariosBL();

            //Se hace una pausa para ver el modal
            Thread.sleep(1000);
            
            //**********************************************************************
            //se consulta cual accion se desea realizar
            //**********************************************************************
            String accion = request.getParameter("accion");
            switch (accion) {
                case "consultarUsuarios":
                    json = new Gson().toJson(uBL.findAll(Usuarios.class.getName()));
                    out.print(json);
                    break;
                case "eliminarUsuarios":
                    u.setPk_idUsuario(Integer.parseInt(request.getParameter("idUsuario")));
                     //Se elimina el objeto
                    uBL.delete(u);

                    //Se imprime la respuesta con el response
                    out.print("El usuario fue eliminado correctamente");
                    break;
                    
                case "consultarUsuariosPorCuenta":   //Se guarda un usuario y una contraseña en una persona, y se busca si la persona existe
                    //se consulta la persona por ID
                    Usuarios consultado= null;
                    consultado.setUsuario(request.getParameter("usuario"));
                    consultado.setContraseña(request.getParameter("contraseña"));
                    u = uBL.findByOther(consultado);
                    
                    //se pasa la informacion del objeto a formato JSON
                    json = new Gson().toJson(u);
                    out.print(json);
                    break;
                                   
                case "agregarUsuario": case "modificarUsuario":

                    //Se llena el objeto con los datos enviados por AJAX por el metodo post
                    u.setPk_idUsuario(Integer.parseInt(request.getParameter("cedula")));
                    u.setNombre(request.getParameter("nombre"));
                    u.setApellidos(request.getParameter("apellidos"));
                   
                    String fechatxt = request.getParameter("fechaNacimiento");
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    Date date = format.parse(fechatxt);
                    
                    u.setFechaNac(date);
                    u.setContraseña(request.getParameter("contraseña"));
                    u.setCorreo(request.getParameter("correo"));
                    u.setTelCasa(Integer.parseInt(request.getParameter("telCasa")));
                    u.setTelCel(Integer.parseInt(request.getParameter("telCel")));
                    u.setTipoUsuario(request.getParameter("tipoUsuario"));
                    u.setUsuario(request.getParameter("usuario"));
                    u.setDireccion(request.getParameter("direccion"));
                    
                    

                    boolean validacion= false;
                    if(accion.equals("agregarUsuario")){ //es insertar usuarios
                        List<Usuarios> lista = uBL.findAll(Usuarios.class.getName());
                        for(Usuarios usuarios : lista){
                            if(u.getUsuario() == usuarios.getUsuario()){
                                out.print("E~Usted ha ingresado un nombre de usuario que ya existe");
                                validacion= true;
                            }
                        }
                        if(!validacion){
                        //Se guarda el objeto
                            uBL.save(u);
                            out.print("C~El usuario fue ingresado correctamente");
                        }

                        //Se imprime la respuesta con el response
                    
                        
                    }else{//es modificar persona
                        //Se guarda el objeto
                        uBL.merge(u);

                        //Se imprime la respuesta con el response
                        out.print("C~El usuario fue modificado correctamente");
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
