/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    var txt = document.createTextNode("Texto agregado");
    document.getElementById('some').appendChild(txt);
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
    var some = document.createElement('div');
    some.innerHTML = "Hola Mundo";
    document.getElementById('some').appendChild(some);
}

$(function () {
    //Genera el datapicker
   

    //agrega los eventos las capas necesarias
    $("#btn1").click(function () {
        dibujarSlider();
    });
});