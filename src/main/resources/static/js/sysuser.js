function changeSysuser(sysid){
    $.ajax({
        url:"getSysuserById",
        data:{sysid},
        success:function (data) { 
            $("#editsysid").val(data.sysid);
            $("#editsysname").val(data.sysname);
            $("#editsyssrc").val(data.syssrc);
            $("#editsyspassword").val(data.syspassword);
            $("#editsysphone").val(data.sysphone);
            $("#editpower").val(data.power);
        },
        error:function () {
            alert("ccc")
        }
    })
}

var b = 0
function showUser() {
    if(b % 2 == 0){
        document.getElementById("ul2").style.display = "block";
        b ++;
    }
    else {
        document.getElementById("ul2").style.display = "none";
        b ++;
    }
}
function deleteXySysuser(sysid) {
    if(confirm('确定要删除该管理员吗？')){
        $.get("deleteSysuser",{"sysid":sysid},function(data){
            if(data=="OK"){
                window.location.reload();
            }
            else{
                alert("删除管理员失败！");
                window.location.reload();
            }
        });
    }
}