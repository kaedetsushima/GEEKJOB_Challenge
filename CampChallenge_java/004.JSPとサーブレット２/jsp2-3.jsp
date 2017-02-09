<%-- 
    Document   : jsp2-3　引数１
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
            


//String iのStringは、戻ってきた時の型が何がいいか。
//言葉で戻したいからString

                String i(int x){
                            
                     if(x%2==0){
                
                         return "偶数";
                      } else{
                            
                         return "奇数";
                            
                      }       
                }   

              %>
              
              
              
              <%//ユーザー定義したのを、このメインメソッドで呼び出し
                
                  Integer num = 5;

                  
                  out.print(num + "は" +i(num)+ "です");
                  

//最初のnumは、５と表示される。　次のi(num)は、戻ってきた値で表示される。
//i(num)はユーザーメソッドで、Stringを指定してるのでString型で返ってくる。
                  %>
                  
    </body>
</html>
