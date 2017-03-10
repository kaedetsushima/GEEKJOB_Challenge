<%-- 
    Document   : dbaccess11
    Created on : 2017/03/10, 13:19:44
    Author     : i_am_kaede
JAVAからのDB操作：課題１１；特定のレコードの更新

以下の課題を、JavaからのJDBCを用いて実現してください。
profileIDで指定したレコードの、profileID以外の
要素をすべて上書きできるフォームを作成してください
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>特定のレコードの更新</title>
    </head>
    <body>
 <form action ="./dbaccess11_1" method="post">
        <font size ="3">
        <br><br><b>●指定されたIDのデータを上書きします</b><br><br>
        
        <b>●どのIDですか？</b><br>
        ID(半角数字で入力)：<input type="text" name="id" size="30">
                
                    <br><br>
                    <b>●更新するデーター内容を入力して下さい。</b><br>
            <table bordercolor="white" border="1">
            <tr><td><div align="right">名前：</div></td>
                <td><input type="text" name="name" size="30"></td></tr>   
            <tr><td><div align="right">電話番号：</div></td>
                <td><input type="text" name="tell" size="30"></td></tr>    
            <tr><td><div align="right">年齢：</div></td>
                <td><input type="text" name="age" size="30"></td></tr>
            <tr><td><div align="right">誕生日：</div></td>
                <td><input type="text" name="birthday" size="30"></td></tr>
                 </tr></td> </table>
                    <br>
        <input type ="submit" style="width:30%;" name="sub" value="登録"><br>        
        </font></form>  
    </body>
</html>
