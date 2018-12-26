$(function() {
    var header = $(".content");
    $(window).scroll(function() {
      var scroll = $(window).scrollTop();

      if(scroll >= 100) {
        $(".navbar_trans").hide();
        $(".navbar_white").show();
      }
      else {
        $(".navbar_trans").show();
        $(".navbar_white").hide();
      }
    });
  });