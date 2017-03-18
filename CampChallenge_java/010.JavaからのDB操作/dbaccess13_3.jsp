<%-- 
    Document   : dbaccess13_3
    Created on : 2017/03/14, 17:21:44
    Author     : i_am_kaede
javaからのDB操作：課題１３：在庫管理システムの作成
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>在庫管理システム</title>
    </head>
    <body>
       <form action ="./dbaccess13_1" method="post">
        <font size ="3">
        <br><br><b>商品登録情報</b><br><br>
        
        <table bordercolor="white" border="1">
            <tr><td><div align="right">品番：</div></td>
                <td><input type="text" name="number" size="30"></td></tr>   
            <tr><td><div align="right">品名：</div></td>
                <td><input type="text" name="name" size="30"></td></tr>
            <tr><td><div align="right">金額：</div></td>
                <td><input type="text" name="cost" size="30"></td></tr>
               <tr><td><div align="right">在庫数：</div></td>
                <td><input type="text" name="in" size="30"></td></tr>         
                 </tr></td> </table>
        <br><br><input type ="submit" style="width:30%;" name="ent" value="登録"> 
        </font></form>
    </body>
</html>
