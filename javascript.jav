

$(document).ready(function(){
    $(document).ready(function(){
        $(window).on('scroll', function(){
            if($(window).scrollTop()) {
                $('header').addClass('bgc');
            } else{
                $('header').removeClass('bgc');
            }
        })
    })
})