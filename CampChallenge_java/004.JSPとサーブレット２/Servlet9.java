/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.servlet.java.kaede;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

//ただの配列をそのまま出したいときは、Arraysをimport
//そうすれば、id 1番目の配列全て出せる！

/**
 *  引数・戻り値３
 * 
 * 先にInteger limit=2を定義しておき、
 * 課題7の処理のうち2人目(limitで定義した値の人数)まででループ処理を抜けるようにする
 *
 * @author i_am_kaede
 */
public class Servlet9 extends HttpServlet {
    

   String[] prof(int id){
        
        
        String[] profile= new String [3];
        //this.profile = new String[3];
        switch(id){
            case 0:
            profile[0] = "名前：津島楓";
            profile[1] = "誕生日：１月９日";
            profile[2] = "住所：山梨県";
            break;
       
            case 1:
            profile[0] = "名前：田中";
            profile[1] = "誕生日：２月２日";
            profile[2] = "住所：神奈川県";
            break;
       
            case 2:
            profile[0] = "名前：山田";
            profile[1] = "誕生日：３月３日";     
            profile[2] = "住所：静岡県";
            break;
        }
        return profile;
        
    }


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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet9</title>");            
            out.println("</head>");
            out.println("<body>");
            
        
            Integer limit=2;


             for(int i = 0; i<limit; i++){
                
                String pro[] = prof(i);
                
                out.println(Arrays.toString(pro));
                out.println("<br>");
                  
               }
        
    
    


            out.println("</body>");
            out.println("</html>");
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
