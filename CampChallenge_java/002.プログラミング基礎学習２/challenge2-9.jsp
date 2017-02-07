<%-- 
    Document   : challenge2-9
    Created on : 2017/02/07, 12:00:24
    Author     : i_am_kaede
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%@ page import = "java.util.*" %>
<%
//以下の順で、連想配列を作成してください。
//"1"に"AAA", "hello"に"world", "soeda"に"33", "20"に"20"


HashMap <String, String> hMap =
        new HashMap<String, String>();
            
hMap.put("1","AAA");
hMap.put("hello","world");
hMap.put("soeda","33");
hMap.put("20","20");

for(Map.Entry<String, String> val:hMap.entrySet()){
    out.print(val.getKey());
    out.print("->");
    out.print(val.getValue());
    out.print("/");
}


%>
    </body>
</html>
