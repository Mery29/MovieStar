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

/**
 *
 * @author Mery Zúñiga
 */
public class UsuariosServlet {
 
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
                    
                case "consultarUsuariosByID":
                    //se consulta la persona por ID
                    u = uBL.findById(Integer.parseInt(request.getParameter("idUsuario")));
                    
                    //se pasa la informacion del objeto a formato JSON
                    json = new Gson().toJson(u);
                    out.print(json);
                    break;
               
                case "agregarUsuario": case "modificarUsuario":

                    //Se llena el objeto con los datos enviados por AJAX por el metodo post
                    u.setPk_idUsuario(Integer.parseInt(request.getParameter("cedula")));
                    u.setNombre(request.getParameter("nombre"));
                    u.setApellidos(request.getParameter("apellido1"));
                   
                    String fechatxt = request.getParameter("fechaNacimiento");
                    DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                    Date date = format.parse(fechatxt);

                    u.setFechaNac(date);
                    //u.setSexo(Integer.parseInt(request.getParameter("sexo")));
                    u.setObservaciones(request.getParameter("observaciones"));

                    boolean validacion= false;
                    if(accion.equals("agregarPersona")){ //es insertar personas
                        List<Personas> lista = pBL.findAll(Personas.class.getName());
                        for(Personas personas : lista){
                            if(p.getPkCedula() == personas.getPkCedula()){
                                out.print("E~Usted ha ingresado una identificación que ya existe");
                                validacion= true;
                            }
                        }
                        if(!validacion){
                        //Se guarda el objeto
                            pBL.save(p);
                            out.print("C~La persona fue ingresada correctamente");
                        }

                        //Se imprime la respuesta con el response
                    
                        
                    }else{//es modificar persona
                        //Se guarda el objeto
                        pBL.merge(p);

                        //Se imprime la respuesta con el response
                        out.print("C~La persona fue modificada correctamente");
                    }
                    
                    break;
                    
                default:
                    out.print("E~No se indico la acción que se desea realizare");
                    break;
            }

        } catch (NumberFormatException e) {
            out.print("E~" + e.getMessage());
        } catch (Exception e) {
            out.print("E~" + e.getMessage());
        }
    }
}
