/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-16 01:21:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/F:/IDEA/DearHouAimin/server/webapps/DearHouAimin/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1546872448000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>在线开放课程平台</title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<link rel=\"icon\" href=\"/images/dgut.jpg\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../style/normal.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../style/index/index.css\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"top\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/html/top.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"banner\">\r\n");
      out.write("\t\t<!--<div class=\"bannerImg\"><img src=\"../images/index/bigimg.jpg\">-->\r\n");
      out.write("\t\t\t<div class=\"summary\">\r\n");
      out.write("\t\t\t\t<div class=\"top\">首页•平台特色</div>\r\n");
      out.write("\t\t\t\t<div class=\"center\">平台特色</div>\r\n");
      out.write("\t\t\t\t<div class=\"bottom\">东莞理工学院位于松山湖畔，近几年来响应政府和国家的号召，进行高水平理工大学的建设。本平台展示了东莞理工学院这些年来的教学成果，提供给广大同学和老师进行交流和学习。</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"summary\">\r\n");
      out.write("\t\t<div class=\"summaryTitle\">在线开放课程平台</div>\r\n");
      out.write("\t\t<div class=\"summaryItem\">\r\n");
      out.write("\t\t\t<a class=\"item1\" href=\"/teacherTeam?type=courseManager\">\r\n");
      out.write("\t\t\t\t<img src=\"../images/index/about_03.jpg\">\r\n");
      out.write("\t\t\t\t<div class=\"itemTitle\">课程负责人</div>\r\n");
      out.write("\t\t\t\t<div class=\"itemDetail\">所有课程负责人的简要信息。</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a class=\"item2\" href=\"courseDetail-1.jsp\">\r\n");
      out.write("\t\t\t\t<img src=\"../images/index/about_05.jpg\">\r\n");
      out.write("\t\t\t\t<div class=\"itemTitle\">课程简介</div>\r\n");
      out.write("\t\t\t\t<div class=\"itemDetail\">课程的一些信息，如课程名称，学习内容，先修课程，学时学分等等。</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a class=\"item3\" href=\"courseDetail-2.jsp\">\r\n");
      out.write("\t\t\t\t<img src=\"../images/index/about_07.jpg\">\r\n");
      out.write("\t\t\t\t<div class=\"itemTitle\">课程特色</div>\r\n");
      out.write("\t\t\t\t<div class=\"itemDetail\">课程的特色和优势所在，具有怎样的竞争力。</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a class=\"item4\" href=\"leavenote.jsp\">\r\n");
      out.write("\t\t\t\t<img src=\"../images/index/about_12.jpg\">\r\n");
      out.write("\t\t\t\t<div class=\"itemTitle\">课程动态</div>\r\n");
      out.write("\t\t\t\t<div class=\"itemDetail\">记录下来的课程的开展之中一些活动、进展以及成果等等。</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a class=\"item5\" href=\"/teacherTeam?type=trainingPlan\">\r\n");
      out.write("\t\t\t\t<img src=\"../images/index/about13.jpg\">\r\n");
      out.write("\t\t\t\t<div class=\"itemTitle\">教师团队</div>\r\n");
      out.write("\t\t\t\t<div class=\"itemDetail\">展示我校强大的师资水平。</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a class=\"item6\" href=\"teachResDetail-1.jsp\">\r\n");
      out.write("\t\t\t\t<img src=\"../images/index/about14.jpg\">\r\n");
      out.write("\t\t\t\t<div class=\"itemTitle\">教学资源连接</div>\r\n");
      out.write("\t\t\t\t<div class=\"itemDetail\">给学生和老师提供丰富的教学资源，如：课程课件，教学录像，习题库，案例库等等。</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("    <!--滚动展示-->\r\n");
      out.write("    <div id=\"marquee\">\r\n");
      out.write("        <div class=\"marqueeTitle\">教师团队</div>\r\n");
      out.write("        <marquee direction=\"up\" scrollamount=\"3\" class=\"marqueeItem\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\">\r\n");
      out.write("            <b>殷建平</b>\t\t万人计划，国家级教学名师</br></br>\r\n");
      out.write("            <b>李耘</b>\t    \tIEEE Fellow，特聘教授</br></br>\r\n");
      out.write("            <b>刘向阳</b>\t\t长江学者特聘教授，百千万人才工程国家级人才，广东“珠江人才计划”科技领军人才</br></br>\r\n");
      out.write("            <b>袁华强</b>\t    享国务院特殊津贴专家，“千百十人才工程“国家级培养对象”</br></br>\r\n");
      out.write("            <b>于洪年</b>\t \tIEEE Fellow(柔性引进)</br></br>\r\n");
      out.write("            <b>毛续飞</b>\t \t学科方向领军人才</br></br>\r\n");
      out.write("        </marquee>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"bottom\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/html/bottom.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"copyrights\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/html/copyright.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
