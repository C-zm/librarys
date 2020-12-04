<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Glance Design Da${pageContext.request.contextPath}/shboard an Admin Panel Category Flat Bootstrap Responsive Website Template | 500 error page :: w3layouts</title>
    <link href="${pageContext.request.contextPath}/css/mainStyle.css" rel='stylesheet' type='text/css'/>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/mainjs.js"></script>
    <script src="${pageContext.request.contextPath}/js/swiper.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .big{
            left: 10%;

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
            <a href="../sysuser/showSysuser">
                用户管理
            </a>
        </li>
        <li>
            <a href="../book/showBookManageLimit?page=1">
                图书管理
            </a>
        </li>
        <li>
            <a href="showSwiperManage" style="color:#fff;background:#1e282c;border-left-color:#3c8dbc;">
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
                        <td>轮播图编号</td>
                        <td>图片</td>
                        <td>状态</td>
                        <td>操作</td>
                    </tr>

                    <c:forEach items="${swiperList}" var="Swiper">
                        <tr>
                            <td><input type="checkbox" name="Swiperidarray" value="${Swiper.swiperid}" /></td>
                            <td>${Swiper.swiperid}</td>
                            <td>${Swiper.swiperid}</td>
                            <td>
                                <div onmouseover="big('${Swiper.swipersrc}')" onmouseout="small()">
                                    <img src="${Swiper.swipersrc}" style="width: 150px;height: 20px">
                                </div>
                                <div id="changepic" class="small">
                                    <img id="pic" src=" ">
                                </div>
                            </td>
                            <td>
                                <input id="${Swiper.swiperid}" type="button" onclick="changeSwiperState('${Swiper.swiperid}','${Swiper.isuse}')"/>
                                <script>
                                    var isuse = '${Swiper.isuse}';
                                    if (isuse == 'true'){
                                        document.getElementById("${Swiper.swiperid}").className = "update_btn0";
                                        document.getElementById("${Swiper.swiperid}").value="启用中";
                                    }
                                    else  {
                                        document.getElementById("${Swiper.swiperid}").className = "update_btn1";
                                        document.getElementById("${Swiper.swiperid}").value="禁用中";
                                    }
                                </script>
                            </td>
                            <td>
                                <a onclick="changeSwiper('${Swiper.swiperid}')" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#changeSwiper" style="padding: 2px 6px;font-size: 12px;margin-bottom: 2px;">
                                    修改
                                </a>
                                <a href="#" class="btn btn-danger btn-xs"  onclick="deleteSwiper('${Swiper.swiperid}')">删除</a></td>
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
<div class="modal fade" id="changeSwiper" tabindex="-1" role="dialog" aria-labelledby="changeswiperById" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×
                </button>
                <h4 class="modal-title" id="changeswiperById">
                    修改轮播图信息
                </h4>
            </div>
            <form class="form-horizontal" id="updateSwiperManageForm" action="updateSwiperManage">
                <div class="modal-body" style="height: 100%; ">

                    <div class="form-group" >
                        <label  >
                            轮播图编号：
                        </label>
                        <div   >
                            <input size="45" type="text" class="form-control" id="editswiperid" placeholder="轮播图编号" name="swiperid" readonly/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            轮播图书号：
                        </label>
                        <div >
                            <input size="45"   type="text" class="form-control" id="editbid" placeholder="轮播图编号" name="bid"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            轮播图图片：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editswipersrc" placeholder="轮播图编号" name="swipersrc"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            轮播图状态：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editisuse" placeholder="轮播图编号" name="isuse"/>
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