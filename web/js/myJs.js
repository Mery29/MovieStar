$(document).ready(function() {
    mostrarSlider();
    $('#ajSlider').ajSlider(3000,{
		"width":"100%",//width of slider
		"height":"475px",//height of slider
		"textPosition":"30%",//position of text from top
		"textSize":"60px",//font size of the text
                "position": "center",
                "margin-top": "0%"
		});
});

 $(document).ready(function() {
    $('.carousel').carousel({
      interval: 6000
    });
    
  });
  function dibujarSlider(data){
    $("#ajSlider").html("");
    for (var i =0; i < data.lenght; i++) {
        var dir = data[i].url;
        $("#ajSlider").append("<img src= "+ dir + "></img>");
        $("#ajSlider").append("<a></a>");
    }
 
}

  
 function show(id){
    document.getElementById(id).style.display = "block";
};

$('.SeeMore2').click(function(){
    var $this = $(this);
    $this.toggleClass('SeeMore2');
    if($this.hasClass('SeeMore2')){
            $this.text('Leer Más');			
    } else {
            $this.text('Leer Menos');
    }
});

function mostrarSlider() {
    $.ajax({
        url: '/mediaServlet',
        data: {
            accion: "slider"
        },
        error: function () { //si existe un error en la respuesta del ajax
            alert("Se presento un error a la hora de cargar la información de las imagenes en la base de datos");
        },
        success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
            dibujarSlider(data);
            // se oculta el modal esta funcion se encuentra en el utils.js
        },
        type: 'POST',
        dataType: "json"
    });
}