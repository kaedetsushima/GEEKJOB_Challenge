<%-- 
    Document   : challenge1-5
    Created on : 2017/02/06, 13:27:45
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
//変数を宣言し、その変数の中身によって以下の表示を行ってください。
//⇒値が 1 なら「１です！」
//⇒値が 2 なら「プログラミングキャンプ！」
//⇒それ以外なら「その他です！」    

int num = 10;

if(num==1){
    out.print("１です！");
}
else if(num==2){
    out.print("プログラミングキャンプ！");
}else{
    out.print("その他です！");
}


    %>
    </body>
</html>
