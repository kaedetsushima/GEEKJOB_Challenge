<%-- 
    Document   : challenge2-7
    Created on : 2017/02/07, 11:02:17
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
        <%
//以下の順番で、要素が格納された配列を作成してください。
//"10", "100", "soeda", "hayashi", "-20", "118", "END"
            
String name[] = {"soeda","hayashi","END"};

int num[] = {10,100,-20,118};


for(int i=0; i<name.length; i++){
    out.print(name[i]+",");
    
}


            %>
    </body>
</html>
