<%-- 
    Document   : date6
    Created on : 2017/03/06, 21:02:49
    Author     : i_am_kaede
データ操作：課題６：HTMLのタグについて

HTMLについて調べましょう。
HTMLには入力フィールド意外にも様々なタグが存在します。
Webページをデザインする上で欠かせない知識なので、タグを調べ、色々と使ってみましょう。

WEB-INFフォルダは、サーブレットとJSPの連携用。
（サーブレットは、入れる場合もある。基本はソースパッケージ）
WEB-INFには、JSPは絶対入れない。
JSPは、Webページの下。
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HTMLのタグについて</title>
    </head>
    <body>
    <br><br>
        <font size="5" color="#FF3399" face="fantasy"><b>HTML</font>
        <font size="5" color="FF99AA" face="arial unicode ms">
        のタグを色々使ってみる！</b><br><br>
        </font>
        
    <center>
<table border="1" width="500" cellspacing="0" cellpadding="5" bordercolor="black">
    <tr><th bgcolor="red" colspan="2">
<font size="3">テーブル作る</font></th></tr>
    <td width="200">おしゃれな文字</td>
    <td>
    <font face="Impact">table</font>,
    <font face="Comic Sans MS">table</font>,
    <font face="Times New Roman">table</font>
    
    </td></tr></table></font>
    </center>
    
    <br><br><br><br>
    
         <font size="5" color="FF99AA" face="arial unicode ms">
       いろんな国の言葉<br>
        </font>
        
    <table border="1" width="200" height="150"><tr><td>
    <br><br>
    <dl>
        <dt><font face="Comic Sans MS">English</font></dt>
        <dd><font face="cursive">I love you</font></dd>
        
        <dt><font face="Comic Sans MS">Spanish</font></dt>
        <dd><font face="cursive">Te amo</font></dd>
        
        <dt><font face="Comic Sans MS">Franch</font></dt>
        <dd><font face="cursive">Je t'aime</font></dd>
        
    </dl></td></tr></table>
    

    </body>
</html>
