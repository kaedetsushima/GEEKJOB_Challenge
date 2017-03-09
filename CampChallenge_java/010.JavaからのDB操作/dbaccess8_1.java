/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * @author i_am_kaede
 * DB操作：課題８：検索用フォームの用意と検索（部分一致）
 * 
 * 以下の課題を、JavaからのJDBCを用いて実現してください。
 * 検索用のフォームを用意し、
 * 名前の部分一致で検索＆表示する処理を構築してください。
 */
public class dbaccess8_1 extends HttpServlet {

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
        //String n = request.getParameter("name");  
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","kaede","password");
            db_st = db_con.prepareStatement("select * from profiles where name like ?");

            //今回の（1,）は、上の何個目のはてなに入れるかの意味
            //%n%では、文字列になるので、nは一文字なので、下のように書く！

            db_st.setString(1,"%"+request.getParameter("name")+"%");
            
            db_data = db_st.executeQuery();
             while(db_data.next()){
             out.println("ID：" + db_data.getInt("profilesID")+"<br>");
             out.println("プロフィール：" + db_data.getString("name")+"<br>");
             out.println("電話番号：" + db_data.getString("tell")+"<br>");
             out.println("年齢：" + db_data.getInt("age")+"<br>");             
             out.println("誕生日：" + db_data.getString("birthday")+"<br><br>");
               
            }
            db_st.close();
            db_con.close();    
            
            
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
