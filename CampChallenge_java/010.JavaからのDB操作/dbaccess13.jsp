<%-- 
    Document   : dbaccess13
    Created on : 2017/03/11, 14:15:15
    Author     : i_am_kaede

javaからのDB操作：課題１３：在庫管理システムの作成

以下の機能を満たすロジックを作成してください。
在庫管理システムを作成します。
まず、DBにユーザー情報管理テーブルと、商品情報登録テーブルを作成してください。
その上で、下記機能を実現してください。
①ユーザーのログイン・ログアウト機能
②商品情報登録機能
③商品一覧機能
※各テーブルの構成は各自の想像で作ってみてください。

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>在庫管理システムの作成</title>
    </head>
    <body>
        <form action ="./dbaccess13_4" method="post">
        <font size ="3" face="Comic Sans MS">
        <br><br><b>　　●　ユーザーのログイン・ログアウト</b><br><br>
        <table bordercolor="white" border="1">
            <tr><td><div align="right">ユーザー名：</div></td>
                <td><input type="text" name="user" size="30"></td></tr>   
            <tr><td><div align="right">パスワード：</div></td>
                <td><input type="text" name="pass" size="30"></td></tr>
</table>
        <br><br>
        <input type ="submit" style="width:30%;" name="sub" value="ログイン"><br>        
        </font></form> 
    </body>
</html>
