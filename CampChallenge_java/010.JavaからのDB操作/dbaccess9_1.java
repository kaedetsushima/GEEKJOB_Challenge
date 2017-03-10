/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;
import java.sql.*;
import java.text.ParseException;
/**
 * @author i_am_kaede
 * DB操作：課題９：フォームからのデータを挿入
 * 
 * 以下の課題を、JavaからのJDBCを用いて実現してください。
 * フォームからデータを挿入できる処理を構築してください。
 */
public class dbaccess9_1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
                request.setCharacterEncoding("UTF-8");
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        //int型のものも、request.getParameterではStringで受け取ることになるので
        //一度String型に入れてから、Integer.parseInt(id)でintに変換する
        
        
        String reqid = request.getParameter("id");
        String reqage = request.getParameter("age");
        
        
        int rid = Integer.parseInt(reqid);
        int rage= Integer.parseInt(reqage);
        
        //SQLのDate,javaのDateか、わかんないエラー防ぐため
        java.util.Date birth = null;
        
        try{
            birth = sdf.parse(request.getParameter("birthday"));
        } catch (ParseException ex){
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","kaede","password");
            db_st = db_con.prepareStatement("insert into profiles values(?,?,?,?,?)");

            
            //受け取る時、全部String型で受け取るので、intのものは変換する必要がある
            //全て(" ")ダブルクォーテーションで囲む
            db_st.setInt(1,rid);
            db_st.setString(2,request.getParameter("name"));
            db_st.setString(3,request.getParameter("tell"));
            db_st.setInt(4,rage);
            db_st.setDate(5, new Date(birth.getTime()));
            
            
            
            
         
            //SQLでDBになにかしらの処理をする時は.executeUpdate();を定義する
            db_st.executeUpdate();
            
            //select　の時に使う
             db_st = db_con.prepareStatement("select * from profiles");            
            db_data = db_st.executeQuery();
            while(db_data.next()){
             out.println("ID：" + db_data.getInt("profilesID")+"<br>");
             out.println("プロフィール：" + db_data.getString("name")+"<br>");
             out.println("電話番号：" + db_data.getString("tell")+"<br>");
             out.println("年齢：" + db_data.getInt("age")+"<br>");             
             out.println("誕生日：" + db_data.getString("birthday")+"<br><br>");
               
            }           
            db_data.close();
            db_st.close();
            db_con.close();
            
            out.print("<p><a href='date5_1.jsp'>戻る</a></p>");
            
        } catch(SQLException e_sql){
        out.println("接続時にエラーが発生しました：" + e_sql.toString());
        } catch(Exception e){
            out.println("接続時にエラーが発生しました：" + e.toString());
        } finally{
         if(db_con != null){
             
             try {
                 db_con.close();
             }catch(Exception e_con){
                 System.out.println(e_con.getMessage());
             }
        }
        }
    }

       
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

