<%-- 
    Document   : home
    Created on : 2 Dec, 2019, 7:43:41 PM
    Author     : Aaditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <style type="text/css">
            form { 
                    margin: 0 auto; 
                    width:250px;
                    padding-top: 150px;
                 }
        </style>
    </head>
    <body>
        <!-- As a link -->
        <nav class="navbar navbar-dark bg-dark">
            <span class="navbar-brand mb-0 h1" href="#" style="color: white";>Library Management Sytem</span>
            <ul class="navbar nav">
                <li class="nav-item">
                    <a href="viewbooks.jsp" class="nav-link btn btn-success">View Books</a>
                </li>
            </ul>
        </nav>

        <div class="row" style="text-align: center;">
            <div class="col-sm-12">
                
                    <form  method="POST" action="InsertBooks">
                        <div alight="left">
                            <label class="form-label"><b>Book Name</b></label>
                            <input type="text" class="form-control" placeholder="Book Name" name="bname" id="bname" required>  
                        </div>
                        <br>
                        <div alight="left">
                            <label class="form-label"><b>ISBN</b></label>
                            <input type="text" class="form-control" placeholder="9789387944893" name="isbn" id="isbn" required>  
                        </div>
                        <br>
                        <div alight="left">
                            <label class="form-label"><b>Book-shelf Number</b></label>
                            <input type="text" class="form-control" placeholder="8A" name="shelf" id="shelf" required>  
                        </div>
                        <br>
                        <div alight="right">
                            <input type="submit" id="submit" value="submit" name="submit" class="btn btn-info">
                            <input type="reset" id="reset" value="reset" name="reset" class="btn btn-danger">
                        </div>

                        
                    </form>
                    
                                
                
            </div>

            
        </div>
    </body>
</html>
