$(document).ready(function() {
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
    })
  });

  
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


 $("#agregarUsuario").click(function () {
        agregarUsuario();
 });
 
 
 function enviar() {
    if (validar()) {
        //Se envia la información por ajax
        $.ajax({
            url: 'UsuariosServlet',
            data: {
                accion: $("#usuariosAction").val(),
                cedula: $("#user").val(),
                nombre: $("#nombre").val(),
                apellido1: $("#apellido1").val(),
                apellido2: $("#apellido2").val(),
                fechaNacimiento: $("#dpFechaNacimiento").data('date'),
                sexo: $("#sexo").val(),
                observaciones: $("#observaciones").val()
            },
            error: function () { //si existe un error en la respuesta del ajax
                mostrarMensaje("alert alert-danger", "Se genero un error, contacte al administrador (Error del ajax)", "Error!");
            },
            success: function (data) { //si todo esta correcto en la respuesta del ajax, la respuesta queda en el data
                var respuestaTxt = data.substring(2);
                var tipoRespuesta = data.substring(0, 2);
                if (tipoRespuesta === "C~") {
                    mostrarMensaje("alert alert-success", respuestaTxt, "Correcto!");
                    $("#myModalFormulario").modal("hide");
                    consultarPersonas();
                } else {
                    if (tipoRespuesta === "E~") {
                        mostrarMensaje("alert alert-danger", respuestaTxt, "Error!");
                    } else {
                        mostrarMensaje("alert alert-danger", "Se genero un error, contacte al administrador", "Error!");
                    }
                }

            },
            type: 'POST'
        });
    } else {
        mostrarMensaje("alert alert-danger", "Digite la información correcta", "Error!");
    }
   
}
 
 
 function validar() {
    var validacion = true;
    //Elimina estilo de error en los css
    //notese que es sobre el grupo que contienen el input
    $("#groupUser").removeClass("has-error");
    $("#groupPass").removeClass("has-error");
    $("#groupId").removeClass("has-error");
    $("#groupName").removeClass("has-error");
    $("#groupLastName").removeClass("has-error");
    $("#groupEmail").removeClass("has-error");
    $("#groupFecha").removeClass("has-error");
    $("#groupPhone").removeClass("has-error");
    $("#groupCelPhone").removeClass("has-error");
    $("#groupDireccion").removeClass("has-error");

    //valida cada uno de los campos del formulario
    //Nota: Solo si fueron digitados
    if (!testInputData("celphone", numbersOnly) || $("#celphone").val().length > 8) {
        $("#groupCelPhone").addClass("has-error");
        validacion = false;
    }
    
    if (!testInputData("phone", numbersOnly) || $("#phone").val().length > 8) {
        $("#groupPhone").addClass("has-error");
        validacion = false;
    }
    
    if (!testInputData("id", numbersOnly) || $("#id").val().length > 9) {
        $("#groupId").addClass("has-error");
        validacion = false;
    }
   
    if ($("#fname").val() === "" || $("#fname").val().length > 15) {
        $("#groupName").addClass("has-error");
        validacion = false;
    }
    
    if ($("#direccion").val() === "" || $("#direccion").val().length > 45) {  //lastname
        $("#groupDireccion").addClass("has-error");
        validacion = false;
    }
    
    if ($("#lname").val() === "" || $("#lname").val().length > 25) {  //lastname
        $("#groupLastName").addClass("has-error");
        validacion = false;
    }
    
    if ($("#user").val() === "" || $("#user").val().length > 15) {
        $("#groupUser").addClass("has-error");
        validacion = false;
    }
    
    if ($("#pass").val() === "" || $("#pass").val().length > 15) {
        $("#groupPass").addClass("has-error");
        validacion = false;
    }
    
    if ($("#email2").val() === "" || $("#email2").val().length > 15) {
        $("#groupEmail").addClass("has-error");
        validacion = false;
    }
    
    return validacion;
}


function testInputData(myfield, restrictionType) {
  var myData = document.getElementById(myfield).value;
  if(myData!==''){
   if(restrictionType.test(myData)){
    return true;
   }else{
     return false;
   }
  }
  return;
    
 }
 
 var numbersOnly = /^\d+$/;
 var numbersOnly = /^\d+$/;
 var decimalOnly = /^\s*-?[1-9]\d*(\.\d{1,2})?\s*$/;
 var uppercaseOnly = /^[A-Z]+$/;
 var lowercaseOnly = /^[a-z]+$/;
 var stringOnly = /^[A-Za-z0-9]+$/;
