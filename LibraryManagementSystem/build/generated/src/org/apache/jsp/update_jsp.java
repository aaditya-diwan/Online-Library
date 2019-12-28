package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if(request.getParameter("submit")!=null)
    {
            String _id=request.getParameter("id");
            String _bookName=request.getParameter("bname");
            String _isbn=request.getParameter("isbn");
            String _bookno=request.getParameter("shelf");
            
            System.out.println(_id + " id here ");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wdproject","root","root");
            String Query="ALTER insertbook SET bname=?,isbn=?,bno=? WHERE id="+_id;
            PreparedStatement psm=conn.prepareStatement(Query);
            psm.setString(1, _bookName);
            psm.setString(2, _isbn);
            psm.setString(3, _bookno);
            psm.setString(4,_id);
            psm.executeUpdate();

      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    alert(\"Record Updated\");\n");
      out.write("</script>\n");
      out.write("\n");

    }
    

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Update Book</h1>\n");
      out.write("        <div class=\"row\" style=\"text-align: center;\">\n");
      out.write("            <div col-sm-3>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                \n");
      out.write("                    <form  method=\"POST\" action=\"InsertBooks\">\n");
      out.write("                        \n");
      out.write("                        ");

                            Connection conn;
                            PreparedStatement pst;
                            ResultSet rs;
                            
                            Class.forName("com.mysql.jdbc.Driver");
                            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wdproject","root","root");
                        
                            
                            String id=request.getParameter("id");
                            
                            pst=conn.prepareStatement("SELECT * FROM insertbook WHERE id=?");
                            pst.setString(1, id);
                            rs=pst.executeQuery();
                            
                            while(rs.next())
                            {
                            
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div alight=\"left\">\n");
      out.write("                            <label class=\"form-label\"><b>Book Name</b></label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Book Name\" name=\"bname\" id=\"bname\" value=\"");
      out.print( rs.getString("bname") );
      out.write("\" required>  \n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div alight=\"left\">\n");
      out.write("                            <label class=\"form-label\"><b>ISBN</b></label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"9789387944893\" name=\"isbn\" id=\"isbn\" value=\"");
      out.print( rs.getString("isbn") );
      out.write("\" required>  \n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div alight=\"left\">\n");
      out.write("                            <label class=\"form-label\"><b>Book-shelf Number</b></label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"8A\" name=\"shelf\" id=\"shelf\" value=\"");
      out.print( rs.getString("bno") );
      out.write("\" required>  \n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        ");

                            }
                        
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <div alight=\"right\">\n");
      out.write("                            <input type=\"submit\" id=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-info\">\n");
      out.write("                            <input type=\"reset\" id=\"reset\" value=\"reset\" name=\"reset\" class=\"btn btn-danger\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("             <div col-sm-3>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                               \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
