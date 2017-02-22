<%-- 
    Document   : class9
    Created on : 2017/02/22, 16:11:34
    Author     : i_am_kaede

    ファイルから読み出しと表示
ファイルから自己紹介を読み出し、表示してください。
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.*" %>
<%@page import = "java.text.*" %>
<%@page import = "java.io.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>

 <%        
    
    File txt = new File(application.getRealPath("text.txt"));
    
    FileReader fr = new FileReader(txt);

    BufferedReader br = new BufferedReader(fr);
    
    
    out.print(br.readLine());
    
    br.close();
    

%>        
    </body>
</html>
