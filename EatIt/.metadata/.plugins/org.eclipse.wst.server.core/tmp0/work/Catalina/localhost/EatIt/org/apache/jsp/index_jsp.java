/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-12-16 12:51:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.UserVO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	UserVO uVo = (UserVO)session.getAttribute("uLogin");

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
      out.write("   .ad_img{\r\n");
      out.write("   \t  padding:30px;\r\n");
      out.write("   \t  width:1100px;\r\n");
      out.write("   \t  margin:0px auto;\r\n");
      out.write("   \t  \r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .ad_img img{\r\n");
      out.write("   \t\twidth:1150px;\r\n");
      out.write("   \t\theight:580px;\r\n");
      out.write("   \t\tmargin:0 auto;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .content{\r\n");
      out.write("   \t\twidth:100%;\r\n");
      out.write("   \t\theight:600px;\r\n");
      out.write("   \t\tpadding-bottom:50px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .content fieldset{\r\n");
      out.write("   \t\tmargin-top:20px;\r\n");
      out.write("   \t\twidth:800px;\r\n");
      out.write("   \t\theight:500px;\r\n");
      out.write("   \t\tfloat:left;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .content img{\r\n");
      out.write("   \t\twidth:800px;\r\n");
      out.write("   \t\theight:530px;\r\n");
      out.write("   \t\tmargin-left:120px\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .footer{\r\n");
      out.write("   \t   clear:both;\r\n");
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
      out.write("   \t\tmargin:0 auto;\r\n");
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
      out.write("   nav {\r\n");
      out.write("   \t\tfont-size: 1rem;\r\n");
      out.write("   }\r\n");
      out.write("   nav > ul {\r\n");
      out.write("   \t\tmargin: 0;\r\n");
      out.write("   \t\tpadding: 0;\r\n");
      out.write("   \t\tlist-style: none;\r\n");
      out.write("   }\r\n");
      out.write("   nav li {\r\n");
      out.write("   \t\tposition:relative;\r\n");
      out.write("   \t\tfloat:left;\r\n");
      out.write("   \t\twidth:450px;\r\n");
      out.write("   \t\theight:38px;\r\n");
      out.write("   }\r\n");
      out.write("   ul{\r\n");
      out.write("   \t\tmargin: 0;\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("   }\r\n");
      out.write("   nav li a {\r\n");
      out.write("   \t\tdisplay: block;\r\n");
      out.write("   \t\twidth:100%;\r\n");
      out.write("   \t\tline-height:38px;\r\n");
      out.write("   \t\ttext-align:center;\r\n");
      out.write("   \t\ttext-decoration:none;\r\n");
      out.write("   \t\tbackground:black;\r\n");
      out.write("   \t\tcolor:#fff;\r\n");
      out.write("   }\r\n");
      out.write("   nav li a:hover, nav li a.on{\r\n");
      out.write("   \t\tbackground: gray;\r\n");
      out.write("   }\r\n");
      out.write("   nav ul ul {\r\n");
      out.write("   \t\tdisplay: none;\r\n");
      out.write("   \t\tposition: absolute;\r\n");
      out.write("   \t\ttop:38px;\r\n");
      out.write("   }\r\n");
      out.write("   nav ul ul li a {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tcolor: #555;\r\n");
      out.write("\tborder-top: 1px solid #eaeaea;\r\n");
      out.write("\t}\r\n");
      out.write("\tnav ul ul li:first-child a {\r\n");
      out.write("\t\tborder-top: none;\r\n");
      out.write("\t}\r\n");
      out.write("\tnav ul ul li a:hover, .nav ul ul li a.on {\r\n");
      out.write("\t\tbackground: #eaeaea;\r\n");
      out.write("\t\tcolor: #333;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.scale {\r\n");
      out.write("\t  transform: scale(1);\r\n");
      out.write("\t  -webkit-transform: scale(1);\r\n");
      out.write("\t  -moz-transform: scale(1);\r\n");
      out.write("\t  -ms-transform: scale(1);\r\n");
      out.write("\t  -o-transform: scale(1);\r\n");
      out.write("\t  transition: all 0.3s ease-in-out;   /* 부드러운 모션을 위해 추가*/\r\n");
      out.write("\t}\r\n");
      out.write("\t.scale:hover {\r\n");
      out.write("\t  transform: scale(1.2);\r\n");
      out.write("\t  -webkit-transform: scale(1.2);\r\n");
      out.write("\t  -moz-transform: scale(1.2);\r\n");
      out.write("\t  -ms-transform: scale(1.2);\r\n");
      out.write("\t  -o-transform: scale(1.2);\r\n");
      out.write("\t}\r\n");
      out.write("\t.img {overflow:hidden }\r\n");
      out.write("\t.scale img{\r\n");
      out.write("\t\twidth:800px;\r\n");
      out.write("   \t\theight:530px;\r\n");
      out.write("   \t\tmargin:0 auto;\r\n");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main_div\">\r\n");
      out.write("<table class=\"top_nav\">\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td><a href=\"login.jsp\">\r\n");
      out.write("      ");

      		if((UserVO)session.getAttribute("uLogin") == null) {
      
      out.write("\t로그인     \r\n");
      out.write("      ");
	
      		} else {
      
      out.write("\r\n");
      out.write("      \t\t\t");
      out.print( uVo.getUser_id() );
      out.write("님 로그인\r\n");
      out.write("      ");

      		}
      
      out.write("\r\n");
      out.write("      </a></td>\r\n");
      out.write("      <td><a href=\"join_main.jsp\">");
if((UserVO)session.getAttribute("uLogin") == null) {
      out.write("\t회원가입   ");
}
      out.write("</a></td>\r\n");
      out.write("      <td>");
if((UserVO)session.getAttribute("uLogin") != null) {
      out.write("마이페이지");
} 
      out.write("</td>\r\n");
      out.write("      <td><a href=\"ControllerServlet?command=cart_list\">");
if((UserVO)session.getAttribute("uLogin") != null) {
      out.write("즐겨찾기");
} 
      out.write("</a></td>\r\n");
      out.write("      <td><a href=\"ControllerServlet?command=user_logout\">");
if((UserVO)session.getAttribute("uLogin") != null) {
      out.write("로그아웃");
} 
      out.write("</a></td>\r\n");
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
      out.write("\t<div class=\"ad_img\">\r\n");
      out.write("\t\t<img class=\"img_ad\" src=\"img/img3.png\"/>\r\n");
      out.write("\t\t<img class=\"img_ad\" src=\"img/img5.png\"/>\r\n");
      out.write("\t\t<img class=\"img_ad\" src=\"img/img6.png\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("<fieldset>\r\n");
      out.write("<legend>공지사항</legend>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("<TR vAlign=center align=left>\r\n");
      out.write("<TD><HEIGHT=30 width=\"12\" border=\"0\"></TD>\r\n");
      out.write("<TD width=\"100%\">\r\n");
      out.write("<TD><HEIGHT=30 width=\"8\" border=\"0\"></TD></TR>\r\n");
      out.write("<TR vAlign=top>\r\n");
      out.write("<TD>&nbsp;</TD>\r\n");
      out.write("<TD>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD bgColor=#ffffff>\r\n");
      out.write("<MARQUEE onmouseover=this.stop() style=\"WIDTH: 100%; HEIGHT: 100px\" onmouseout=this.start() scrollAmount=1 direction=up>\r\n");
      out.write("<DIV style=\"PADDING-RIGHT: 0px; OVERFLOW-Y: auto; PADDING-LEFT: 0px; OVERFLOW-X: hidden; PADDING-BOTTOM: 3px; WIDTH: 100%; PADDING-TOP: 3px\">\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD vAlign=top width=\"100%\">\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("<TBODY>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD height=20>&nbsp;<SPAN class=board style=\"FONT-SIZE: 14pt\">공릉동 조마루 감자탕 오픈 예정</SPAN></TD></TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD height=20>&nbsp;<SPAN class=board style=\"FONT-SIZE: 14pt\">족발야시장 이번달 맛집 선정</SPAN></TD></TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD height=20>&nbsp;<SPAN class=board style=\"FONT-SIZE: 14pt\">공지사항3</SPAN></TD></TR>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD height=20>&nbsp;<SPAN class=board style=\"FONT-SIZE: 14pt\">공지사항4</SPAN></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></DIV></MARQUEE></TD></TR></TBODY></TABLE></TD>\r\n");
      out.write("<TD>&nbsp;</TD></TR></TBODY></TABLE>\r\n");
      out.write("</fieldset><br>\r\n");
      out.write("<div class=\"img\">\r\n");
      out.write("<div class=\"scale\">\r\n");
      out.write("\t<img src=\"img/seoul.png\" usemap=\"#seoul_main\" >\r\n");
      out.write("\r\n");
      out.write("<map id=\"seoul_main\" name=\"seoul_main\">\r\n");
      out.write("<area shape=\"circle\" alt=\"강서구\" title=\"\" coords=\"142,260,24\" href=\"ControllerServlet?command=place_location&location=gangseogu\" target=\"_self\" />\r\n");
      out.write("<area shape=\"circle\" alt=\"은평구\" title=\"\" coords=\"319,152,21\" href=\"http://localhost:8080/jQuery/detail_page.html\" target=\"_self\" />\r\n");
      out.write("<area shape=\"circle\" alt=\"강남구\" title=\"\" coords=\"525,383,25\" href=\"http://localhost:8080/jQuery/detail_page.html\" target=\"_self\" />\r\n");
      out.write("<area shape=\"circle\" alt=\"동작구\" title=\"\" coords=\"352,370,18\" href=\"http://localhost:8080/jQuery/detail_page.html\" target=\"_self\" />\r\n");
      out.write("<area shape=\"circle\" alt=\"노원구\" title=\"\" coords=\"554,126,24\" href=\"ControllerServlet?command=place_location&location=nowongu\" target=\"_self\" />\r\n");
      out.write("</map>\r\n");
      out.write("</div></div>\r\n");
      out.write("</div> <!-- content -->\r\n");
      out.write("</div> <!-- main_div -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<br>\r\n");
      out.write("@Copyright Son, Oh, Lee \r\n");
      out.write("<br>\r\n");
      out.write("Advanced Web Programming Team7\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
