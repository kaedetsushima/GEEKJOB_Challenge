<%-- 
    Document   : challenge2-8
    Created on : 2017/02/07, 11:34:35
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
//配列の変更
//課題「配列の作成」で作成した配列の"soeda"を"33"に変更してください。


String name[] = {"soeda","hayashi","END"};
 
int num[] = {10,100,-20,118};

name[0]="33";

out.print(name[0]);



            
%>
    </body>
</html>
