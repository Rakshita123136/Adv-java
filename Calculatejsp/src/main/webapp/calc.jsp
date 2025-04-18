<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<body>
<form method="post" action="calc.jsp">
<table border="1" style="margin-top: 50px">
<tr>
<td>Enter First number</td>
<td><input type="text" name="t1"></td>
</tr>
<tr>
<td>Enter second number</td>
<td><input type="text" name="t2"></td>
</tr>
<tr>
<td>Select the operator</td>
<td>
<Select name="opt">
<option value="Select">Select</option>
<option value="+">+</option>
<option value="-">-</option>
<option value="*">*</option>
<option value="/">/</option>
</Select>
</td>
</tr>
<tr>
<td>Result</td>
<td><input type="submit" value="submit"></td>
</tr>
</table>
</form>
<%
try {
    if (request.getParameter("t1") != null && request.getParameter("t2") != null) {
        int a = Integer.parseInt(request.getParameter("t1"));
        int b = Integer.parseInt(request.getParameter("t2"));
        String c = request.getParameter("opt");

        switch (c) {
            case "+":
                out.println("Result: " + (a + b));
                break;
            case "-":
                out.println("Result: " + (a - b));
                break;
            case "*":
                out.println("Result: " + (a * b));
                break;
            case "/":
                if (b != 0) {
                    out.println("Result: " + (a / b));
                } else {
                    out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                out.println("Please select a valid operator.");
        }
    }
} catch (Exception ex) {
    ex.printStackTrace();
}
%>
</body>
</html>
