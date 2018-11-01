$(function () {
    getData();
    setInterval("GetTime()", 1000);
    $('body').everyTime('8s', function() {
        switchWindow();
    });
    $('body').everyTime('6hs', function() {
        getData();
    });
})

function switchWindow() {
    var oneStatus= $("#one").is(":visible");
    var twoStatus= $("#two").is(":visible");
    var threeStatus= $("#three").is(":visible");
    if(oneStatus == true){
        two();
        return;
    }
    if(twoStatus == true){
        three();
        return;
    }
    if(threeStatus == true){
        one();
        return;
    }

}

function one(){
    var html = $("#one").html();
    if(html == ''){
        two();
        return;
    }
    $("#one").show();
    $("#two").hide();
    $("#three").hide();
}

function two() {
    var html = $("#two").html();
    if(html == ""){
        three();
        return;
    }
    $("#two").show();
    $("#one").hide();
    $("#three").hide();
}

function three() {
    var html = $("#three").html();
    if(html == ''){
        one();
        return;
    }
    $("#three").show();
    $("#two").hide();
    $("#one").hide();
}

function getData(){
    $.ajax({
        type:"POST",
        url:"/project/led/zhupei",
        success:function (res) {
            if(res.data == null) {
                return;
            }
            $("#one").html("");
            $("#two").html("");
            $("#three").html("");
            var t1 = "<table cellpadding='0' cellspacing='0' style='font-size: 18px;width: 100%;font-weight:normal;border-spacing:0px 1.5px;'>" +
                "<tr><td>货主类型</td><td>作业线</td><td>上线册数</td><td>上线品种</td><td>效率值</td><td>排名</td></tr>";
            for(var i = 0; i < (res.data.length > 8 ? 8 : res.data.length); i++ ){
                var data = res.data[i];
                t1 += "<tr><td>" + data.storer + data.type + "</td><td>" + data.ailid + "</td><td>" + data.sorqty + "</td><td>" + data.skucount + "</td><td>" + 00 + "</td><td>" + (i+1) + "</td></tr>"
            }

            t1  +=  "</table>";
            var t2 = "";
            if(res.data.length > 8){
                var t2 = "<table cellpadding='0' cellspacing='0' style='font-size: 18px;width: 100%;font-weight:normal;border-spacing:0px 1.5px;'>" +
                    "<tr><td>货主类型</td><td>作业线</td><td>上线册数</td><td>上线品种</td><td>效率值</td><td>排名</td></tr>";
                for(var i = 8; i < (res.data.length > 16 ? 16 : res.data.length); i++ ){
                    var data = res.data[i];
                    t2 += "<tr><td>" + data.storer + data.type + "</td><td>" + data.ailid + "</td><td>" + data.sorqty + "</td><td>" + data.skucount + "</td><td>" + 00 + "</td><td>" + (i+1) + "</td></tr>"
                }
            }
            var t3 = "";
            if(res.data.length > 16){
                var t2 = "<table cellpadding='0' cellspacing='0' style='font-size: 18px;width: 100%;font-weight:normal;border-spacing:0px 1.5px;'>" +
                    "<tr><td>货主类型</td><td>作业线</td><td>上线册数</td><td>上线品种</td><td>效率值</td><td>排名</td></tr>";
                for(var i = 16; i < (res.data.length > 24 ? 24 : res.data.length); i++ ){
                    var data = res.data[i];
                    t3 += "<tr><td>" + data.storer + data.type + "</td><td>" + data.ailid + "</td><td>" + data.sorqty + "</td><td>" + data.skucount + "</td><td>" + 00 + "</td><td>" + (i+1) + "</td></tr>"
                }
            }

            var sumqty = 0;
            var sumsku = 0;
            for(var j = 0; j < res.data.length ; j++){
                sumqty += res.data[j].sorqty;
                sumsku += res.data[j].skucount;
            }

            if(res.data.length < 8){
                t1 += "<tr><td colspan='2'>合计</td><td>" + sumqty + "</td><td> " + sumsku +"</td><td colspan='2'>&nbsp;</td></tr>";
            }else if (8 <= res.data.length < 16){
                t2 += "<tr><td colspan='2'>合计</td><td>" + sumqty + "</td><td> " + sumsku +"</td><td colspan='2'>&nbsp;</td></tr>";
            }else if(16 <= res.data.length < 24){
                t3 += "<tr><td colspan='2'>合计</td><td>" + sumqty + "</td><td> " + sumsku +"</td><td colspan='2'>&nbsp;</td></tr>";
            }

            $("#one").html(t1);
            $("#two").html(t2);
            $("#three").html(t3);
        },
        error:function(){
            alert("数据错误，联系管理员");
        }
    });
}



//获取时间并设置格式
function GetTime() {
    var mon, day, now, hour, min, ampm, time, str, tz, end, beg, sec;
    /*
    mon = new Array("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec");
    */
    mon = new Array("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月",
        "九月", "十月", "十一月", "十二月");
    /*
    day = new Array("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
    */
    day = new Array("周日", "周一", "周二", "周三", "周四", "周五", "周六");
    now = new Date();
    hour = now.getHours();
    min = now.getMinutes();
    sec = now.getSeconds();
    if (hour < 10) {
        hour = "0" + hour;
    }
    if (min < 10) {
        min = "0" + min;
    }
    if (sec < 10) {
        sec = "0" + sec;
    }
    $("#Timer").html(
        now.getFullYear() + "年" + (now.getMonth() + 1) + "月" + now.getDate() + "日" + "  " + hour + ":" + min + ":" + sec
    );
}

