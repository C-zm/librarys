<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Glance Design Da${pageContext.request.contextPath}/shboard an Admin Panel Category Flat Bootstrap Responsive Website Template | 500 error page :: w3layouts</title>
    <link href="${pageContext.request.contextPath}/css/mainStyle.css" rel='stylesheet' type='text/css'/>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/mainjs.js"></script>
    <script src="${pageContext.request.contextPath}/js/sysuser.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .big{
            left: 40%;

        }
        .update_btn0{
            color: #fff;
            background-color: #337ab7;
            border-color: #2e6da4;
            border-radius: 15%;
        }

        .update_btn1{
            color: #fff;
            background-color: #d9534f;
            border-color: #d43f3a;
            border-radius: 15%;
        }
        .update_btn2{
            color: #fff;
            background-color: #20b743;
            border-color: #12b73f;
            border-radius: 15%;
        }
    </style>

</head>
<body >
<input type="hidden" id="roles" value="${sysuser.power}">
<div class="left">
    <div class="left_top"><a href="../index"><img src="../images/library.png" /><span class="fa fa-area-chart"></span> LIBRARY </a> </div>
    <div class="left_manage">library manage</div>
    <div class="header">MAIN NAVIGATION</div>
    <ul class="sidebar-menu">
        <li style="">
            <a  href="../orderDetail/showOrderDetailManageLimit?page=1" >
                订单管理
            </a>
        </li>
        <li>
            <a  onclick="showUser()"  style="color:#fff;background:#1e282c;border-left-color:#3c8dbc;"  href="#">
                用户管理
            </a>
            <ul style="display: none" id="ul2">
                <li>
                    <a href="../sysuser/showSysuser">全部</a>
                </li>
                <li>
                    <a href="../sysuser/getSysuserByPower?power=1">店员</a>
                </li>
                <li>
                    <a href="../sysuser/getSysuserByPower?power=2">经理</a>
                </li>
                <li>
                    <a href="../sysuser/getSysuserByPower?power=3">系统管理员</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="../book/showBookManageLimit?page=1">
                图书管理
            </a>
        </li>
        <li>
            <a href="../swiper/showSwiperManage" >
                轮播图管理
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
            <!--                <a href="#"><img src="chazhao%20.png" style="width: 25px"/></a>-->
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
                        <td>名字</td>
                        <td>头像</td>
                        <td>密码</td>
                        <td>电话</td>
                        <td>权力</td>
                        <td>操作</td>
                    </tr>

                    <c:forEach items="${sysuserList}" var="Sysuser">
                        <tr>
                            <td><input type="checkbox" name="Sysuseridarray" value="${Sysuser.sysid}" /></td>
                            <td>${Sysuser.sysid}</td>
                            <td>${Sysuser.sysname}</td>
                            <td>
                                <div onmouseover="big('${Sysuser.syssrc}')" onmouseout="small()">
                                    <img src="${Sysuser.syssrc}" style="width: 30px;height: 30px">
                                </div>
                                <div id="changepic" class="small">
                                    <img id="pic" src=" ">
                                </div>
                            </td>
                            <td><input type="password" value="${Sysuser.syspassword}" size="10" style="border: 0px"/></td>
                            <td>${Sysuser.sysphone}</td>
                            <td>
                                <span  id="${Sysuser.sysid}"></span>
<%--                                <input id="${Sysuser.sysid}" type="button" onclick="changeSysuser('${Sysuser.sysid}','${Sysuser.power}')"/>--%>
                                <script>
                                    var power = '${Sysuser.power}';
                                    if (power == 1){
                                        document.getElementById("${Sysuser.sysid}").innerHTML="店员";
                                    }
                                    else if(power == 2) {
                                        document.getElementById("${Sysuser.sysid}").innerHTML="经理";
                                    }
                                    else if(power == 3) {
                                        document.getElementById("${Sysuser.sysid}").innerHTML="管理员";
                                    }
                                </script>
                            </td>
                            <td>
                                <a onclick="changeSysuser('${Sysuser.sysid}')" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#changeSysuser" style="padding: 2px 6px;font-size: 12px;margin-bottom: 2px;">
                                    修改
                                </a>
                                <a href="#" class="btn btn-danger btn-xs"  onclick="deleteXySysuser('${Sysuser.sysid}')">删除</a></td>
                        </tr>
                    </c:forEach>
                </table>
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
<div class="modal fade" id="changeSysuser" tabindex="-1" role="dialog" aria-labelledby="changesysById" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×
                </button>
                <h4 class="modal-title" id="changesysById">
                    修改管理员信息
                </h4>
            </div>
            <form class="form-horizontal" id="updateSysuserForm" action="updateSysuser">
                <div class="modal-body" style="height: 100%; ">

                    <div class="form-group" >
                        <label  >
                            管理员编号：
                        </label>
                        <div   >
                            <input size="45" type="text" class="form-control" id="editsysid" placeholder="管理员编号" name="sysid" readonly/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            管理员名称：
                        </label>
                        <div >
                            <input size="45"   type="text" class="form-control" id="editsysname" placeholder="管理员编号" name="sysname"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            管理员图片：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editsyssrc" placeholder="管理员编号" name="syssrc"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>
                            管理员密码：
                        </label>
                        <div >
                            <input size="45"  type="password" class="form-control" id="editsyspassword" placeholder="管理员编号" name="syspassword" readonly/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            管理员电话：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editsysphone" placeholder="管理员编号" name="sysphone"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>
                            管理员职位：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editpower" placeholder="管理员编号" name="power"/>
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