<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center" style="margin-top: 50px;">
 
        <form action="add" method="POST">
            Please enter first number:  <input type="text" name="firstnumber" size="20px"> <br>
            Please enter second number:  <input type="text" name="secondnumber" size="20px"> <br><br>
        <input type="submit" value="submit">
        </form>
        result: ${res}
    </div>
</body>
</html>