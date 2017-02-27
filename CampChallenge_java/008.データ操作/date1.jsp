<%-- 
    Document   : date1
    Created on : 2017/02/27, 14:40:28
    Author     : i_am_kaede
データ操作：課題１
　入力フィールド

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
// 以下の入力フィールドを持ったHTMLを、Javaで処理する想定で記述してください。
//・名前（テキストボックス）、性別（ラジオボタン）、趣味（複数行テキストボックス）%>

        <form action="./date2.jsp" method="post">
            名前：<input type ="text" name="txtName"><br>
            
            性別：
            男<input type ="radio" name="rdoSample" value=0>
            女<input type ="radio" name="rdoSample" value=1><br>
            
            趣味：
            <textarea name="mulText"></textarea>
            <br>
            <br>
            <input type="submit" value="送信">
  
        
        </form>        
    </body>
</html>
