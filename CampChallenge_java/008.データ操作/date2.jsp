<%-- 
    Document   : date2
    Created on : 2017/02/27, 15:04:34
    Author     : i_am_kaede
データ操作　課題１
HTMLの入力データの取得の表示
以下の機能を実装してください。
１で作成したHTMLの入力データを取得し、画面に表示する
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
          request.setCharacterEncoding("UTF-8");
          String n = request.getParameter("txtName");
          String h = request.getParameter("mulText");
          String m = request.getParameter("rdoSample");
          

          int num = Integer.parseInt(m);
          
          out.println("名前は："+n+"です。<br>");
          
            if(num == 0){
                out.println("性別は男性です。<br>");
                
            }else if(num == 1){
                out.println("性別は女性です。<br>");  
            }

          out.println("趣味は："+h+"です。<br>");

          %>
    </body>
</html>
