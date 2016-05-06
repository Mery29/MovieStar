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