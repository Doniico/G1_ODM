$(document).ready(function() {
    var i = 0;
    $(".scrollList > li").each(function () {
          $(this).css("top", i);
          i += 200;
          window.scrollList($(this));
    });
});

window.scrollList = function($elem) {
    var top = parseInt($elem.css("top"));
    var temp = -1 * $('.scrollList > li').height();
    if (top < temp) {
        top = $('.scrollList').height();
        $elem.css("top", top);
    }
    $elem.animate(
        { top: top - 75 },
        400,
        function () {
            window.scrollList($(this))
        }
    );
};

