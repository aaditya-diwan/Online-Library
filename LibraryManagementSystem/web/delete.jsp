<%-- 
    Document   : delete
    Created on : 3 Dec, 2019, 6:59:23 AM
    Author     : Aaditya
--%>
<%@page import="java.sql.*" %>


<%

            String _id=request.getParameter("id");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wdproject","root","root");
            String Query="DELETE FROM insertbook WHERE id=?";
            PreparedStatement psm=conn.prepareStatement(Query);
            psm.setString(1,_id);
            psm.executeUpdate();
%>

<script>
    alert("Record Deleted");
</script>
