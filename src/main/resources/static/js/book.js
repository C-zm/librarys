function changeBook (bid) {
    $.ajax({
        url:"getBookManageById",
        data:{bid},
        success:function (data) {
            $("#editbid").val(data.bid);
            $("#editbname").val(data.bname);
            $("#editbsrc").val(data.bsrc);
            $("#editbprice").val(data.bprice);
            $("#editinventory").val(data.inventory);
            $("#editbtype").val(data.btype);
        }
    })
}
function deleteBook(bid){
    if(confirm('确定要删除该书本吗？')){
        $.get("deleteBookManage",{"bid":bid},function(data){
            if(data=="OK"){
                window.location.reload();
            }
            else{
                alert("删除书本失败！");
                window.location.reload();
            }
        });
    }
}