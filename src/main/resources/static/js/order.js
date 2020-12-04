function changeOrderState(odid,state) {
    if (state < 3){
        state = parseInt(state)+ 1;
        $.ajax({
            url: "updateOrderDetailManage",
            data: {odid,state},
            success:function () {
                location.reload();
            }
        })
    }
    else if (state ==3){
        var a = confirm("确实未还书吗?")
        state = parseInt(state) - 1;
        if (a){
            $.ajax({
                url: "updateOrderDetailManage",
                data: {odid,state},
                success:function () {
                    location.reload();
                }
            })
        }
    }
    else if (state == 4){
        var a = confirm("确实已还书吗?")
        state = parseInt(state) - 1;
        if (a){
            $.ajax({
                url: "updateOrderDetailManage",
                data: {odid,state},
                success:function () {
                    location.reload();
                }
            })
        }
    }

}
function toPage(a) {
    url = window.location.href; /* 获取完整URL */
    // alert(url); /* http://127.0.0.1:8020/Test/index.html#test?name=test */
    var b = url.split("orderDetail/")
    var c = b[1].split("page")
    location.href=c[0] + 'page=' + a;
}
//  左边二级导航栏
var a = 0;
function showOrder() {
    if(a % 2 == 0){
        document.getElementById("ul1").style.display = "block";
        a ++;
    }
    else {
        document.getElementById("ul1").style.display = "none";
        a ++;
    }
}
function changeOrder (odid) {
    $.ajax({
        url:"getOrderDetailManageByOdid",
        data:{odid},
        success:function (data) {
            $("#editodid").val(data.odid);
            $("#editoid").val(data.oid);
            $("#editbname").val(data.bname);
            $("#editbsrc").val(data.bsrc);
            $("#editbprice").val(data.bprice);
            $("#editnum").val(data.num);
            $("#editstate").val(data.state);
        }
    })
}
function deletOrder(odid) {
    if(confirm('确定要删除该订单吗？')){
        $.get("deleteOrderDetailManage",{"odid":odid},function(data){
            if(data=="OK"){
                window.location.reload();
            }
            else{
                alert("删除订单失败！");
                window.location.reload();
            }
        });
    }
}