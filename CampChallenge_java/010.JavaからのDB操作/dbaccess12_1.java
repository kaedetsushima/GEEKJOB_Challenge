/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author i_am_kaede
 * JAVAからのDB操作：課題１２：複合検索
 * 
 * 
 * 以下の課題を、JavaからのJDBCを用いて実現してください。
 * 検索用のフォームを用意し、名前、年齢、誕生日を使った
 * 複合検索ができるようにしてください。
 * 
 */
public class dbaccess12_1 extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");

        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
               
        String name = request.getParameter("name");        
        String age = request.getParameter("age");
        String birthday= request.getParameter("birthday");
        
        //nullチェックするために記入
        int age_i = 0;
        if(age != null && !("".equals(age))){
            age_i= Integer.parseInt(age);
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        java.util.Date birth = null;
        if(birthday != null && !("".equals(birthday))){
         try{
            birth = sdf.parse(birthday);
        } catch (ParseException ex){
        }
        }
        request.setCharacterEncoding("UTF-8");
        
            try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","kaede","password");
            
            
            if(name != null && !("".equals(name))){
                db_st = db_con.prepareStatement("select * from  profiles where name like ? or age like ? or birthday like ?");
                //likeは、nameだけで使いたいので。他のは、そのまま。
                //名前がヌルってたり、空欄でなければ、この処理に入る。
                //なのでその文字のみだけでなく、%%で囲んだ。これにより、　例）「やま」で検索すれば、やまもと・やまえもんが出る。
                db_st.setString(1,"%"+name+"%");
                db_st.setInt(2,age_i);
                if(birth != null){
                    db_st.setDate(3, new Date(birth.getTime()));
                }else{
                    db_st.setDate(3, null);
                }
            }else if(age != null && !("".equals(age))){
                db_st = db_con.prepareStatement("select * from  profiles where name like ? and age like ?");  
                db_st.setString(1,"%"+name+"%");
                db_st.setInt(2,age_i);
            }else if(birth != null){
                db_st = db_con.prepareStatement("select * from  profiles where name like ? and birthday like ?");  
                db_st.setString(1,"%"+name+"%");
                db_st.setDate(2, new Date(birth.getTime()));
            }
            
            //and　使う。　名前は何でもいい、けど、年はこれ！にできる。
            
            
            
            
            
            //%%で囲むと一文字も入ってない空欄の場合、何でもいいよの意味になるので、全て出てくる。   
  
            
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
