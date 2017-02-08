<%-- 
    Document   : FortuneTellingResult
    Created on : 2017/02/08, 16:06:54
    Author     : i_am_kaede
--%>

<%@page import="org.mypackage.sample.ResultDate" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            ResultDate data = (ResultDate)request.getAttribute("DATA");
            %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           </head>
  <body>
      
<%

if (data != null){
    
    out.print("<h1>あなたの"+data.getD()+"の運勢は、"+data.getLuck()+"</h1>");    
}        
        
        
  %>     
      
      
    </body>
</html>
