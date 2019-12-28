<%-- 
    Document   : viewbooks
    Created on : 2 Dec, 2019, 10:41:00 PM
    Author     : Aaditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>

<%
String _bname=request.getParameter("bname");
String _isbn=request.getParameter("isbn");
String _shelf=request.getParameter("shelf");

try
{
    Class.forName("com.mysql.jdbc.Driver");
}
catch(ClassNotFoundException e)
{
    e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<!DOCTYPE html>
<html>
<head>
	<title></title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
        <nav class="navbar navbar-light bg-dark">
            <span class="navbar-brand mb-0 h1" href="#" style="color: white";>Library Management Sytem</span>
            <ul class="navbar nav">
                <li class="nav-item">
                    <a href="home.jsp" class="nav-link btn btn-success">Home</a>
                </li>
            </ul>
        </nav>
        <div class="row">
        	<div class="col-sm-2">
        		
        	</div>
        	<div class="col-sm-8" style="padding:10px; ">
        		<table class="table table-striped table-dark" >
        			<thead>
        				<th scope="col">Book Name</th>
        				<th scope="col">ISBN</th>
        				<th scope="col">Shelf Number</th>
        			</thead>
<%
try{ 
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/wdproject","root","root");
statement=conn.createStatement();
String Query ="SELECT * FROM insertbook";
resultSet = statement.executeQuery(Query);
while(resultSet.next()){
    String id=resultSet.getString("id");
    
%>                                
        			<tbody>
                                    <tr>
                                        <td><%=resultSet.getString("bname")%></td>
                                        <td><%=resultSet.getString("isbn")%></td>
                                        <td><%=resultSet.getString("bno")%></td>
                                        <td><a href="update.jsp?id=<%=id%>">Edit</a></td>
                                        <td><a href="delete.jsp?id=<%=id%>">Delete</a></td>
                                    </tr>
        			</tbody>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
        		</table>
        	</div>
        </div>
</body>
</html>
