<%-- 
    Document   : dbaccess8
    Created on : 2017/03/08, 17:23:48
    Author     : i_am_kaede

DB操作：課題８：検索用フォームの用意と検索（部分一致）

以下の課題を、JavaからのJDBCを用いて実現してください。
検索用のフォームを用意し、名前の部分一致で検索＆表示する処理を構築してください。

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>検索用フォームの用意と検索（部分一致）</title>
    </head>
    <body>
        <form action ="./dbaccess8_1" method="post">
        <font size ="3">
        <br><br><b>　　●　名前の部分一致で検索and表示　●</b><br><br>
        検索したい名前：
        <input type="text" name="name" size="30">
        <input type ="submit" name="sub" value="検索">
        
        </font></form>      
    </body>
</html>
