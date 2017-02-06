<%-- 
    Document   : challenge1-6
    Created on : 2017/02/06, 13:52:56
    Author     : i_am_kaede
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>      
<%
//クエリストリングを利用して、以下の処理を実現してください。
//スーパーのレジでレシートを作る仕組みを作成します。
//クエリストリングで総額・個数・商品種別を受け取って処理します。

String goods = request.getParameter("a");
String price = request.getParameter("b");
String num = request.getParameter("c");

int reqA = Integer.parseInt(goods);
int reqB = Integer.parseInt(price);
int reqC = Integer.parseInt(num);


int sougaku = reqB*reqC;
int tanka = sougaku/reqC;
double p4 = sougaku*0.04;
double p5 = sougaku*0.05;

int point5 = (int)p5;
int point4 = (int)p4;


%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%   
    
//①商品種別は、３つ。１：雑貨、２：生鮮食品、３：その他
//まずは、この商品種別を表示してください。
         
if(reqA == 1){
    out.print("雑貨");
}else if(reqA == 2){
    out.print("生鮮食品");
}else{
    out.print("その他");
}
         
         

//②総額と個数から１個当たりの値段を算出してください。
//総額と１個当たりの値段を表示してください。


out.print("総額は"+sougaku+"円で、個数は"+reqC+"個です。");
out.print("1個あたりの値段は"+tanka+"円です。");

         
//③3000円以上購入で4%、5000円以上購入で5%のポイントが付きます。
//購入額に応じたポイントの表示を行ってください。

       if(sougaku >= 5000){
        out.print("５％のポイントが付くので"+point5+"が入ります。");
        } else if(sougaku >= 3000){
        out.print("４％のポイントが付くので"+point4+"が入ります。");
        }
        else{
         out.print("ポイントはつきません");
                }    
   %>
   
    </body>
</html>
