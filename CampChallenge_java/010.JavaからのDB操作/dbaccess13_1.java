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
import java.sql.*;

/**
 * @author i_am_kaede
 * 
 * javaからのDB操作：課題１３：在庫管理システムの作成
 * 
 * 以下の機能を満たすロジックを作成してください。
 * 在庫管理システムを作成します。
　*まず、DBにユーザー情報管理テーブルと、商品情報登録テーブルを作成してください。
* その上で、下記機能を実現してください。
* ①ユーザーのログイン・ログアウト機能
* ②商品情報登録機能③商品一覧機能
* ※各テーブルの構成は各自の想像で作ってみてください。
 * 
 */
public class dbaccess13_1 extends HttpServlet {

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
        
        String num = request.getParameter("number");
        String name = request.getParameter("name");
        String cost = request.getParameter("cost");
        String in = request.getParameter("in");
        
        int num_i = Integer.parseInt(num);
        int cost_i = Integer.parseInt(cost);
        int in_i = Integer.parseInt(in);
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","kaede","password");
            db_st = db_con.prepareStatement("insert into info values(?,?,?,?)");          
            
            db_st.setInt(1,num_i);
            db_st.setString(2,name);
            db_st.setInt(3,cost_i);
            db_st.setInt(4,in_i);       
            
            db_st.executeUpdate();

            //select　の時に使う
            db_st = db_con.prepareStatement("select * from info");  
            db_data = db_st.executeQuery();
             while(db_data.next()){
             out.print("品番：" + db_data.getInt("number")+"<br>");
             out.print("品名：" + db_data.getString("name")+"<br>");
             out.print("金額：" + db_data.getInt("cost")+"<br>");
             out.print("在庫数" + db_data.getInt("inventory")+"<br><br>"); 
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
