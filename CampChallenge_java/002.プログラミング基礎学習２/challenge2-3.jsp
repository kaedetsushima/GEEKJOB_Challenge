<%-- 
    Document   : challenge2-3
    Created on : 2017/02/06, 18:22:58
    Author     : i_am_kaede
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
     //for文を利用して、8を20回掛ける処理を実現してください。
     
     int num = 8;
     
    for(int count=0; count<20; count++){
    out.println(num*count);
    
    }
     %>
     
    </body>
</html>
