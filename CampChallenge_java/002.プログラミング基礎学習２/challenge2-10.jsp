<%-- 
    Document   : challenge2-10
    Created on : 2017/02/07, 16:00:27
    Author     : i_am_kaede
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>クエリストリング（簡易素因数分解）</title>
    </head>
    <body>
        <%
//クエリストリングを利用して、以下の処理を実現してください。
//簡易素因数分解のロジックを作成します。
//クエリストリングから渡された数値を1ケタの素数で可能な限り分解し、
//元の値と素因数分解の結果を表示するようにしてください。
//2ケタ以上の素数が含まれた数値の場合は、
//「元の値　1ケタの素因数　その他」と表記して、その他　に含んでください。

String n = request.getParameter("number");

int num = Integer.parseInt(n);

int sosuu[] = {2,3,5,7};

ArrayList<Integer> ans = new
         ArrayList<Integer>();

out.print("元の値は：" + num + "です。");
out.print("<br>");



    
if(num%sosuu[0]==0||num%sosuu[1]==0||num%sosuu[2]==0||num%sosuu[3]==0){
    
    for(int i : sosuu){
        if(num%i==0){
   
    while(num%i==0){
 
        num  = num/i;   
        
        ans.add(i);
             
    }
        }

        
    }

        out.print("素因数分解の結果："+ans.toString()+"です。");
    
}

%>
</body>
</html>
