/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-12-05 15:37:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import dao.ProductDAO;
import dto.ProductVO;

public final class product_005flist2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
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
      out.write("a{\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor:#555;\r\n");
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
      out.write("\twidth:200px;\r\n");
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
      out.write("\twidth:100%;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tpadding-bottom:440px;\r\n");
      out.write("\theight:1100px;\r\n");
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
      out.write("\tfloat:right;\r\n");
      out.write("\tleft:150px;\r\n");
      out.write("\tpadding:30px;\r\n");
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
      out.write("#content{\r\n");
      out.write("\tpadding:20px 90px;\r\n");
      out.write("\tfloate:right;\r\n");
      out.write("\twidth:1150px;\r\n");
      out.write("}\r\n");
      out.write("#content ul{\r\n");
      out.write("\tpadding:30px 50px;\r\n");
      out.write("\tbackground: #f1f1f1;\r\n");
      out.write("\tlist-style:none;\r\n");
      out.write("}\r\n");
      out.write("#product_list{\r\n");
      out.write("\twidth:1200px;\r\n");
      out.write("\theight:600px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tmargin-top:60px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-3.1.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$('#product_list tr:odd').css('background', '#F9F9F9');\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<h1 class=\"logo\"><a href=\"index.jsp\"><img src=\"img/logo.png\"/></a></h1>\t\r\n");
      out.write("\t\t<dl class=\"topnav\">\r\n");
      out.write("\t\t\t<dd><a href=\"login.jsp\">login</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"#\">join us</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"#\">my page</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"#\">cart</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"#\">order</a></dd>\r\n");
      out.write("\t\t\t<dd><a href=\"manager_login.jsp\">manager</a></dd>\r\n");
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
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t");
 ArrayList<ProductVO> list = (ArrayList<ProductVO>)request.getAttribute("product_list"); 
      out.write("\r\n");
      out.write("\t\t\t\t<li>");
      out.print( list.get(0).getProductLevelCategory() );
      out.write(" 향수</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div id=\"product_list\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t");

				for(ProductVO pVo : list) {
			
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width:200px; padding:10px\">\r\n");
      out.write("\t\t\t\t\t");

							String imagePath = request.getContextPath() +"/upload_image/"
							+ pVo.getProductImage();
							System.out.println(imagePath + "이미지 경로");
							request.setAttribute("productVO", pVo);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print(imagePath );
      out.write("\" border=0 width=\"150px\" height=\"150px\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"width:300px;\"><a href=\"ControllerServlet?command=product_detail&product_number=");
      out.print( pVo.getProductNumber() );
      out.write('"');
      out.write('>');
      out.print( pVo.getProductName() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"width:400px;\">");
      out.print( pVo.getProductContent() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"width:220px;\">");
      out.print( pVo.getProductPrice() );
      out.write("원</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
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
