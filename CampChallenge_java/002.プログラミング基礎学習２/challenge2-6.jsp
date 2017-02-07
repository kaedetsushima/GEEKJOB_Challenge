<%-- 
    Document   : challenge2-6
    Created on : 2017/02/07, 10:54:54
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
//while文を利用して、以下の処理を実現してください。
//1000を2で割り続け、100より小さくなったらループを抜ける処理            

int i = 1000;


while(i>=100){

        
out.print(i+",");

    i = i/2;
    
}



            %>
            
    </body>
</html>
