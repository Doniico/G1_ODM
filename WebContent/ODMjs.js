$(document).ready(function() {
    var i = 0;
    $(".scrollList > li").each(function () {
          $(this).css("top", i);
          i += 175;
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
        { top: top - 60 },
        750,
        function () {
            window.scrollList($(this))
        }
    );
};

