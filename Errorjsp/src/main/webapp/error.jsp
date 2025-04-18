<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sorry! Something went wrong</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
</head>
<body>
    <div class="container p-3 text-center">
        <img src="Images/error2.jpg" class="img-fluid" />
        <h1 class="display-3">Sorry! Something went wrong</h1>
        <p><%= exception.getMessage() %></p>
        <a class="btn btn-outline-primary" href="index.html">Home Page</a>
    </div>
</body>
</html>