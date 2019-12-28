<%-- 
    Document   : index
    Created on : 24 Nov, 2019, 7:52:47 PM
    Author     : Aaditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

.box h2{
    margin: 0;
    padding-bottom:10px;
    color: #fff;
    text-align:center;
}

.box .inputBox{

    position: relative;
}

.box .inputBox input{
     width: 100%;
     padding: 10px 0;
     font-size: 16px;
     color: #fff;
     margin-bottom: 30px;
     border: none;
     border-bottom: 1px solid #fff;
     outline: none;
     background: transparent;
}

.box .inputBox label
{
    position: absolute;
    top: 0;
    left: 0;
    padding: 10px 0;
    font-size: 16px;
    color: #fff;
    pointer-events: none;
    transition: 1s;
} 

.box .inputBox input:focus ~ label,
.box .inputBox input:valid ~ label
{
    top: -18px;
    left: 0;
    color: #03a9f4;
    font-size: 12px;
}

.box input[type="submit"]
{
    background: transparent;
    border: none;
    outline: none;
    color: #fff;
    background: #03a9f4;
    padding: 10px 20px;
    cursor: pointer;
    border-radius: 5px;
}


.box{
    position: absolute;
    top: 10%;
    left: 20%;
    transform: translate(-50%,50%);
    width: 400px;
    padding: 40px;
    background: rgba(0,0,0,.8);
    box-sizing: border-box;
    box-shadow: 0 15px 25px rgba(0,0,0,.5);
    border-radius:10px;
}

body{
    margin: 0;
    padding: 0;
    background-image:url("images/photo-1.jpg") ;
    background-size: cover;
    background-attachment: fixed;
}


</style>
</head>
<body>

    <div class="container-fluid">

<div class="box">

  <h2>Login</h2>
  <form action="Controller" method="post">

            <div class="inputBox">
                <input type="text"  name="uname" required="">
                <label> Username </label>

            </div>
            
            <div class="inputBox">
                <input type="password" name="psw" required="">
                <label>Password</label>
            </div>
            
            <div>
                <input type="submit" name="" value="Submit">
            </div>

  </form>
</div>
</div>

</body>
</html>


