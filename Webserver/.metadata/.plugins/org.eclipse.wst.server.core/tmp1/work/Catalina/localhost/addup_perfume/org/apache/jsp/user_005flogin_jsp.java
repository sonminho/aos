/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2017-11-30 05:32:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Addup 사용자 로그인</title>\r\n");
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
      out.write("\r\n");
      out.write("#container{\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tpadding-bottom:550px;\r\n");
      out.write("\t*zoom: 1;\r\n");
      out.write("}\r\n");
      out.write("#container:after{\r\n");
      out.write("\tcontent:'';\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tclear:both;\r\n");
      out.write("}\r\n");
      out.write("#content{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("\ttop:100px;\r\n");
      out.write("\tleft:450px;\r\n");
      out.write("\twidth:600px;\r\n");
      out.write("\theight:900px;\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("}\r\n");
      out.write("#content form{\r\n");
      out.write("\tpadding:120px;\r\n");
      out.write("\twidth:250px;\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("}\r\n");
      out.write("#content input{\r\n");
      out.write("\tmargin-top:30px;\r\n");
      out.write("\tmargin-bottom:10px;\r\n");
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
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction loginCheck() {\r\n");
      out.write("\t\tif(document.frm.id.value.length == 0) {\r\n");
      out.write("\t\t\talert(\"아이디를 입력해주세요\");\r\n");
      out.write("\t\t\tfrm.id.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(document.frm.pw.value.length == 0) {\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력해주세요\");\r\n");
      out.write("\t\t\tfrm.pw.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
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
      out.write("\t\t\t\t<dd><a href=\"#\">Man</a></dd>\r\n");
      out.write("\t\t\t\t<dd><a href=\"#\">Woman</a></dd>\r\n");
      out.write("\t\t\t\t<dd><a href=\"#\">Perfume</a></dd>\r\n");
      out.write("\t\t\t\t<dd><a href=\"#\">Eau de perfume</a></dd>\r\n");
      out.write("\t\t\t\t<dd><a href=\"#\">Eau de cologne</a></dd>\r\n");
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
      out.write("\t\t\t<form name=\"frm\" action=\"ControllerServlet?command=user_login\" method=\"post\">\r\n");
      out.write("\t\t\t\t아이디&nbsp; &nbsp;&nbsp; &nbsp;<input type=\"text\" name=\"id\"><br>\r\n");
      out.write("\t\t\t\t비밀번호&nbsp; &nbsp;<input type=\"password\" name=\"pw\"><br>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" onclick=\"return loginCheck();\"value=\"로그인\" style=\"width:240px;\">\r\n");
      out.write("\t\t\t\t<button style=\"width:240px\">회원가입</button>\r\n");
      out.write("\t\t\t</form>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /user_login.jsp(4,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uLogin == 1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
