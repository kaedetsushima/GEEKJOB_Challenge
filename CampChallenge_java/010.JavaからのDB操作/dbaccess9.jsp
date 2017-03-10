<%-- 
    Document   : dbaccess9
    Created on : 2017/03/09, 11:50:59
    Author     : i_am_kaede

DB操作：課題９：フォームからデータを挿入

以下の課題を、JavaからのJDBCを用いて実現してください。
フォームからデータを挿入できる処理を構築してください。
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>フォームからのデータを挿入</title>
    </head>
    <body>
        <form action ="./dbaccess9_1" method="post">
        <font size ="3">
        <br><br><b>　　●　データを登録します　●</b><br><br>
        
        <table bordercolor="white" border="1">
            <tr><td>ID(半角数字で入力)：</td>
                <td><input type="text" name="id" size="30"></td></tr>
            <tr><td><div align="right">名前：</div></td>
                <td><input type="text" name="name" size="30"></td></tr>   
            <tr><td><div align="right">電話番号：</div></td>
                <td><input type="text" name="tell" size="30"></td></tr>    
            <tr><td><div align="right">年齢：</div></td>
                <td><input type="text" name="age" size="30"></td></tr>
            <tr><td><div align="right">誕生日：</div></td>
                <td><input type="text" name="birthday" size="30"></td></tr>
                 </tr></td> </table>
        <br><br>
        <input type ="submit" style="width:30%;" name="sub" value="登録"><br>        
        </font></form>  
    </body>
</html>
