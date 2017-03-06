<%-- 
    Document   : date5_1
    Created on : 2017/03/06, 11:41:30
    Author     : i_am_kaede
データ操作：課題５：入力フィールドの作成と実装

以下の機能を実装してください。

名前・性別・趣味を入力するページを作成してください。
また、入力された名前・性別・趣味を記憶し、
次にアクセスした際に記録されたデータを初期値として表示してください。
※Javaと同時に、HTMLの知識が必要になります。
※入力フィールドの使い方を調べてみましょう。

jspとサーブレットの役割を理解することが重要。
こっちで表示をして、処理はdate5_2サーブレットに記入
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>入力フィールドの作成と実装</title>
    </head>
    <body>
<%
        HttpSession hs = request.getSession(true);
        String n = (String)hs.getAttribute("name");
        String t = (String)hs.getAttribute("text");
        String mf = (String)hs.getAttribute("radio");
        if(n==null || t==null || mf==null){
            n="";
            t="";
            mf="";
        }
%>
        <form action="./date5_2" method="post">
            <font size ="3">        
            <b>名前：</b><input type="text" name="name" size="30" value="<%=n%>" required><br>
            <b>性別：</b>
            男<input type="radio" name="radio" value="1" 
                    <% if(mf.equals("1")){
                        out.print("checked");}%> required>
            女<input type="radio" name="radio" value="2" 
                    <% if(mf.equals("2")){
                    out.print("checked");}%>
                    required><br>
            <b>趣味：</b><br>
            <%--textareaにvalueは無い--%>
            <textarea name="text" rouws="0" clos="0" wrap="hard" required><%=t%></textarea>
            <input type="submit" name="sub" value="送信">
        </form></font>
    </body>
</html>