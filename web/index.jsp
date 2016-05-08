<%-- 
    Document   : index
    Created on : 05/05/2016, 10:40:35 PM
    Author     : Byron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Video Star</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="UTF-8">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
        <link rel="stylesheet" type="text/css" href="css/font-awesome-4.5.0/css/font-awesome.min.css" />
        <link rel="stylesheet" href="css/creative.css">
        <script src="js/principal.js"></script>
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
                    <a class="pull-left" href="#"> <img src="media/logo.png" alt="logo"> </a>
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
                                      <a href="registro.jsp" class="btn btn-primary">Regístrate</a>
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
            <div id="ajSlider">
                
            </div>
        <div id="some"></div>
            <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <div class="page-header">
                        <h3>Romance</h3>
                    </div>
                    <div id="myCarousel1" class="row carousel slide" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="item active">
                                <ul class="thumbnails">
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/romance/lunanueva_ro.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>Luna nueva</h4>
											<div class= "panel panel-primary">
												<div id="lunanueva" class="collapse panel-body">
													<p>Bella tienta al destino en su intento de conocer mejor a su amado vampiro.
													Descubre un par de antiguos secretos que la ponen más en peligro que nunca. 
													Nada más cumplir 18 años, Edward decide abandonarla con intención de protegerla.</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#lunanueva">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/romance/lugarsecreto_ro.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>Un Lugar Secreto</h4>
                                            <div class= "panel panel-primary">
												<div id="lugar_secreto" class="collapse panel-body">
													<p>Una mujer misteriosa intenta reinicar su vida en un pueblo. Pero el secreto de su pasado irá con ella a donde vaya...</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#lugar_secreto">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                          <a href="#"><img src="media/peliculas/romance/propuesta_ro.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>La Propuesta</h4>
                                            <div class= "panel panel-primary">
												<div id="la_propuesta" class="collapse panel-body">
													<p>Debido a problemas legales, una exitosa mujer de negocios convence a su asistente para que se case con ella</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#la_propuesta">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/romance/crudaverdad_ro.png" alt=""></a>
                                        </div>
                                            <div class="caption-box">
                                                <h4>La Cruda Verdad</h4>
                                            <div class= "panel panel-primary">
												<div id="cruda_verdad" class="collapse panel-body">
													<p>Una productora televisiva que tiene problemas para encontrar el amor contará con la insospechada ayuda de su desagradable presentador, que la asesorará
													en sus citas, haciéndola pasar por una serie de sonrojantes pruebas para demostrar sus teorías sobre las relaciones.</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#cruda_verdad">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <div class="item">
                                <ul class="thumbnails">
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                          <a href="#"><img src="media/peliculas/romance/odiodeti_ro.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>10 cosas que odio de ti</h4>
                                            <div class= "panel panel-primary">
												<div id="odiodeti" class="collapse panel-body">
													<p>Dos hermanas; una es puro amor, la otra es fría como el hielo. Un joven intentará domar la fierecilla. ¿Lo logrará?</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                          <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#odiodeti">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/romance/amorydrogas_ro.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>De amor y otras adicciones</h4>
                                            <div class= "panel panel-primary">
												<div id="amor_drogras" class="collapse panel-body">
													<p>Maggie es una mujer independiente que no deja que nada ni nadie la ate. Pero conoce a Jamie, cuyo implacable e infalible encanto le sirve bien tanto 
													con las mujeres como dentro del despiadado mundo de las ventas farmacéuticas. La evolución que sufre la relación entre Maggie y Jamie coge a ambos por sorpresa,
													al encontrarse bajo la influencia de la droga suprema: el amor.</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                          <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#amor_drogras">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/romance/nomequitesaminovio_ro.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>No me quites a mi novio</h4>
                                            <div class= "panel panel-primary">
												<div id="novio" class="collapse panel-body">
													<p>La relacion de Rachel con su megor amiga Darcy está puesta a prueba cuando ella y el prometido de Darcy terminan en la cama juntos</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#novio">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/romance/cuestiondetiem_ro.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                          <h4>Cuestión de tiempo</h4>
                                            <div class= "panel panel-primary">
												<div id="cuestion" class="collapse panel-body">
													<p>A sus 21 años, Tim Lake descubre que puede viajar en el tiempo. Tim descubre que este don no puede protegerlo 
													de las tristezas ni altibajos que afectan a cualquier familia. Incluso viajar en el tiempo tiene limitaciones y puede ser peligroso.</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#cuestion">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                  </ul>
                                </div>  
                            </div>
                        <div class="control-box">                            
                            <a data-slide="prev" href="#myCarousel1" class="carousel-control left">‹</a>
                            <a data-slide="next" href="#myCarousel1" class="carousel-control right">›</a>
                        </div>  
                    </div>
                </div>      
            </div>
            </div>
                <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="page-header">
                            <h3>Acción</h3>
                        </div>
                        <div id="myCarousel2" class="row carousel slide" data-ride="carousel">
                            <div class="carousel-inner">
                                <div class="item active">
                                    <ul class="thumbnails">
                                        <li class="col-sm-3">      
                                            <div class="thumbnail">
                                                <a href="#"><img src="media/peliculas/accion/4fantasticos_ac.png" alt=""></a>
                                            </div>
                                            <div class="caption-box">
                                                <h4>Los 4 fantásticos</h4>
                                                <div class= "panel panel-primary">
													<div id="4fantasticos" class="collapse panel-body">
														<p>Cuatro jóvenes se teletransportan a un peligroso universo alterno que altera sus formas físicas en maneras muy extrañas. Ahora los cuatro
														deben aprender a aprovechar sus nuevas habilidades y trabajar juntos para salvar la Tierra de un antiguo amigo que se volvió enemigo.</p>
														<h6>Precio de venta:3500</h6>
														<h6>Precio de renta: 1000</h6>
														<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
													</div>
												</div>
                                                <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#4fantasticos">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                            </div>
                                        </li>
                                        <li class="col-sm-3">      
                                            <div class="thumbnail">
                                                <a href="#"><img src="media/peliculas/accion/advengers_ac.png" alt=""></a>
                                            </div>
                                            <div class="caption-box">
                                                <h4>Los vengadores</h4>
                                                <div class= "panel panel-primary">
													<div id="vengadores" class="collapse panel-body">
														<p>La reunión más espectacular de superhéroes de Marvel. Un enemigo inesperado amenaza con poner en peligro la seguridad mundial, así que Nick Fury,
														director de la agencia internacional SHIELD, necesita armar un equipo que salve al mundo del mayor de los desastres.</p>
														<h6>Precio de venta:3500</h6>
														<h6>Precio de renta: 1000</h6>
														<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
													</div>
												</div>
                                                <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#vengadores">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                            </div>
                                        </li>
                                        <li class="col-sm-3">      
                                            <div class="thumbnail">
                                              <a href="#"><img src="media/peliculas/accion/diaparamatar_ac.png" alt=""></a>
                                            </div>
                                            <div class="caption-box">
                                                <h4>Otro día para matar</h4>
                                                <div class= "panel panel-primary">
													<div id="diamatar" class="collapse panel-body">
														<p>John Wick es un ex-sicario muy temido de la mafia que sale de su retiro para localizar a los gangsters que le arrebataron todo. Su esposa acababa de morir,
														y por azares del destino se topa con unos mafiosos que lo hacen enojar, para mala suerte de ellos.</p>
														<h6>Precio de venta:3500</h6>
														<h6>Precio de renta: 1000</h6>
														<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
													</div>
												</div>
                                                <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#diamatar">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                            </div>
                                        </li>
                                        <li class="col-sm-3">      
                                            <div class="thumbnail">
                                                <a href="#"><img src="media/peliculas/accion/guerraz_ac.png" alt=""></a>
                                            </div>
                                                <div class="caption-box">
                                                    <h4>Guerra mundial z</h4>
                                                <div class= "panel panel-primary">
													<div id="guerraz" class="collapse panel-body">
														<p>Un empleado de la ONU juega contra el tiempo y el destino mientras viaja por el mundo intentando frenar una pandemia de zombis</p>
														<h6>Precio de venta:3500</h6>
														<h6>Precio de renta: 1000</h6>
														<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
													</div>
												</div>
                                                <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#guerraz">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <div class="item">
                                    <ul class="thumbnails">
                                        <li class="col-sm-3">      
                                            <div class="thumbnail">
                                              <a href="#"><img src="media/peliculas/accion/hombresnegro_ac.png" alt=""></a>
                                            </div>
                                            <div class="caption-box">
                                                <h4>Hombres de negro 3</h4>
                                                <div class= "panel panel-primary">
													<div id="hombresdenegro" class="collapse panel-body">
														<p>Con la tierra bajo una amenaza aliegínena, el agente J viaja en el tiempo y se une a un agente K más joven para cambiar el curso de la historia </p>
														<h6>Precio de venta:3500</h6>
														<h6>Precio de renta: 1000</h6>
														<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
													</div>
												</div>
                                              <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#hombresdenegro">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                            </div>
                                        </li>
                                        <li class="col-sm-3">      
                                            <div class="thumbnail">
                                                <a href="#"><img src="media/peliculas/accion/ladron_ac.png" alt=""></a>
                                            </div>
                                            <div class="caption-box">
                                                <h4>Ladrón que roba a ladrón</h4>
                                                <div class= "panel panel-primary">
													<div id="ladron" class="collapse panel-body">
														<p>Un dúo de bandidos reformados estafan a un enérgico vendedor de infomerciales que se hizo rico engañando a miles de inocentes inmigrantes</p>
														<h6>Precio de venta:3500</h6>
														<h6>Precio de renta: 1000</h6>
														<button type="submit"  class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
													</div>
												</div>
                                              <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#ladron">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                            </div>
                                        </li>
                                        <li class="col-sm-3">      
                                            <div class="thumbnail">
                                                <a href="#"><img src="media/peliculas/accion/matrix_ac.png" alt=""></a>
                                            </div>
                                            <div class="caption-box">
                                                <h4>Matrix</h4>
                                                <div class= "panel panel-primary">
													<div id="matrix" class="collapse panel-body">
														<p>Un programador de computación descubre que el mundo que percibimos es una simulación creada por máquinas, por lo que decide unirse a la lucha por la liberación humana</p>
														<h6>Precio de venta:3500</h6>
														<h6>Precio de renta: 1000</h6>
														<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
													</div>
												</div>
                                                <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#matrix">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                            </div>
                                        </li>
                                        <li class="col-sm-3">      
                                            <div class="thumbnail">
                                                <a href="#"><img src="media/peliculas/accion/rapidos_ac.png" alt=""></a>
                                            </div>
                                            <div class="caption-box">
                                              <h4>Rápidos y furiosos 5</h4>
                                                <div class= "panel panel-primary">
													<div id="rapidos" class="collapse panel-body">
														<p>Brian y Mia liberan a Dom de prision. Juntos se dirigen a Brasil para formar un equipo de competición para encargasen de un narcotraficante  que los quiere matar</p>
														<h6>Precio de venta:3500</h6>
														<h6>Precio de renta: 1000</h6>
														<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
													</div>
												</div>
                                                <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#rapidos">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                            </div>
                                        </li>
                                      </ul>
                                    </div>  
                                </div>
                            <div class="control-box">                            
                                <a data-slide="prev" href="#myCarousel2" class="carousel-control left">‹</a>
                                <a data-slide="next" href="#myCarousel2" class="carousel-control right">›</a>
                            </div>  
                        </div>
                    </div>      
                </div>
            </div>
            <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <div class="page-header">
                        <h3>Terror</h3>
                    </div>
                    <div id="myCarousel3" class="row carousel slide" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="item active">
                                <ul class="thumbnails">
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/terror/carrie_te.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>Carrie</h4>
                                            <div class= "panel panel-primary">
												<div id="carrie" class="collapse panel-body">
													<p>Una adolescente marginada por poderes telequinéticos descarga su mortifero potencial sobre los compañeros de la secundaria  que la molestan durante el baile de graduación</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#carrie">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/terror/chucky_te.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>Chucky el muñeco diabólico</h4>
                                            <div class= "panel panel-primary">
												<div id="chucky" class="collapse panel-body">
													<p>Andy, un niño de 6 años, sabe que su muñeco chucky es responsable de una serie de asecinatos, pero ni su mamá ni la policía le creen</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#chucky">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                          <a href="#"><img src="media/peliculas/terror/elegidos_te.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>Los elegidos</h4>
                                            <div class= "panel panel-primary">
												<div id="elegidos" class="collapse panel-body">
													<p>Para evitar que un demonio se lleve a su hija, su madre y su tío adolescente deben convencer a otros seis parientes de hacer un sacrificio mortal</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#elegidos">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/terror/elisa_te.png" alt=""></a>
                                        </div>
                                            <div class="caption-box">
                                                <h4>Para Elisa</h4>
                                            <div class= "panel panel-primary">
												<div id="elisa" class="collapse panel-body">
													<p>Una chica recién graduada intenta ahorrar dinero trabajando de niñera. Su primera clienta es una desequilibrada que la considera un juguete</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#elisa">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <div class="item">
                                <ul class="thumbnails">
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                          <a href="#"><img src="media/peliculas/terror/emilyrouse_te.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>El exorcismo de Emily Rouse</h4>
                                            <div class= "panel panel-primary">
												<div id="emily" class="collapse panel-body">
													<p>La abogada Erin Burner se ve en aprietos cuando decide representar a un sacerdote que realizó un exsorcismo que salió terriblemente mal</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                          <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#emily">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/terror/espejos_te.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>Espejos</h4>
                                            <div class= "panel panel-primary">
												<div id="espejos" class="collapse panel-body">
													<p>Kiefer Sutherland personifica a un guardia de seguridad que descubre la existencia de espíritus malignos que viven en los espejos de una tienda deparmental incendiada</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                          <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#espejos">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/terror/mama_te.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                            <h4>Mamá</h4>
                                            <div class= "panel panel-primary">
												<div id="mamá" class="collapse panel-body">
													<p>Hace cinco años, el mismo día en que su madre fue asesinada, las pequeñas Victoria y Lilly desaparecieron en el bosque.
													Son encontradas unos años más tarde por su tío en una cabaña en medio de la naturaleza, donde han vivido aisladas de toda civilización.
													Comienzan entonces una nueva vida pero descubren que alguien o algo misterioso las sigue arropando por las noches.</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
                                                <button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#mamá">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                    <li class="col-sm-3">      
                                        <div class="thumbnail">
                                            <a href="#"><img src="media/peliculas/terror/nochedemonio_te.png" alt=""></a>
                                        </div>
                                        <div class="caption-box">
                                          <h4>La noche del demonio</h4>
                                            <div class= "panel panel-primary">
												<div id="nochedemonio" class="collapse panel-body">
													<p>Josh y Renai han conformado una familia feliz junto a sus tres niños pequeños. Cuando su pequeño hijo Dalton (Ty Simkins) sufre un trágico accidente
													doméstico que lo deja en un profundo coma, Josh y Renai comienzan a experimentar cosas que la ciencia no puede explicar.</p>
													<h6>Precio de venta:3500</h6>
													<h6>Precio de renta: 1000</h6>
													<button type="submit" class="btn btn-default comprar"><span class="glyphicon glyphicon-shopping-cart"></span></button>
												</div>
											</div>
                                            <a class="SeeMore2 btn btn-primary btn-mini" data-toggle="collapse" href="#nochedemonio">Leer Más <span class="glyphicon glyphicon-arrow-right"></span></a>
                                        </div>
                                    </li>
                                  </ul>
                                </div>  
                            </div>
                        <div class="control-box">                            
                            <a data-slide="prev" href="#myCarousel3" class="carousel-control left">‹</a>
                            <a data-slide="next" href="#myCarousel3" class="carousel-control right">›</a>
                        </div>  
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

