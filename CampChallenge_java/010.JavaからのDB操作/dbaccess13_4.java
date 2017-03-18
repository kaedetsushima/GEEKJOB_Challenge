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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author i_am_kaede
 */
public class dbaccess13_4 extends HttpServlet {

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
        
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        boolean check = checkuser(user, pass);
        
        if(check==true){
            String disp = "./dbaccess13_3.jsp";
            //importが必要
            RequestDispatcher dispatch = request.getRequestDispatcher(disp);
            dispatch.forward(request, response);
            
        }else{
            String disp = "./dbaccess13.jsp";
            RequestDispatcher dispatch = request.getRequestDispatcher(disp);  
            
        }
        

       
    }
  
 protected boolean checkuser(String user, String pass){
                
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
         
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/challenge_db","kaede","password");
            db_st = db_con.prepareStatement("select user,password from login where user=? and password=?");          
            
            //引数が入ってる
            db_st.setString(1,user);
            db_st.setString(2,pass);
            

            //select　の時に使う 
            db_data = db_st.executeQuery();
            
            if(db_data.next()){
                return true;
            }else{
                return false;
            }
   
            
            
        } catch(SQLException e_sql){
            System.out.println("ログインに失敗しました。：" + e_sql.toString());
        } catch(Exception e){
            System.out.println("接続時にエラーが発生しました：" + e.toString());
        } finally{
         if(db_con != null){
             
             try {
                 db_con.close();
             }catch(Exception e_con){
                 System.out.println(e_con.getMessage());
             }
            
        }
       
       }
                
          return false;      
                
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
