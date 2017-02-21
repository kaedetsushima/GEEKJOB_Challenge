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
import java.util.*;
import java.text.*;

/**
 *タイムスタンプの表示２
 * 2015年1月1日 0時0分0秒と
 * 2015年12月31日23時59分59秒の差（ミリ秒)
 *
 * を表示してください。
 * @author i_am_kaede
 * 
 */
public class class4 extends HttpServlet {
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
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            
            Date date = new Date();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            
            try {
            Date date1 = sdf.parse("20150101000000");
            Date date2 = sdf.parse("20151231235959");
            
            long dat1 = date1.getTime();
            long dat2 = date2.getTime();

            out.print("dat1="+dat1+" dat2="+dat2+"<br>");
       
            
            long newDat = dat2-dat1;
            out.print("2015年1月1日0時0分0秒と2015年12月31日23時59分59秒のミリ秒差は<br>"+newDat);
       
            } catch (Exception ex) {
                out.print(ex.getMessage());
                //Try catchは、エラー(例外)があったら
                //catchでメッセージ表示してくれる
                
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
