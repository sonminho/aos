/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-12-12 11:39:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.PlaceDAO;
import dto.*;
import java.util.*;

public final class tema_005fsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Eat it 맛과 즐거움</title>\r\n");
      out.write("<style>\r\n");
      out.write("\thtml, body{\r\n");
      out.write("\t\theight:100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tbody > .main_div{\r\n");
      out.write("\t\theight:auto;\r\n");
      out.write("\t\tmin-height:100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.main_div{\r\n");
      out.write("\t\twidth:1800px;\r\n");
      out.write("\t\theight:100%;\r\n");
      out.write("\t\tmargin:0px auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("   .top_nav {\r\n");
      out.write("      width:400px;\r\n");
      out.write("      height:40px;\r\n");
      out.write("      float:right;\r\n");
      out.write("      text-align:center;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .main_search {\r\n");
      out.write("   \t  clear:both;\r\n");
      out.write("   \t  width:800px;\r\n");
      out.write("      margin:0px auto;\r\n");
      out.write("      margin-top:50px;\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   .main_search input{\r\n");
      out.write("      vertical-align:30px;\r\n");
      out.write("      height:24px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .main_search select{\r\n");
      out.write("      vertical-align:28px;\r\n");
      out.write("      height:30px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .search_img {\r\n");
      out.write("      width:200px;\r\n");
      out.write("   }\r\n");
      out.write("      \r\n");
      out.write("   #main_category{\r\n");
      out.write("      width:1800px;\r\n");
      out.write("      margin:0px auto;\r\n");
      out.write("      text-align:center;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #container {\r\n");
      out.write("      width:100%;\r\n");
      out.write("      min-height:1200px;\r\n");
      out.write("      margin-top:30px;\r\n");
      out.write("      padding-bottom:30px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #side_bar{\r\n");
      out.write("   \t  display:block;\r\n");
      out.write("   \t  width:390px;\r\n");
      out.write("   \t  padding:40px;\r\n");
      out.write("   \t  padding-top:80px;\r\n");
      out.write("   \t  height:1020px;\r\n");
      out.write("   \t  font-family:\"Open Sans\", sans-serif\r\n");
      out.write("   \t  font-size: 1em;\r\n");
      out.write("   \t  background: #f1f1f1;\r\n");
      out.write("   \t  margin:0px auto;\r\n");
      out.write("   \t  float:left;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #side_bar nav {\r\n");
      out.write("   \t  font-size:0.875;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #side_bar nav ul {\r\n");
      out.write("   \t  margin:0;\r\n");
      out.write("   \t  padding:0;\r\n");
      out.write("   \t  width:380px;\r\n");
      out.write("   \t  list-style:none;\r\n");
      out.write("   \t  text-indent:10px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .menu {\r\n");
      out.write("   \t  margin-bottom:3px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .menu .main{\r\n");
      out.write("   \t  display:block;\r\n");
      out.write("   \t  height:70px;\r\n");
      out.write("   \t  line-height:70px;\r\n");
      out.write("   \t  text-indent:20px;\r\n");
      out.write("   \t  text-decoration:none;\r\n");
      out.write("   \t  background:gray;\r\n");
      out.write("   \t  color:#fff;\r\n");
      out.write("   \t  cursor: pointer;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .menu .main.on {\r\n");
      out.write("      background:red;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .menu .sub {\r\n");
      out.write("   \t  display:none;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .menu .sub li {\r\n");
      out.write("   \t  height:80px;\r\n");
      out.write("   \t  line-height:80px;\r\n");
      out.write("   \t  background:#fff;\r\n");
      out.write("   \t  border-top:1px solid #eaeaea;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .menu .sub li:first-child{\r\n");
      out.write("   \t  border-top:none;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .menu .sub li a {\r\n");
      out.write("   \t  display:block;\r\n");
      out.write("   \t  width:100%;\r\n");
      out.write("   \t  height:100%;\r\n");
      out.write("   \t  text-decoration: none;\r\n");
      out.write("   \t  text-indent:20px;\r\n");
      out.write("   \t  color:#555;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .menu .sub li a:hover{\r\n");
      out.write("   \t  background:#eaeaea;\r\n");
      out.write("   \t  color:#333;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #content{\r\n");
      out.write("   \t  display:block;\r\n");
      out.write("   \t  width:1300px;\r\n");
      out.write("   \t  float:right;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #content:after{\r\n");
      out.write("      clear:both;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .footer{\r\n");
      out.write("   \t   width:1800px;\r\n");
      out.write("\t   margin:0px auto;\r\n");
      out.write("\t   height:70px;\r\n");
      out.write("\t   padding:0;\r\n");
      out.write("\t   text-align:center;\r\n");
      out.write("\t   border-top:1px solid #cccccc;\r\n");
      out.write("\t   font-size:0.9em;\r\n");
      out.write("\t   color:#666;\r\n");
      out.write("\t   *zom:1;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   li{list-style:none;}\r\n");
      out.write("   \r\n");
      out.write("   a{color:#000; text-decoration:none;}\r\n");
      out.write("   \r\n");
      out.write("   #main_bar{\r\n");
      out.write("   \t\twidth:100%;\r\n");
      out.write("   \t\tmargin:0px auto;\r\n");
      out.write("   \t\tpadding-top:20px;\r\n");
      out.write("   }\r\n");
      out.write("  \r\n");
      out.write("   #main_bar:before, #main_after{\r\n");
      out.write("   \t\tcontent:\"\";\r\n");
      out.write("   \t\tdisplay:block;\r\n");
      out.write("   }\r\n");
      out.write("   #main_bar:after{\r\n");
      out.write("   \t\tclear:both;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #main_bar nav {\r\n");
      out.write("   \t\tfont-size: 1rem;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #main_bar nav > ul {\r\n");
      out.write("   \t\tmargin: 0;\r\n");
      out.write("   \t\tpadding: 0;\r\n");
      out.write("   \t\tlist-style: none;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #main_bar nav li {\r\n");
      out.write("   \t\tposition:relative;\r\n");
      out.write("   \t\tfloat:left;\r\n");
      out.write("   \t\twidth:450px;\r\n");
      out.write("   \t\theight:38px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #main_bar ul{\r\n");
      out.write("   \t\tmargin: 0;\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #main_bar nav li a {\r\n");
      out.write("   \t\tdisplay: block;\r\n");
      out.write("   \t\twidth:100%;\r\n");
      out.write("   \t\tline-height:38px;\r\n");
      out.write("   \t\ttext-align:center;\r\n");
      out.write("   \t\ttext-decoration:none;\r\n");
      out.write("   \t\tbackground:black;\r\n");
      out.write("   \t\tcolor:#fff;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #main_bar nav li a:hover, nav li a.on{\r\n");
      out.write("   \t\tbackground: gray;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #main_bar nav ul ul {\r\n");
      out.write("   \t\tdisplay: none;\r\n");
      out.write("   \t\tposition: absolute;\r\n");
      out.write("   \t\ttop:38px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #main_bar nav ul ul li a {\r\n");
      out.write("\t\tbackground: #fff;\r\n");
      out.write("\t\tcolor: #555;\r\n");
      out.write("\t\tborder-top: 1px solid #eaeaea;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#main_bar nav ul ul li:first-child a {\r\n");
      out.write("\t\tborder-top: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#main_bar nav ul ul li a:hover, .nav ul ul li a.on {\r\n");
      out.write("\t\tbackground: #eaeaea;\r\n");
      out.write("\t\tcolor: #333;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#content ul{\r\n");
      out.write("\t\tpadding:40px 50px;\r\n");
      out.write("\t\tbackground: gray;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#content ul li a{\r\n");
      out.write("\t\tfont-size:20px;\r\n");
      out.write("\t\tfont-family:\"Open Sans\", sans-serif;\r\n");
      out.write("\t\tcolor:#fff;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#content_list{\r\n");
      out.write("\t\tmargin-top:40px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#content_list{\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.1.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function() {\r\n");
      out.write("\tvar gnbA = $('#main_category>li>a');\r\n");
      out.write("\tvar ul = $('#main_category>li>ul');\r\n");
      out.write("\tgnbA.on(\"mouseenter focus\", function(){\r\n");
      out.write("\t\tif(gnbA.target){\r\n");
      out.write("\t\t\t$(gnbA.target).next().hide();\r\n");
      out.write("\t\t\t$(this).next().show();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$(this).next().show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tgnbA.target = this;\r\n");
      out.write("\t});\r\n");
      out.write("\tgnbA.mouseleave(function() {\r\n");
      out.write("\t\t$(this).next().hide();\r\n");
      out.write("\t});\r\n");
      out.write("\tul.hover(function(){\r\n");
      out.write("\t\t$(this).show();\r\n");
      out.write("\t}, function(){\r\n");
      out.write("\t\t$(this).hide();\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar index = 0;\r\n");
      out.write("\t\r\n");
      out.write("\twindow.onload = function() {\r\n");
      out.write("\t\tslideShow();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction slideShow() {\r\n");
      out.write("\t\tvar i;\r\n");
      out.write("\t\tvar x = document.getElementsByClassName(\"img_ad\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(i = 0; i<x.length; i++) {\r\n");
      out.write("\t\t\tx[i].style.display = \"none\";\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tindex++;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(index > x.length) {\r\n");
      out.write("\t\t\tindex = 1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tx[index-1].style.display = \"block\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tsetTimeout(slideShow, 2000);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\".sub\").hide();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\".main\").on(\"click\", function(){\r\n");
      out.write("\t\t\tif($(this).hasClass(\"on\") == false) {\r\n");
      out.write("\t\t\t\t$(\".main\").removeClass(\"on\");\r\n");
      out.write("\t\t\t\t$(this).addClass(\"on\");\r\n");
      out.write("\t\t\t\t$(\".sub\").slideUp(\"fast\");\r\n");
      out.write("\t\t\t\t$(this).next().slideDown(\"fast\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(this).removeClass(\"on\");\r\n");
      out.write("\t\t\t\t$(this).next().slideUp(\"fast\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$('#content_list tr:odd').css('background', '#F9F9F9');\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main_div\">\r\n");
      out.write("<table class=\"top_nav\">\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td><a href=\"login.jsp\">");
if((UserVO)session.getAttribute("uLogin") == null) {
      out.write("\t로그인     ");
}
      out.write("</a></td>\r\n");
      out.write("      <td><a href=\"join_main.jsp\">");
if((UserVO)session.getAttribute("uLogin") == null) {
      out.write("\t회원가입   ");
}
      out.write("</a></td>\r\n");
      out.write("      <td>마이페이지</td>\r\n");
      out.write("      <td><a href=\"ControllerServlet?command=cart_list\">즐겨찾기</a></td>\r\n");
      out.write("      <td><a href=\"ControllerServlet?command=user_logout\">로그아웃</a></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("</table><br>\r\n");
      out.write("<form class=\"main_search\">\r\n");
      out.write("   <a href=\"index.jsp\"><img class=\"search_img\" src=\"img/eat_it.jpg\"></a>\r\n");
      out.write("   <select>\r\n");
      out.write("   \t\t<option>지역 검색</option>\r\n");
      out.write("   \t\t<option>종류 검색</option>\r\n");
      out.write("   \t\t<option>테마 검색</option>\r\n");
      out.write("   </select>\r\n");
      out.write("   <input type=\"text\" size=\"50\">\r\n");
      out.write("   <input type=\"submit\" value=\"검색\" style=\"height:28px;\">\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<div id=\"main_bar\">\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t<ul id=\"main_category\">\r\n");
      out.write("\t\t<li class=\"m1\"><a href=\"#\">공지 사항</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"m2\"><a href=\"#\">지역 검색</a>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"ControllerServlet?command=place_location&location=nowongu\">노원구</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">광진구</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">강북구</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">영등포구</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"ControllerServlet?command=place_location&location=gangseogu\">강서구</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">강남구</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">마포구</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"m3\"><a href=\"#\">종류 검색</a>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"ControllerServlet?command=place_type&type=hansik\">한식</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"ControllerServlet?command=place_type&type=ilsik\">일식</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"ControllerServlet?command=place_type&type=joongsik\">중식</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"ControllerServlet?command=place_type&type=yangsik\">양식</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"m4\"><a href=\"#\">테마 검색</a>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"ControllerServlet?command=place_tema&tema=date\">데이트</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"ControllerServlet?command=place_tema&tema=family\">가족</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"ControllerServlet?command=place_tema&tema=bussiness\">비지니스</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">상견례</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("<br>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\t<div id=\"side_bar\">\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"menu\"><a class=\"main\" href=\"#\">공지 사항</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"menu\"><a class=\"main\" href=\"#\">지역 검색</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ControllerServlet?command=place_location&location=nowongu\">노원구</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">광진구</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">강북구</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">영등포구</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ControllerServlet?command=place_location&location=gangseogu\">강서구</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">강남구</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">마포구</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"menu\"><a class=\"main\" href=\"#\">종류 검색</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ControllerServlet?command=place_type&type=hansik\">한식</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ControllerServlet?command=place_type&type=ilsik\">일식</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ControllerServlet?command=place_type&type=joongsik\">중식</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ControllerServlet?command=place_type&type=yangsik\">양식</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"menu\"><a class=\"main\" href=\"#\">테마 검색</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ControllerServlet?command=place_tema&tema=date\">데이트</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ControllerServlet?command=place_tema&tema=family\">가족</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ControllerServlet?command=place_tema&tema=bussiness\">비지니스</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">상견례</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t</div> <!-- side bar -->\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t");
 ArrayList<PlaceVO> list = (ArrayList<PlaceVO>)request.getAttribute("place_list"); 
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"#\">");
      out.print( request.getAttribute("place_tema") );
      out.write(" 맛집 리스트</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div id=\"content_list\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t");

				for(PlaceVO pVo : list) {
			
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width:200px; padding:10px\"><img border=0 width=\"150px\" height=\"150px\" src=\"place_img/");
      out.print(pVo.getPlace_images() );
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"width:150px;\">");
      out.print( pVo.getPlace_name() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"width:560px;\"><a href=\"ControllerServlet?command=place_detail&place_number=");
      out.print(pVo.getPlace_number() );
      out.write('"');
      out.write('>');
      out.print( pVo.getPlace_content() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"width:200px;\">");
      out.print( pVo.getPlace_type() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"width:200px;\">");
      out.print( pVo.getPlace_hour() );
      out.write("</td>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div><!-- container -->\r\n");
      out.write("</div> <!-- main_div -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<br>\r\n");
      out.write("@Copyright Son, Oh, Lee \r\n");
      out.write("<br>\r\n");
      out.write("Advanced Web Programming Team7\r\n");
      out.write("</div>\r\n");
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