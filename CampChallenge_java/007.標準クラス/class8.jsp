<%-- 
    Document   : class8
    Created on : 2017/02/22, 15:38:16
    Author     : i_am_kaede
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import = "java.util.*,java.text.*,java.io.*" %>

<!DOCTYPE html>
<html>
    <head>
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>課題８</title>
    </head>
    <body>
        <%
            
            File txt = new File(application.getRealPath("text.txt"));
            
            FileWriter fw = new FileWriter(txt);
            
            fw.write("自己紹介：津島楓です。山梨県出身です。");
            fw.close();


            

            
        %>
    </body>
</html>
