<%-- 
    Document   : user1-2 ユーザー定義メソッド作成
    Created on : 2017/02/08, 21:00:03
    Author     : i_am_kaede
--%>
<%@page import="java.io.IOException" %>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"
<%! 
//自分のプロフィール(名前、生年月日、自己紹介)を3行に分けて表示する
//ユーザー定義メソッドを作り、メソッドを10回呼び出して下さい
                  String getMyName(){
                  return "津島楓";
              }
                  String getMyBirth(){
                  return "1/9";
              }
                  String getMyMe(){
                  return "山梨県出身です！";
                  
              }
                  ArrayList<String> getProfile() {
                       ArrayList<String> al = new ArrayList<String>();
                       al.add("津島楓");
                       al.add("1/9");
                       al.add("山梨県出身です！");
                       return al;
                }

 
           
            
//void setMyBirth(String birth,JspWriter out)throws IOException{
//            out.println(birth);
            
void setMyMe(String me,JspWriter out)throws IOException{
            out.println(me);            

}
           
%>
                  
<%--
   

  void writeMyName(PrintWriter out,String name){
        out.println(name);
            
            //String birth = getMyName();
            //setMyBirth(birth,out);
            
           // String me = getMyName();
            //setMyMe(me,out);
            
        
    
--%>
</head>

<%-- setMyMe("アイウエア", out); --%>

<body>
        
<%-- setMyMe("test", out); --%>

    </body>
    <%
        for(int count=0; count<10; count++){
            
        ArrayList<String> myProfile = getProfile();
        
        for(String i : myProfile){

        out.print(i);
        out.print("<br>");
        
        }
        
        }
        %>
</html>
