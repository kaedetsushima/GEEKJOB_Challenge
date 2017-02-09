<%-- 
    Document   : jsp2-3
    Created on : 2017/02/09, 15:00:38
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
        
<%!                
//引数として数値を受け取り、その値が奇数か偶数か判別＆表示する処理をメソッドとして制作し、
//適当な数値に対して奇数・偶数の判別を行ってください
            

                String i(int a){
                     int x = a;
                     if(x%2==0){
                
                         return "奇数です";
                      } else{
                            
                         return "偶数です";
                            
                      }       
                }   
                 
                   
                  
                     
                     
             
              %>
              
              
              
              <%//ユーザー定義したのを、このメインメソッドで呼び出し
                
                  Integer num = 5;
                  
                  
                /*String k = kisuu();
                String g = gusuu();*/
                  
                  out.print(num + "は" +i(num)+ "です");
                  
                  
                  //String name = getMyName();
                  
                  //out.print(name+"a");
                  %>






                
    </body>
</html>
