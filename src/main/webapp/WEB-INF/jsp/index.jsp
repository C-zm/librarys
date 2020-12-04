<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
    <html>
    <head>
        <title>Glance Design Dashboard an Admin Panel Category Flat Bootstrap Responsive Website Template | 500 error page :: w3layouts</title>
        <link href="${pageContext.request.contextPath}/css/mainStyle.css" rel='stylesheet' type='text/css'/>
        <link href="${pageContext.request.contextPath}/css/test.css" rel='stylesheet' type='text/css'/>
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/mainjs.js"></script>

    </head>
    <body>
    <input type="hidden" id="roles" value="${sysuser.power}">
        <div class="left">
            <div class="left_top"><a href="../index"><img src="../images/library.png" /> LIBRARY  </a></div>
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
                <li id="book">
                    <a  href="#" onclick="toBook()">
                        <img id="book_src" src="">图书管理
                    </a>
                    <ul style="display: none" id="ul3">
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
                        <div class="gonggao">

                        </div>
                        <div class="test test-1">
                            <div class="scrollbar">
                                <h1 style="text-align: center;">图书管理员须知</h1>
                                <h3>一、基本要求</h3>
                                <h4 style="font-weight: normal;line-height: 30px">
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;图书馆（室）负责人须具有图书馆专业知识。中学图书馆工作人员应具备大专以上文化程度，小学图书馆（室）工作人员应具备中专（含高中）以上文化程度，并具有基本的图书馆专业技能和计算机操作技能。图书馆（室）要设专职管理人员。图书馆（室）工作人员编制在本校教职工编制总数内合理确定。  
                                </h4>
                                <h3>二、工作职责</h3>
                                <h4 style="font-weight: normal;line-height: 30px">
                                    &nbsp;&nbsp;&nbsp;一、负责bai学校图书借阅及教育教du学资料的整理与保管责任。严格执行图书zhi室的规章制度，管dao理好图书室所有财物，保持室内的清洁卫生和良好秩序。    <br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;二、主动征求师生对图书工作的意见和要求。对新到图书要认真清点验收，及时校对登帐，发现欠缺要及时追补。做到手续清楚、书帐相符。  <br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;三、认真细致地做好书刊分类、编目、著录等，力求准确、规范。书库内各种书籍、报刊资料要分类装架，陈放合理。<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;四、及时裱糊、装修破旧图书、图表等资料，提高图书使用率，做好书库的防火、防盗、防蛀、防尘、防霉工作，确保图书安全。<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;五、 配合教导处排出学生借还书时间表，图书室按时开放，工作时间不擅离岗位。<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;六、建立健全全校师生的书刊外借、阅览、损失、赔偿各项规章，要建好图书总账及分类账，每学年结束，进行一次盘点，将全年图书总量和金额统计清楚，并及时填好报损表。<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;七、对学生进行爱护图书的道德品质教育，搞好图书介绍工作。严格执行借书规则，使之流通迅速，充分发挥图书作用。<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;八、搞好自身的业务进修，提高图书管理水平，及时总结管理经验。<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;九、完成学校交给的其它工作或临时性任务。<br>
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;十、认真完成学校布置的事务工作和临时性的工作。工作变动时，要办好交接手续。<br>
                                </h4>
                            </div>
                        </div>
<%--                        <div style=" overflow-y:auto; overflow-x:auto; width:400px; height:400px; background-color: red"></div>--%>
                    </div>

                </div>
            </div>
            <div class="right_bottom">
                <p>&copy; CZM Library</p>
            </div>
        </div>
    </body>
</html>