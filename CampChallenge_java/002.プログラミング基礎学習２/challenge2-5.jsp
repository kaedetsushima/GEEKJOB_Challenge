<%-- 
    Document   : challenge2-5
    Created on : 2017/02/07, 10:39:03
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
//for文３
//for文を利用して、0から100を全部足す処理を実現してください。

int i = 0;

for(int count=0; count<100; count++){
    
    i = i+count;
    out.println(i+",");

}



            %>
         
    </body>
</html>
