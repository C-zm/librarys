<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Glance Design Da${pageContext.request.contextPath}/shboard an Admin Panel Category Flat Bootstrap Responsive Website Template | 500 error page :: w3layouts</title>
    <link href="${pageContext.request.contextPath}/css/mainStyle.css" rel='stylesheet' type='text/css'/>
    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/mainjs.js"></script>
    <script src="${pageContext.request.contextPath}/js/book.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body >
<input type="hidden" id="roles" value="${sysuser.power}">
<input type="hidden" id="count" value="${book_page}">
<div class="left">
    <div class="left_top"><a href="../index"><img src="../images/library.png" /><span class="fa fa-area-chart"></span> LIBRARY  </a></div>
    <div class="left_manage">library manage</div>
    <div class="header">MAIN NAVIGATION</div>
    <ul class="sidebar-menu">
        <li id="order">
            <a  href="#" onclick="toOrder()">
                <img id="order_src" src="">订单管理
            </a>
        </li>
        <li id="sysuser">
            <a   href="#" onclick="toSysuser()">
                <img id="sysuser_src" src="">用户管理
            </a>
        </li>
        <li>
            <a onclick="showBook()"   href="#" style="color:#fff;background:#1e282c;border-left-color:#3c8dbc;">
                图书管理
            </a>
            <ul style="display: none" id="ul3">
                <li>
                    <a href="#"> 全部</a>
                </li>
                <li>
                    <a href="#"> 计算机</a>
                </li>
                <li>
                    <a href="#">历史</a>
                </li>
                <li>
                    <a href="#">人文</a>
                </li>
                <li>
                    <a href="#">科学</a>
                </li>
            </ul>
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
                        <td>名称</td>
                        <td>图片</td>
                        <td>价格</td>
                        <td>库存</td>
                        <td>类型</td>
                        <td>操作</td>
                    </tr>

                    <c:forEach items="${bookList}" var="Book">
                        <tr>
                            <td><input type="checkbox" name="Dishidarray" value="${Book.bid}" /></td>
                            <td>${Book.bid}</td>
                            <td><input value="${Book.bname}" size="100" style="overflow:hidden; white-space:nowrap; text-overflow:ellipsis;border: 0;"/></td>
                            <td>
                                <div onmouseover="big('${Book.bsrc}')" onmouseout="small()">
                                    <img src="${Book.bsrc}" style="width: 15px">
                                </div>
                                <div id="changepic" class="small">
                                    <img id="pic" src=" ">
                                </div>
                            </td>
                            <td>${Book.bprice}</td>
                            <td>${Book.inventory}</td>
                            <td>${Book.btype}</td>
                            <td>
                                <a onclick="changeBook('${Book.bid}')" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#changeBook" style="padding: 2px 6px;font-size: 12px;margin-bottom: 2px;">
                                    修改
                                </a>
                                <a class="btn btn-danger btn-xs"  onclick="deleteBook('${Book.bid}')">删除</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div class="page_control">
                <c:forEach items="${pageList}" var="Page">
                    <a id="${Page.page}" href="${Page.page_href}">[${Page.page}]</a>
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
<div class="modal fade" id="changeBook" tabindex="-1" role="dialog" aria-labelledby="changebookById" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×
                </button>
                <h4 class="modal-title" id="changebookById">
                    修改书本信息
                </h4>
            </div>
            <form class="form-horizontal" id="updateBookManageForm" action="updateBookManage">
                <div class="modal-body" style="height: 100%; ">

                    <div class="form-group" >
                        <label  >
                            书本编号：
                        </label>
                        <div   >
                            <input size="45" type="text" class="form-control" id="editbid" placeholder="书本编号" name="bid" readonly/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            书本名称：
                        </label>
                        <div >
                            <input size="45"   type="text" class="form-control" id="editbname" placeholder="书本编号" name="bname"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            书本图片：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editbsrc" placeholder="书本编号" name="bsrc"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            书本价格：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editbprice" placeholder="书本编号" name="bprice"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            书本库存：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editinventory" placeholder="书本编号" name="inventory"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>
                            书本类型：
                        </label>
                        <div >
                            <input size="45"  type="text" class="form-control" id="editbtype" placeholder="书本编号" name="btype"/>
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