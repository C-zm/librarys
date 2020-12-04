<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Glance Design Da${pageContext.request.contextPath}/shboard an Admin Panel Category Flat Bootstrap Responsive Website Template | 500 error page :: w3layouts</title>
    <link href="${pageContext.request.contextPath}/css/mainStyle.css" rel='stylesheet' type='text/css'/>
    <link href="${pageContext.request.contextPath}/css/order.css" rel='stylesheet' type='text/css'/>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/mainjs.js"></script>
    <script src="${pageContext.request.contextPath}/js/order.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<input type="hidden" id="roles" value="${sysuser.power}">
<div class="left">
    <div class="left_top"><a href="../index"><img src="../images/library.png" /><span class="fa fa-area-chart"></span> LIBRARY  </a></div>
    <div class="left_manage">library manage</div>
    <div class="header">MAIN NAVIGATION</div>
    <ul class="sidebar-menu">
        <li style="color:#fff;background:#1e282c;border-left-color:#3c8dbc;">
            <a  onclick="showOrder()" style="color:#fff;background:#1e282c;border-left-color:#3c8dbc;" href="#">
                订单管理
            </a>
            <ul style="display: none" id="ul1">
                <li>
                    <a href="../orderDetail/showOrderDetailManageLimit?page=1">全部订单</a>
                </li>
                <li>
                    <a href="../orderDetail/getOrderDetailManageByState?state=0&page=1">未支付</a>
                </li>
                <li>
                    <a href="../orderDetail/getOrderDetailManageByState?state=1&page=1">待取书</a>
                </li>
                <li>
                    <a href="../orderDetail/getOrderDetailManageByState?state=2&page=1">待还书</a>
                </li>
                <li>
                    <a href="../orderDetail/getOrderDetailManageByState?state=3&page=1">已还书</a>
                </li>
                <li>
                    <a href="../orderDetail/getOrderDetailManageByState?state=4&page=1">逾期未还</a>
                </li>
            </ul>
        </li>
        <li id="sysuser" >
            <a href="#" onclick="toSysuser()">
                <img id="sysuser_src" src="">用户管理
            </a>
        </li>
        <li id="book">
            <a href="#" onclick="toBook()">
                <img id="book_src" src="">图书管理
            </a>
        </li>
        <li id="swiper">
            <a href="#" onclick="toSwiper()">
                <img id="swiper_src" src="">轮播图管理
            </a>
        </li>
    </ul>
    <div>

    </div>
</div>
<div class="right">
    <div class="right_top">
        <div class="search ">
            <input  placeholder="Search..." type="search" id="search" />
            <button onclick="search()" class="search_btn" type="submit"></button>
        </div>
        <div class="top_user">
            <img src="../images/czm.jpg">
        </div>
        <div class="user_info">
            <div class="sysname">${sysuser.sysname}</div>
            <div class="occupation">图书管理员：
                <span id="power"></span>
            </div>
        </div>
    </div>

    <div class="right_main">
        <div class="center">

            <div style="height: 15px"></div>
            <div>
                <!-- Table goes in the document BODY -->
                <table class="gridtable">
                    <tr>
                        <td>选择</td>
                        <td>编号</td>
                        <td>订单编号</td>
                        <td>名称</td>
                        <td>图片</td>
                        <td>数量</td>
                        <td>价格</td>
                        <td>状态</td>
                        <td id="operation" >操作</td>
                    </tr>


                    <c:forEach items="${orderList}" var="OrderDetail">
                        <tr>
                            <td><input type="checkbox" name="Dishidarray" value="${OrderDetail.odid}" /></td>
                            <td>${OrderDetail.odid}</td>
                            <td>${OrderDetail.oid}</td>
                            <td><input value="${OrderDetail.bname}" size="100" style="overflow:hidden; white-space:nowrap; text-overflow:ellipsis;border: 0;"/></td>
                            <td>
                                <div onmouseover="big('${OrderDetail.bsrc}')" onmouseout="small()" >
                                    <img src="${OrderDetail.bsrc}" style="width: 15px" >
                                </div>
                                <div id="changepic" class="small">
                                    <img id="pic" src=" ">
                                </div>
                            </td>
                            <td>${OrderDetail.num}</td>
                            <td>${OrderDetail.bprice}</td>
                            <td>
                                <input id="${OrderDetail.odid}" type="button" onclick="changeOrderState('${OrderDetail.odid}','${OrderDetail.state}')"/>
                                <script>
                                    var state = '${OrderDetail.state}';
                                    if (state == 0){
                                        document.getElementById("${OrderDetail.odid}").className = "update_btn0";
                                        document.getElementById("${OrderDetail.odid}").value="未支付";
                                    }
                                    else if (state == 1){
                                        document.getElementById("${OrderDetail.odid}").className = "update_btn1";
                                        document.getElementById("${OrderDetail.odid}").value="待取书";
                                    }
                                    else if (state == 2){
                                        document.getElementById("${OrderDetail.odid}").className = "update_btn2";
                                        document.getElementById("${OrderDetail.odid}").value="待还书";
                                    }
                                    else if (state == 3){
                                        // data-toggle="modal" data-target="#changeOrder"
                                        document.getElementById("${OrderDetail.odid}").className = "update_btn3";
                                        document.getElementById("${OrderDetail.odid}").value="已还书";
                                    }
                                    else {
                                        document.getElementById("${OrderDetail.odid}").className = "update_btn4";
                                        document.getElementById("${OrderDetail.odid}").value="逾期未还";
                                    }
                                    </script>
                            </td>
                            <td id="operation_detail${OrderDetail.odid}">
                                    <a onclick="changeOrder('${OrderDetail.odid}')" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#changeOrder" style="padding: 2px 6px;font-size: 12px;margin-bottom: 2px;">
                                        修改
                                    </a>
                                    <a class="btn btn-danger btn-xs"  onclick="deletOrder('${OrderDetail.odid}')">删除</a>
                                    <script>
                                        var power = '${sysuser.power}'
                                        var id = '${OrderDetail.odid}'
                                        if (power == 1) {
                                            document.getElementById('operation_detail'+id).style.display='none'
                                        }
                                    </script>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div class="page_control">
                <c:forEach items="${pageList}" var="Page">
                    <a id="${Page.page}"  href="${Page.page_href}">[${Page.page}]</a>
                </c:forEach>
            </div>
        </div>
    </div>
    <div class="right_bottom">
        <p>&copy; CZM Library</p>
    </div>
</div>

<div>

</div>

<!-- 模态框（Modal） -->
<div class="modal fade" id="changeOrder" tabindex="-1" role="dialog" aria-labelledby="changeOrderByOdid" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×
                </button>
                <h4 class="modal-title" id="changeOrderByOdid">
                    修改书本信息
                </h4>
            </div>
             <form class="form-horizontal" id="updateOrderDetailManageForm" action="updateOrderDetailManage">
                <div class="modal-body" style="height: 100%; ">

                    <div class="form-group" >
                        <label  >
                            编       号：
                        </label>
                        <div   >
                            <input size="45" type="text" class="form-control" id="editodid" placeholder="订单编号" name="odid" readonly/>
                        </div>
                    </div>

                    <div class="form-group" >
                        <label  >
                            订单编号：
                        </label>
                        <div   >
                            <input size="45" type="text" class="form-control" id="editoid" placeholder="订单编号" name="oid" readonly/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            订单名称：
                        </label>
                        <div >
                            <input size="45"   type="text" class="form-control" id="editbname" placeholder="订单编号" name="bname"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            订单图片：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editbsrc" placeholder="订单编号" name="bsrc"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            订单价格：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editbprice" placeholder="订单编号" name="bprice"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            订单数量：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editnum" placeholder="订单编号" name="num"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            订单状态：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editstate" placeholder="订单编号" name="state"/>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">
                        关闭
                    </button>
                    <button type="submit" class="btn btn-primary" >
                        提交更改
                    </button>
                </div>
            </form>


        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

</body>
</html>

<%--
 <form class="form-horizontal" id="updateOrderDetailManageForm" action="updateOrderDetailManage">
                <div class="modal-body" style="height: 100%; ">

                    <div class="form-group" >
                        <label  >
                            编       号：
                        </label>
                        <div   >
                            <input size="45" type="text" class="form-control" id="editodid" placeholder="订单编号" name="odid" readonly/>
                        </div>
                    </div>

                    <div class="form-group" >
                        <label  >
                            订单编号：
                        </label>
                        <div   >
                            <input size="45" type="text" class="form-control" id="editoid" placeholder="订单编号" name="oid" readonly/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            订单名称：
                        </label>
                        <div >
                            <input size="45"   type="text" class="form-control" id="editbname" placeholder="订单编号" name="bname"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            订单图片：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editbsrc" placeholder="订单编号" name="bsrc"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            订单价格：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editbprice" placeholder="订单编号" name="bprice"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            订单数量：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editnum" placeholder="订单编号" name="num"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            订单状态：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editstate" placeholder="订单编号" name="state"/>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">
                        关闭
                    </button>
                    <button type="submit" class="btn btn-primary" >
                        提交更改
                    </button>
                </div>
            </form>

--%>