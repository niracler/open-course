<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>教师队伍-课程负责人</title>
    <meta charset="utf-8">
    <link rel="icon" href="/images/dgut.jpg">
    <link rel="stylesheet" type="text/css" href="/style/normal.css">
    <link rel="stylesheet" type="text/css" href="/style/teacherTeam/normal.css">
    <link rel="stylesheet" type="text/css" href="/style/teacherTeam/teacherTeamDetail.css">
    <script type="text/javascript" src="/js/normal.js"></script>
</head>
<body>
<div id="top">
    <jsp:include page="/html/top.jsp"/>
</div>

<article class="content">

    <section id="banner">
        <img src="/images/index/abouttop_03.jpg">
    </section>
    <section class="mainWrap relative">
        <div class="detailContent">
            <div class="column_1">
                <section class="leftNav">
                    <h3>教师队伍</h3>
                    <ul>
                        <li><a href="/teacherTeam?type=courseManager">课程负责人</a></li>
                        <li class="current"><a href="/teacherTeam?type=teacherTeam">课程教学团队</a></li>
                        <li><a href="/teacherTeam?type=lecturer">主讲教师</a></li>
                        <li><a href="/teacherTeam?type=trainingPlan">青年教师培养</a></li>
                    </ul>
                </section>
            </div>
            <div class="column_2 ">
                <article class="mainContent">
                    <header class="contentNav">
                        <nav class="nav">
                            <a href="/html/index.html">首页</a>·
                            <a href="/teacherTeam?type=courseManager">教师队伍</a>·
                            <a href="/teacherTeam?type=teacherTeam">课程教学团队</a>
                        </nav>
                        <h1>课程教学团队</h1>
                    </header>
                    <section class="article">
                         <ol>
                         													<c:forEach items="${teacherTeam }" var="teacher">
                         															<li><a href="/teacherTeam?type=teacherDetail&id=${teacher.id}">${teacher.teacher_name}</a></li>
                         													</c:forEach>
                      
                        </ol>

                       <!--  1、知识结构合理：课程组教师基本上都有民商法学学习背景，还有专门从事合同法学基本理论与实务的，大部分教师从事兼职律师和法律顾问工作，覆盖了合同法学的基础理论、具体制度及其实践领域，其中3人为博士，2人为硕士； 1人计算机专业本科毕业；

                        2、年龄结构显现梯队化：40-50岁的4人，30-40岁的1人，20-30岁的1人；

                        3、职称配置合理，学缘分布较广：有教授1人，副教授2人，讲师2人，助教1人，其中1人毕业于吉林大学，1人毕业于中国人民大学，2人毕业于西南政法大学，1人毕业于武汉大学，大多数部来自于国内知名法学院；

                        4、课程组分工明确，郑玉敏教授负责课程设计及总体规划，王平、韩中节主要负责法学专业合同法学教学，景春兰负责合同法学公选课教学和网站建设，王敬华负责非法学专业选修课，指导模拟法庭和实训方案设计，蔡贵峰负责网站制作和管理，辅导教师和实验教师与学生的比例平均为1：100。合同法学课程组已经形成一支职称、学历、年龄和知识结构科学合理的师资队伍；

                        5、双师型教师队伍，郑玉敏、王平、韩中节、景春兰为兼职律师，郑玉敏、王平、韩中节为仲裁员，具有丰富实践经验的双师型教师可以确保学生实践能力的培养所需要的实践经验和实践知识。

                        为建设好合同法精品课，景春兰、王敬华参加了国家和广东省精品课建设培训，并由郑玉敏、王平、韩中节、景春兰、王敬华、蔡贵峰组成了合同法学课程组。 -->

                    </section>

                </article>
            </div>
            <div class="column_3">
                <figure class="present">
                    <!--<img src="../images/teacherTeam/1.jpg" class="portrait">-->
                    <!--<figcaption style="text-align: center">校长</figcaption>-->
                    <!--<img src="../images/index/President-z.gif">-->
                </figure>
            </div>
        </div>
    </section>
</article>

<div id="bottom">
    <jsp:include page="/html/bottom.jsp"/>
</div>

<div id="copyrights">
    <jsp:include page="/html/bottom.jsp"/>
</div>
</body>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"type="text/javascript"></script>
</html>