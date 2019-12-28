<%-- 
    Document   : update.jsp
    Created on : 3 Dec, 2019, 6:59:14 AM
    Author     : Aaditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>


<%
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
%>

<script>
    alert("Record Updated");
</script>

<%
    }
    
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <h1>Update Book</h1>
        <div class="row" style="text-align: center;">
            <div col-sm-3>
                
            </div>
            <div class="col-sm-6">
                
                    <form  method="POST" action="InsertBooks">
                        
                        <%
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
                            
                        %>
                        
                        
                        <div alight="left">
                            <label class="form-label"><b>Book Name</b></label>
                            <input type="text" class="form-control" placeholder="Book Name" name="bname" id="bname" value="<%= rs.getString("bname") %>" required>  
                        </div>
                        <br>
                        <div alight="left">
                            <label class="form-label"><b>ISBN</b></label>
                            <input type="text" class="form-control" placeholder="9789387944893" name="isbn" id="isbn" value="<%= rs.getString("isbn") %>" required>  
                        </div>
                        <br>
                        <div alight="left">
                            <label class="form-label"><b>Book-shelf Number</b></label>
                            <input type="text" class="form-control" placeholder="8A" name="shelf" id="shelf" value="<%= rs.getString("bno") %>" required>  
                        </div>
                        <br>
                        <%
                            }
                        
                        %>
                        
                        <div alight="right">
                            <input type="submit" id="submit" value="submit" name="submit" class="btn btn-info">
                            <input type="reset" id="reset" value="reset" name="reset" class="btn btn-danger">
                        </div>

                        
                    </form>
                    
             <div col-sm-3>
                
            </div>
                               
                
            </div>

            
        </div>
    </body>
</html>
