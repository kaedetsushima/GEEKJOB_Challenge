<%-- 
    Document   : class1-1
    Created on : 2017/02/21, 16:37:28
    Author     : i_am_kaede
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, java.text.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
<%        
    //タイムスタンプの作成
    //2016年1月1日 0時0分0秒のタイムスタンプを作成し、表示してください。
    Date date = new Date();    
    
        Calendar cal = Calendar.getInstance();
        cal.set(2016, 1, 1, 0, 0, 0);
        Date cale = cal.getTime();
        
        out.print(cale.getTime());
        
 %>
    </body>
</html>
