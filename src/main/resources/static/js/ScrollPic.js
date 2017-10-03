// JavaScript Document
(function ($) {
    $.fn.extend({
        slide: function (opt, callback) {
            //瀹氫箟鍙橀噺
            if (!opt) var opt = {};
            var timerID;
            var btnLeft = $("#" + opt.left); //鍚戝乏鎸夐挳
            var btnRight = $("#" + opt.right); //鍚戝彸鎸夐挳
            var _this = this.find("ul");
            liW = opt.li_w//鍙傛暟锛氭瘡涓猯i鐨勫搴︼紙鍖呮嫭border,margin,padding,閮借绠楄繘鍘伙級
            li_size = opt.li_size ? parseInt(opt.li_size, 10) : parseInt(this.width() / liW, 10)  //姣忔婊氬姩鐨勪釜鏁帮紝榛樿涓轰竴灞忥紝鍗崇埗瀹瑰櫒瀹藉害
            speed = opt.speed ? parseInt(opt.speed, 10) : 500; //婊氬姩閫熷害锛屾暟鍊艰秺澶э紝閫熷害瓒婃參锛堟绉掞級
            timer = opt.timer //?parseInt(opt.timer,10):3000; //婊氬姩鐨勬椂闂撮棿闅旓紙姣锛�
            if (li_size == 0) { li_size = 1 };
            var leftW = 0 - li_size * liW;
            //鍚戝乏婊氬姩鍑芥暟
            function scrollLeft() {
                btnLeft.unbind("click", scrollLeft); //婊戝姩鏃跺厛鍙栨秷鐐瑰嚮婊戝姩浜嬩欢
                btnRight.unbind("click", scrollRight);
                _this.animate({
                    marginLeft: leftW
                }, speed, "easeInOutQuint", function () { //鍙傛暟"easeOutExpo"涓嶉渶瑕佸彲浠ュ垹鎺夛紝闇€瑕佺殑璇濆繀閫夊厛鍔犺浇"easing.js"鏂囦欢
                    for (i = 1; i <= li_size; i++) {
                        _this.find("li:first").appendTo(_this);
                    }
                    _this.css({ 'margin-left': 0 });
                    btnLeft.bind("click", scrollLeft); //婊戝姩缁撴潫鍚庣粦瀹氭寜閽殑鐐瑰嚮浜嬩欢
                    btnRight.bind("click", scrollRight);
                });
            }
            //鍚戝彸婊氬姩鍑芥暟
            function scrollRight() {
                btnLeft.unbind("click", scrollLeft);
                btnRight.unbind("click", scrollRight);
                for (i = 1; i <= li_size; i++) {
                    _this.find("li:last").prependTo(_this);
                }
                _this.css({ 'margin-left': leftW });
                _this.animate({
                    marginLeft: 0
                }, speed, "easeInOutQuint", function () {
                    btnLeft.bind("click", scrollLeft);
                    btnRight.bind("click", scrollRight);
                });
            }
            //鑷姩鎾斁
            function autoPlay() {
                if (timer)
                    timerID = window.setInterval(scrollLeft, timer);
            };
            //鍋滄鑷姩鎾斁
            function autoStop() {
                if (timer)
                    window.clearInterval(timerID);
            };
            //榧犳爣浜嬩欢缁戝畾
            _this.hover(autoStop, autoPlay).mouseout() //鍔犺浇瀹屾垚鍚庤嚜鍔ㄥ紑濮�
            btnLeft.click(scrollLeft).hover(autoStop, autoPlay); //鍚戝乏榧犳爣浜嬩欢缁戝畾
            btnRight.click(scrollRight).hover(autoStop, autoPlay); //鍚戝彸榧犳爣浜嬩欢缁戝畾
        }
    })
})(jQuery);