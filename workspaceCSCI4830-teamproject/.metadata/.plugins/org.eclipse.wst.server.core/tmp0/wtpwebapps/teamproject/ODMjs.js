$(document).ready(function() {
    var i = 0;
    $(".scrollList > li").each(function () {
          $(this).css("top", i);
          i += 60;
          window.scrollList($(this));
    });
});

window.scrollList = function($elem) {
    var top = parseInt($elem.css("top"));
    var temp = -1 * $('.scrollList > li').height();
    if(top < temp) {
        top = $('.scrollList').height()
        $elem.css("top", top);
    }
    $elem.animate({ top: (parseInt(top)-60) }, 600, function () {
      window.scrollList($(this))
    });
}

