
function changeSwiperState(swiperid,isuse) {
    if(isuse == "true"){
        isuse = false;
    }
    else {
        isuse = true
    }
    $.ajax({
        url:"updateSwiperManage",
        data:{swiperid,isuse},
        success:function(){
            location.reload()
        },
        error:function () {
            alert("出错")
        }

    })
}

function changeSwiper(swiperid) {
    $.ajax({
        url: "getSwiperManageBySwiperid",
        data: {swiperid},
        success:function (data) {
            $("#editswiperid").val(data.swiperid);
            $("#editbid").val(data.bid);
            $("#editswipersrc").val(data.swipersrc);
            $("#editisuse").val(data.isuse);
        }
    })
}


function deleteSwiper(swiperid) {
    if(confirm('确定要删除该订单吗？')){
        $.get("deleteSwiperManage",{"swiperid":swiperid},function(data){
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
