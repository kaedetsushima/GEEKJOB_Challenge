<%-- 
    Document   : challenge2-2
    Created on : 2017/02/06, 18:03:35
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
//switch文を利用して、以下の処理を実現してください。
//値が"A"なら「英語」、値が"あ"なら「日本語」、それ以外は何も表示しない処理
        

char word[] ={'A','あ','い'};

switch(word[0]){
    case 'A':
        out.println("英語");
        break;
    case 'あ':
        out.println("日本語");
        break;
                }
        %>
        
        
        
        
    </body>
</html>
