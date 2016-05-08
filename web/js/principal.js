/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    dibujarSlider();
});

function mostrarSlider() {
    $.ajax({
        url: 'PersonasServlet',
        data: {
            accion: "slider"
        },
        error: function () { //si existe un error en la respuesta del ajax
            alert("Se presento un error a la hora de cargar la información de las personas en la base de datos");
        },
        success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
            dibujarTabla(data);
            // se oculta el modal esta funcion se encuentra en el utils.js
            ocultarModal("myModal");

        },
        type: 'POST',
        dataType: "json"
    });
}

function dibujarSlider(){
    $("#some").html("");
    var dir = "media/slider/battleship.jpg";
    $("#some").append("<img src="+ dir +" alt="+"bs"+"/>");
}

$(function () {
    //Genera el datapicker
   

    //agrega los eventos las capas necesarias
    $("#btn1").click(function () {
        dibujarSlider();
    });
});