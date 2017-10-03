function getInner() {
    if (typeof window.innerWidth != 'undefined') {
        return {
            width: window.innerWidth,
            height: window.innerHeight
        }
    } else {
        if (document.compatMode == 'CSS1Compat') {
            return {
                width: document.documentElement.clientWidth,
                height: document.documentElement.clientHeight
            }
        } else {
            return {
                width: document.body.clientWidth,
                height: document.body.clientHeight
            }
        }

    }
}
var $banner = $(".banner");
var $bimg = $(".bimg");
var $header_top = $("#header_top");
var width;

$(window).bind('load', function () {
    width = getInner().width;
    if (width > 1550) {
        $bimg.show();
        $banner.hide();
        $header_top.removeClass("header").addClass("header_top");
    } else {
        $banner.show();
        $bimg.hide();
        $header_top.removeClass("header_top").addClass("header");
    }
})
$(window).resize(function () {
    width = getInner().width;
    if (width > 1550) {
        $bimg.show();
        $banner.hide();
        $header_top.removeClass("header").addClass("header_top");
    } else {
        $banner.show();
        $bimg.hide();
        $header_top.removeClass("header_top").addClass("header");
    }
});


//    var index;
//    var $span = $("p.bottom_title > span");
//    var $more = $("p.bottom_more > a");
//    var $div = $("div.bottom_news > div.bottom_list");
//    $span.click(function () {
//        index = $(this).index();
//        if (index == 0) {
//            $(this).removeClass("bottom_news_off").addClass("bottom_news_on");
//            $(this).siblings().removeClass("bottom_active_on").addClass("bottom_active_off");
//        } else {
//            $(this).removeClass("bottom_active_off").addClass("bottom_active_on");
//            $(this).siblings().removeClass("bottom_news_on").addClass("bottom_news_off");
//        }
//        $more.eq(index).show().siblings().hide();
//        $div.eq(index).show().siblings().hide();
//    });



//    var main_li = $(".main_list li");
//    var opcity = $(".opcity");
//    var pro_furi = $(".pro_furi");
//    var pro_jyri = $(".pro_jyri");
//    var pro_gjdz = $(".pro_gjdz");
//    var pro_frcp = $(".pro_frcp");
//    var pro_jycp = $(".pro_jycp");
//    var pro_frby = $(".pro_frby");

//    pro_furi.mousemove(function () {
//        $(".maojin").siblings(".opcity").show();
//        $(this).find("img").show();
//        pro_jyri.find("img").hide();
//        pro_gjdz.find("img").hide();
//    });
//    pro_jyri.mousemove(function () {
//        $(".maojin").siblings(".opcity").show();
//        $(this).find("img").show();
//        pro_furi.find("img").hide();
//        pro_gjdz.find("img").hide();
//    });
//    pro_gjdz.mousemove(function () {
//        $(".maojin").siblings(".opcity").show();
//        $(this).find("img").show();
//        pro_furi.find("img").hide();
//        pro_jyri.find("img").hide();
//    });

//    pro_frcp.mousemove(function () {
//        $(".chuangpin").siblings(".opcity").show();
//        $(this).find("img").show();
//        pro_jycp.find("img").hide();
//    });
//    pro_jycp.mousemove(function () {
//        $(".chuangpin").siblings(".opcity").show();
//        $(this).find("img").show();
//        pro_frcp.find("img").hide();
//    });
//    pro_frby.mousemove(function () {
//        $(this).find("img").show();
//    });

//    $(".maojin").mousemove(function () {
//        pro_furi.find("img").show();
//        pro_jyri.find("img").show();
//        pro_gjdz.find("img").show();
//    });
//    $(".chuangpin").mousemove(function () {
//        pro_frcp.find("img").show();
//        pro_jycp.find("img").show();
//    });
//    $(".buyi").mousemove(function () {
//        pro_frby.find("img").show();
//    });

//    main_li.mouseout(function () {
//        opcity.hide();
//        pro_furi.find("img").hide();
//        pro_jyri.find("img").hide();
//        pro_gjdz.find("img").hide();
//        pro_frcp.find("img").hide();
//        pro_jycp.find("img").hide();
//        pro_frby.find("img").hide();
//    });