<%-- 
    Document   : dbaccess10
    Created on : 2017/03/10, 10:35:52
    Author     : i_am_kaede

JAVAからのDB操作：課題１０：特定のレコードの削除をするフォーム作成

以下の課題を、JavaからのJDBCを用いて実現してください。
profileIDで指定したレコードを削除できるフォームを作成してください
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>特定のレコードの削除をするフォーム作成</title>
    </head>
    <body>
        <form action ="./dbaccess10_1" method="post">
        <br><br>

        <table border="1" bordercolor="white">
            <tr><td>
           <font size ="3">       
     <b>●　削除したいprofileIDを半角数字で入力して下さい　●</b><br><br>
            </tr></td>   
        <td><font face="cursive"><center>profileID：</font>
        <input type="text" name="id" size="30">
        <input type ="submit" name="sub" value="検索"></center>
        </td></table></font>
        
        
        
        
    </body>
</html>
