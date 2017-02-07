<%-- 
    Document   : challenge2-4
    Created on : 2017/02/06, 21:37:36
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
//for文２
//for文を利用して、"A"を30個連結する処理を実現してください。

String a = "A";


for(int count=0; count<30; count++){
    out.print(a);
}

%>
    </body>
</html>
