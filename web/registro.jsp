<%-- 
    Document   : registro
    Created on : 07-may-2016, 10:19:57
    Author     : Mery Zúñiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registro</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
        <link rel="stylesheet" type="text/css" href="css/font-awesome-4.5.0/css/font-awesome.min.css" />
        <link rel="stylesheet" href="css/creative.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/ajSlider.js"></script>
        <script src="js/myJs.js"></script> 
        <script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
        <link rel="shortcut icon" href="media/icon.ico">  
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/custom.css">
        <link rel="shortcut icon" href="media/icon.ico">   
        <link rel="stylesheet" href="css/style.css"> 
        
    </head>
  
   
    <body>
        <nav class="navbar navbar-default">  
            <div class="container-fluid">
               <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navegacion">
                    <span class="sr-only">Desplegar navegación</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                  <a class="pull-left" href="#"> <img src="../media/logo.png" alt="logo"> </a>
              </div>  
                <div class="collapse navbar-collapse bottom col-md-8 col-lg-8" id="navegacion">
                  <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Inicio</a></li>
                    <li><a href="#footer">Nosotros</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Películas<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="peliculasComedia.html">Comedia</a></li>
                        <li><a href="peliculasRomance.html">Romance</a></li>
                        <li><a href="peliculasTerror.html">Terror</a></li>
                        <li><a href="peliculasFiccion.html">Ciencia ficción</a></li>
                        <li><a href="peliculasDrama.html">Drama</a></li>
                        <li><a href="peliculasEspiritualidad.html">Espiritualidad</a></li>
                        <li><a href="peliculasAccion.html">Acción</a></li>
                        <li><a href="peliculasInfantiles.html">Infantiles</a></li>
                    </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Series<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="seriesComedia.html">Comedia</a></li>
                        <li><a href="seriesTerror.html">Terror</a></li>
                        <li><a href="seriesFiccion.html">Ciencia ficción</a></li>
                        <li><a href="seriesDrama.html">Drama</a></li>
                        <li><a href="seriesAccion.html">Acción</a></li>
                        <li><a href="seriesInfantiles.html">Infantiles</a></li>
                    </ul>
                    <li><a href="contactenos.html">Contáctanos</a></li>
                  </ul>
                </div> 
                <form class="navbar-form navbar-right" method="post">
                    <a data-toggle="modal" data-target="#deleteMessage" class="btn btn-primary"><span class="glyphicon"></span>Iniciar Sesion</a>
                    <div id="deleteMessage" class="modal fade in" tabindex="-1" role="dialog" aria-hidden="false">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal">x</button>
                                    <h3>Iniciar sesion en MovieStar</h3>
                                </div>
                                <div class="modal-body">
                                    <p><input type="text" name="eid" id="email" placeholder="Correo Electrónico"></p>
                                    <p><input type="password" name="passwd" placeholder="Contraseña"></p>
                                    <p><button type="submit" class="btn btn-primary">Iniciar Sesión</button>
                                          <a href="#">¿Olvidaste la contraseña?</a>
                                    </p>
                                </div>
                                <div class="modal-footer">
                                      ¿Eres nuevo en MovieStar?
                                      <a href="registro.html" class="btn btn-primary">Regístrate</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
                <form class="navbar-form navbar-right" role="search">
                    <div class="form-group">
                      <input type="search" class="form-control " placeholder="Buscar por nombre, Director, Actor principal o Categoría">
                    </div>
                    <button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-search"></span></button>
                </form>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="well well-sm">
                        <form class="form-horizontal" method="post">
                            <fieldset>
                                <legend class="text-center header">Regístrate</legend>
                                <div class="form-group" id="groupUser">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user-secret bigicon fa-2x"></i></span>
                                    <div class="col-md-8">
                                        <input id="user" name="username" type="text" placeholder="Nombre de usuario" class="form-control" required="required">
                                    </div>
                                </div>
                                <div class="form-group" id="groupPass">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-key bigicon fa-2x"></i></span>
                                    <div class="col-md-8">
                                        <input id="pass" name="psw" type="password" placeholder="Contraseña" class="form-control" required="required">
                                    </div>
                                </div>
                                <div class="form-group" id="groupId">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon fa-2x"></i></span>
                                    <div class="col-md-8">
                                        <input id="id" name="id" type="text" placeholder="Identificacion" class="form-control" required="required">
                                    </div>
                                </div>
                                <div class="form-group" id="groupName">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon fa-2x"></i></span>
                                    <div class="col-md-8">
                                        <input id="fname" name="name" type="text" placeholder="Nombre" class="form-control" required="required">
                                    </div>
                                </div>
                                <div class="form-group" id="groupLastName">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon fa-2x"></i></span>
                                    <div class="col-md-8">
                                        <input id="lname" name="lastname" type="text" placeholder="Apellidos" class="form-control" required="required">
                                    </div>
                                </div>
                                <div class="form-group" id="groupDireccion">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon fa-2x"></i></span>
                                    <div class="col-md-8">
                                        <input id="direccion" name="direccion" type="text" placeholder="Dirrección" class="form-control" required="required">
                                    </div>
                                </div>
                                <div class="form-group" id="groupEmail">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon fa-2x"></i></span>
                                    <div class="col-md-8">
                                        <input id="email2" name="email" type="text" placeholder="Correo Electrónico" class="form-control" required="required">
                                    </div>
                                </div>
                                <div class="form-group" id="groupFecha">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-calendar bigicon fa-2x"></i></span>
                                    <div class="col-md-8" data-tip="Fecha de nacimiento">
                                        <input id="cumple" name="bday" type="text" placeholder="Fecha de nacimiento" class="form-control" required="required">
                                    </div>
                                </div>
                                <!-- <label for="dpFechaNacimiento">Fecha Nacimiento:</label>
                                <div id="dpFechaNacimiento" class="input-group date form_date" data-date="" data-date-format="dd/mm/yyyy" data-link-field="dtp_input2" data-link-format="dd/mm/yyyy">
                                    <input class="form-control" type="text" value="" readonly placeholder="dd/mm/aaaa" id="dpFechaNacimientoText">
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-calendar"></span>
                                    </span>
                                </div> -->
                                
                                <div class="form-group" id="groupPhone">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon fa-2x"></i></span>
                                    <div class="col-md-8">
                                        <input id="phone" name="phone" type="text" placeholder="Teléfono" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group" id="groupCelphone">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon fa-2x"></i></span>
                                    <div class="col-md-8">
                                        <input id="celphone" name="phone" type="text" placeholder="Celular" class="form-control">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-12 text-center">
                                        <button type="submit" id="agregarUsuario" class="btn btn-primary btn-lg">Registrarme</button>
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <footer>
            <div id="footer" class="container well">
                <div>
                    <div class="row">
                        <h3 class="footertext">Sobre Nosotros:</h3>
                        <br>
                        <div class="col-md-4">
                            <i class="fa fa-university bigicon fa-5x"></i>
                            <br>
                            <h4 class="footertext">MovieStar</h4>
                            <p class="footertext">MovieStar nace como parte del proyecto de Programación IV de la Universidad Nacional de Costa Rica.<br>
                          </div>
                        <div class="col-md-4">
                            <i class="fa fa-eye bigicon fa-5x"></i>
                            <br>
                            <h4 class="footertext">Objetivo</h4>
                            <p class="footertext">El objetivo de nuestro proyecto es simular un comercio dedicado al alquiler/venta de peliculas y/o series.<br>
                          </div>
                          <div class="col-md-4">
                                <i class="fa fa-code bigicon fa-5x"></i>
                                <h4 class="footertext">Programadores</h4>
                                <p class="footertext"><i class="fa fa-female bigicon fa-2x"></i> Meribeth Zúñiga Zúñiga.<br>
                                <p class="footertext"><i class="fa fa-male bigicon fa-2x"></i> Bayron Picado Obando.<br>
                          </div>
                        </div>
                    <div class="row">
                        <p class="footertext">Copyright 2016</p>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>

