/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-12-13 11:32:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write('\r');
      out.write('\n');

	String user_id = (String)request.getSession().getAttribute("uLogin");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Addup 향수</title>\r\n");
      out.write("<style>\r\n");
      out.write("html, body{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:100%;\r\n");
      out.write("}\r\n");
      out.write("#wrap{\r\n");
      out.write("\twidth:1400px;\r\n");
      out.write("\theight:100%;\r\n");
      out.write("\tmargin:0px auto;\r\n");
      out.write("}\r\n");
      out.write("body > #wrap{\r\n");
      out.write("\theight:auto;\r\n");
      out.write("\tmin-height:100%;\r\n");
      out.write("}\r\n");
      out.write("#header{\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tpadding-bottom:70px;\r\n");
      out.write("\tborder-bottom:1px solid #cccccc;\r\n");
      out.write("}\r\n");
      out.write(".logo{\r\n");
      out.write("\tpadding: 32px 0 12px 40px;\r\n");
      out.write("}\r\n");
      out.write(".logo img{\r\n");
      out.write("\tmargin-top:30px;\r\n");
      out.write("}\r\n");
      out.write(".topnav{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tright:30px;\r\n");
      out.write("\ttop:2px;\r\n");
      out.write("}\r\n");
      out.write(".topnav dd{\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\tpadding-right:11px;\r\n");
      out.write("\tmargin-right:10px;\r\n");
      out.write("}\r\n");
      out.write(".topnav dd a{\r\n");
      out.write("\tcolor:black;\r\n");
      out.write("\tfont-size:1.1em;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("}\r\n");
      out.write(".topnav dd a:hover{\r\n");
      out.write("\tcolor:gray;\r\n");
      out.write("\ttext-decoration:underline;\r\n");
      out.write("}\r\n");
      out.write("#mainnav{\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tpadding-top:30px;\r\n");
      out.write("\tpadding-left:50px;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("}\r\n");
      out.write("#mainnav dl{\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tfont:'Nanum Gothic', sans-serif;\r\n");
      out.write("\tmargin-top:10px;\r\n");
      out.write("\tmargin-bottom:36px;\r\n");
      out.write("}\r\n");
      out.write("#mainnav dt{\r\n");
      out.write("\tcolor:black;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tfont-size:16px;\r\n");
      out.write("}\r\n");
      out.write("#mainnav dt a{\r\n");
      out.write("\tcolor:black;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#mainnav dt a:hover{\r\n");
      out.write("\tcolor:gray;\r\n");
      out.write("\ttext-decoration:line-through;\r\n");
      out.write("}\r\n");
      out.write("#mainnav dd{\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tmargin-top:15px;\r\n");
      out.write("}\r\n");
      out.write("#mainnav dd a{\r\n");
      out.write("\tcolor:black;\r\n");
      out.write("\tfont-size:0.9em;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#mainnav dd a:hover{\r\n");
      out.write("\tcolor:gray;\r\n");
      out.write("\ttext-decoration:underline;\r\n");
      out.write("}\r\n");
      out.write("#container{\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tpadding-bottom:440px;\r\n");
      out.write("\t*zoom: 1;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("#container:after{\r\n");
      out.write("\tcontent:'';\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tclear:both;\r\n");
      out.write("}\r\n");
      out.write("#content{\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tleft:150px;\r\n");
      out.write("\tpadding:30px;\r\n");
      out.write("}\r\n");
      out.write("#content img{\r\n");
      out.write("\tmargin-left:90px;\r\n");
      out.write("\twidth:1000px;\r\n");
      out.write("}\r\n");
      out.write("#footer{\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tmargin-top:-101px;\r\n");
      out.write("\tbackground-color:#fff;\r\n");
      out.write("}\r\n");
      out.write("#footer .footerArea{\r\n");
      out.write("\tborder-top: 1px solid #cccccc;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\twidth: 1400px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\tmargin: 0 auto;\t\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\tfont-size: 0.9em;\r\n");
      out.write("\t*zoom: 1;\r\n");
      out.write("}\r\n");
      out.write("#footer .footerArea:after{\r\n");
      out.write("\tcontent: '';\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tclear: both;\t\r\n");
      out.write("}\r\n");
      out.write("#footer .copy{\r\n");
      out.write("\tmargin-left:38%;\r\n");
      out.write("\tfont-family: 'Nanum Gothic', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<h1 class=\"logo\"><a href=\"index.jsp\"><img src=\"img/logo.png\"/></a></h1>\t\r\n");
      out.write("\t\t<dl class=\"topnav\">\r\n");
      out.write("\t\t\t<dd><a href=\"user_login.jsp\">\r\n");
      out.write("\t\t\t");

				if(user_id == null) {
			
      out.write("\t\tlogin\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print( user_id );
      out.write("님 로그인\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"ControllerServlet?command=logout\">");
 if(user_id != null) 
      out.write("log out</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"#\">");
 if(user_id != null) 
      out.write("my page</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"#\">");
 if(user_id != null) 
      out.write("cart</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"ControllerServlet?command=user_order_list\">");
 if(user_id != null) 
      out.write("order</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"manager_login.jsp\">");
 if(user_id==null) 
      out.write("manager</a></dd>\r\n");
      out.write("\t\t</dl>\r\n");
      out.write("\t</div> <!-- header -->\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<div id=\"mainnav\">\r\n");
      out.write("\t\t\t<dl class=\"category_about_us\">\r\n");
      out.write("\t\t\t\t<dt><a href=\"#\">about us</a></dt>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl class=\"category_shop\">\r\n");
      out.write("\t\t\t\t<dt><a href=\"#\">shop</a></dt>\r\n");
      out.write("\t\t\t\t<dd><a href=\"ControllerServlet?command=product_list&category=man\">Man</a></dd>\r\n");
      out.write("\t\t\t\t<dd><a href=\"ControllerServlet?command=product_list&category=woman\">Woman</a></dd>\r\n");
      out.write("\t\t\t\t<dd><a href=\"ControllerServlet?command=product_list2&category=perfume\">Perfume</a></dd>\r\n");
      out.write("\t\t\t\t<dd><a href=\"ControllerServlet?command=product_list2&category=eaudeperfume\">Eau de perfume</a></dd>\r\n");
      out.write("\t\t\t\t<dd><a href=\"ControllerServlet?command=product_list2&category=eaudecologne\">Eau de cologne</a></dd>\r\n");
      out.write("\t\t\t\t<dd><a href=\"#\">Recommend</a></dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl class=\"category_community\">\r\n");
      out.write("\t\t\t\t<dt><a href=\"#\">community</a></dt>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl class=\"category_qna\">\r\n");
      out.write("\t\t\t\t<dt><a href=\"#\">Q & A</a></dt>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t</div> <!-- mainnav -->\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<h1>\r\n");
      out.write("\t\t\t\t<img src=\"img/main_img.png\"/>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<h1>\r\n");
      out.write("\t\t\t\t<img src=\"img/main_img2.png\"/>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> <!-- container -->\r\n");
      out.write("</div> <!-- wrap -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<div class=\"footerArea\">\r\n");
      out.write("\t\t<p class=\"copy\">\r\n");
      out.write("\t\t\t&copy; Copyright WebServer Programming Project <br>\r\n");
      out.write("\t\t\t&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Team 8 Sonminho, Leewujin <br>\r\n");
      out.write("\t\t\t&nbsp; &nbsp; &nbsp; &nbsp;Contact us smin2846@gmail.com\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
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
