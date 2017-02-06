<%-- 
    Document   : challenge1-4
    Created on : 2017/02/06, 13:14:29
    Author     : i_am_kaede
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //定数と変数を宣言し、それぞれに数値を入れて四則演算を行い、
    //四則演算の結果をそれぞれ表示してください。
    
final int num = 15;
int i = 3;

int num1 = num + i; //足し算
int num2 = num - i; //引き算
int num3 = num * i; //掛け算
int num4 = num / i; //割り算
int num5 = num % i; //あまり

    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       out.println(num1);
       out.println(num2);
       out.println(num3);
       out.println(num4);
       out.println(num5);
       %>
    </body>
</html>
