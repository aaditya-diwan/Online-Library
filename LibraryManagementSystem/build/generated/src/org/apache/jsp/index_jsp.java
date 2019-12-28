package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("\n");
      out.write(".box h2{\n");
      out.write("    margin: 0;\n");
      out.write("    padding-bottom:10px;\n");
      out.write("    color: #fff;\n");
      out.write("    text-align:center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box .inputBox{\n");
      out.write("\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box .inputBox input{\n");
      out.write("     width: 100%;\n");
      out.write("     padding: 10px 0;\n");
      out.write("     font-size: 16px;\n");
      out.write("     color: #fff;\n");
      out.write("     margin-bottom: 30px;\n");
      out.write("     border: none;\n");
      out.write("     border-bottom: 1px solid #fff;\n");
      out.write("     outline: none;\n");
      out.write("     background: transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box .inputBox label\n");
      out.write("{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    padding: 10px 0;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: #fff;\n");
      out.write("    pointer-events: none;\n");
      out.write("    transition: 1s;\n");
      out.write("} \n");
      out.write("\n");
      out.write(".box .inputBox input:focus ~ label,\n");
      out.write(".box .inputBox input:valid ~ label\n");
      out.write("{\n");
      out.write("    top: -18px;\n");
      out.write("    left: 0;\n");
      out.write("    color: #03a9f4;\n");
      out.write("    font-size: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("    background: transparent;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    color: #fff;\n");
      out.write("    background: #03a9f4;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".box{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 10%;\n");
      out.write("    left: 20%;\n");
      out.write("    transform: translate(-50%,50%);\n");
      out.write("    width: 400px;\n");
      out.write("    padding: 40px;\n");
      out.write("    background: rgba(0,0,0,.8);\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    box-shadow: 0 15px 25px rgba(0,0,0,.5);\n");
      out.write("    border-radius:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    background-image:url(\"images/photo-1.jpg\") ;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-attachment: fixed;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("<div class=\"box\">\n");
      out.write("\n");
      out.write("  <h2>Login</h2>\n");
      out.write("  <form action=\"Controller\" method=\"post\">\n");
      out.write("\n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("                <input type=\"text\"  name=\"uname\" required=\"\">\n");
      out.write("                <label> Username </label>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("                <input type=\"password\" name=\"psw\" required=\"\">\n");
      out.write("                <label>Password</label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("                <input type=\"submit\" name=\"\" value=\"Submit\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
