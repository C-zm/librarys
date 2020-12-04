<%--
  Created by IntelliJ IDEA.
  User: 陈志敏
  Date: 2020/7/9
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="${pageContext.request.contextPath}/css/login.css" rel='stylesheet' type='text/css'/>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
<body class="cbp-spmenu-push">
<div class="main-content">
    <div id="page-wrapper">
        <div class="main-page login-page ">
            <h2 class="title1">Login</h2>
            <div class="widget-shadow">
                <div class="login-body">
                    <form onsubmit="return check()"  name="checkLogin" action="/sysuser/submitLogin" method="post">
                        <input class="sysname" id = "sysname" name="sysname" type="text"  placeholder="Enter Your Name" required="" />
                        <input class="syspassword" type="password" id = "syspassword" name="syspassword" placeholder="Password" required="" />
                        <span style="color: red;margin-left: 140px;size: 24px;">${errmessage}</span>
                        <input type="submit" name="Sign In" value="Sign In">
                    </form>
                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>
