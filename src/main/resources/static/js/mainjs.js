window.onload=function power() {
    let power = document.getElementById("roles").value;
    if (power == 1){
        document.getElementById('power').innerHTML='店员';
        document.getElementById("swiper").className = "lock";
        document.getElementById("swiper_src").src="../images/lock.png";
        document.getElementById("book").className = "lock";
        document.getElementById("book_src").src="../images/lock.png"
        document.getElementById("sysuser").className = "lock";
        document.getElementById("sysuser_src").src="../images/lock.png";
        document.getElementById("operation").style.display = "none";

    }
    else if (power == 2){

        document.getElementById('power').innerHTML='经理'
        document.getElementById("sysuser").className = "lock";
        document.getElementById("sysuser_src").src="../images/lock.png";
    }
    else if (power == 3){
        document.getElementById('power').innerHTML='系统管理员'
    }


}

function search() {
    var search = document.getElementById("search").value;
    alert(search)
    window.location.href="#?a=" + search;
}


// 图片放大缩小
function big(src){
    document.getElementById("changepic").className = "big";
    document.getElementById("pic").src = src
}
function small(){
    document.getElementById("changepic").className = "small";
}


var c = 0
function showBook() {
    if(c % 2 == 0){
        document.getElementById("ul3").style.display = "block";
        c ++;
    }
    else {
        document.getElementById("ul3").style.display = "none";
        c ++;
    }
}


function toOrder() {
    location.href="../orderDetail/showOrderDetailManageLimit?page=1";
}

function toBook() {
    let power = document.getElementById("roles").value;
    if (power > 1){
        location.href="../book/showBookManageLimit?page=1";
    }
    else
        alert("您的权限不足，请联系您的上司")
}
function toSysuser() {
    let power = document.getElementById("roles").value;
    if (power > 2){
        location.href="../sysuser/showSysuser";
    }
    else
        alert("您的权限不足，请联系您的上司")
}
function toSwiper() {
    let power = document.getElementById("roles").value;
    if (power > 1){
        location.href="/swiper/showSwiperManage";
    }
    else
        alert("您的权限不足，请联系您的上司")
}