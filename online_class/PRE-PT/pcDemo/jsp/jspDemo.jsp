<%@page import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%!
    Date the Date=new Date(); Date getDate()
    {
    System.out.println("In getDate() method"); return theDate;
     }
    %>
    Hello! The time is now<%=getDate()%>
</body>
</html>