<%-- 
    Document   : class10
    Created on : 2017/02/23, 13:08:55
    Author     : i_am_kaede
　標準クラスを利用して処理を作成
紹介していないJAVAの標準クラスを利用して、処理を作成してください。

講義では紹介されていないJAVAの標準クラスはたくさん存在します。
１つJAVAの標準クラスを選び、実際にロジックを作成してみてください。
また、この処理を作成するに当たり、下記を必ず実装してください。
   ビッグデシマル精度の高い計算
   ログクラス
--%>
<%@page contentType = "text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.*"%>
<%@page import = "java.text.*"%>
<%@page import = "java.io.*" %>
<%@page import = "java.math.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
    <%

//①処理の経過を書き込むログファイルを作成する。
File txt = new File(application.getRealPath("text.txt"));

FileWriter fw = new FileWriter(txt);

Date date = new Date();

Calendar cal = Calendar.getInstance();
cal.setTime(date);
int yy = cal.get(Calendar.YEAR);
int mm = cal.get(Calendar.MONTH)+1;
int dd = cal.get(Calendar.DAY_OF_MONTH);
int tt = cal.get(Calendar.HOUR_OF_DAY);
int mi = cal.get(Calendar.MINUTE);

//②処理の開始、終了のタイミングで、ログファイルに開始・終了の書き込みを行う。

fw.write("開始\n");
//③書き込む内容は、「日時　状況（開始・終了）」の形式で書き込む。

//FileWriter fwa = new FileWriter(txt,true);
//↑入らなかった。


fw.write(yy+"年"+mm+"月"+dd+"日"+tt+"時"+mi+"分\n");
//fwa.write("");



BigDecimal a = new BigDecimal("0.19");
BigDecimal b = new BigDecimal("0.1900000");

fw.write("１つ目の値は"+ a.toString());
fw.write("\n");
fw.write("２つ目の値は"+ b.toString());
fw.write("\n");


MathContext mc = new MathContext(4, RoundingMode.HALF_UP);
BigDecimal result = b.round(mc);

fw.write("２つめの値は、四捨五入で【"+ result +"】です");


fw.write("\n");
fw.write("終了");



fw.close();
//fwa.close();
//④最後に、ログファイルを読み込み、その内容を表示してください。

//System.out.print(log);


    %>

        
    </body>
</html>
