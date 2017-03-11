<%-- 
    Document   : dbaccess12
    Created on : 2017/03/10, 14:00:47
    Author     : i_am_kaede
JAVAからのDB操作：課題１２：複合検索

以下の課題を、JavaからのJDBCを用いて実現してください。
検索用のフォームを用意し、名前、年齢、誕生日を使った
複合検索ができるようにしてください。
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>複合検索</title>
    </head>
    <body>
        <form action ="./dbaccess12_1" method="post">
        <font size ="3">
        <br><br><b>　　●　名前・年齢・誕生日を使った検索　●</b><br><br>
        
        <table bordercolor="white" border="1">
            <tr><td><div align="right">名前：</div></td>
                <td><input type="text" name="name" size="30"></td></tr>   
            <tr><td><div align="right">年齢：</div></td>
                <td><input type="text" name="age" size="30"></td></tr>
            <tr><td><div align="right">誕生日：</div></td>
                <td><input type="text" name="birthday" size="30"></td></tr>
                 </tr></td> </table>
        <br><br><input type ="submit" style="width:30%;" name="sub" value="検索"><br>        
        </font></form>  
   
    </body>
</html>
