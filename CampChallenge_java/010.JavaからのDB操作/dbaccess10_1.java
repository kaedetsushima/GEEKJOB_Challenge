/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author i_am_kaede
 * JAVAからのDB操作：課題１０：特定のレコーフォの削除をするフォーム作成
 * 
 *以下の課題を、JavaからのJDBCを用いて実現してください。
 * profileIDで指定したレコードを削除できるフォームを作成してください 
 * 
 */
@WebServlet(urlPatterns = {"/dbaccess10_1"})
public class dbaccess10_1 extends HttpServlet {

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
        
        
        
        String reqid = request.getParameter("id");
        int id = Integer.parseInt(reqid);


        request.setCharacterEncoding("UTF-8");
        
                try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","kaede","password");
            db_st = db_con.prepareStatement("delete from profiles where profilesID = ?");

            db_st.setInt(1,id);
            db_st.executeUpdate();
            
       
            
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
             
              
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");          
            out.println("</head>");
            out.println("<body>");
            
            out.println("<a href='dbaccess10.jsp'>戻る</a>");
            
            out.println("</body>");
            out.println("</html>");
             
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

