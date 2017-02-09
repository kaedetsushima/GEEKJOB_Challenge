<%-- 
    Document   : jsp2-4 引数２ (jspサーブレット２)
    Created on : 2017/02/09, 16:50:18
    Author     : i_am_kaede
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%!
            
 //引き数が3つのメソッドを定義する。
 //1つ目は適当な数値を、2つ目はデフォルト値が5の数値を、
 //最後はデフォルト値がfalse(boolean)のtypeを引き数として定義する。
//1つ目の引き数に2つ目の引き数を掛ける計算をするメソッドを作成し、
//typeがfalseの時はその値を表示、trueのときはさらに2乗して表示する。
//例）Integer sample(Integer AAA, Integer BBB, boolean type) 
// 引数が３つのメソッド書き出し部分


//Integerは戻り値の型

Integer three(Integer a, Integer b, boolean type){ 
  
    int x = a*b;
    
    if(type==true){
        x = x*x;    

    }
    
    return x;
    
//returnは、if文使ったとしても、１つのメソッドにつきreturn１個のみしか書けないb
//そのメソッドの最後に書くこと
//リターン書かないと処理されなくなる
} 
    
 //デフォルト値
 Integer three(Integer a,Integer b){
    
  return three(a,5,false);
}
  Integer three(Integer b){  
     
    return three(2,5,false);
 }
 
//オーバーロード　多重定義　スッキリわかるjava.p191-p200
//メソッドに同じ名前をつけることは基本的にできない
//↑こんな感じに、仮引数が異なれば同じ名前のメソッドを複数定義することが許される


%>
  
        
    </head>
    <body>
        <%
            
            Integer num = three(2);

            out.print(num);


            %>
            
        
        
    </body>
</html>
