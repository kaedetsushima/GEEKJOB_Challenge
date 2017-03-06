/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * データ操作：課題５：入力フィールドの作成と実装
 * 
 * 以下の機能を実装してください。
 *名前・性別・趣味を入力するページを作成してください。
 *また、入力された名前・性別・趣味を記憶し、
 * 次にアクセスした際に記録されたデータを初期値として表示してください。
 *※Javaと同時に、HTMLの知識が必要になります。
 *※入力フィールドの使い方を調べてみましょう。
 *
 * @author i_am_kaede
 */
public class date5_2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
            out.println("<title>Servlet date5_2</title>");            
            out.println("</head>");
            out.println("<body>");         
           request.setCharacterEncoding("UTF-8");
           String n = request.getParameter("name");
           String t = request.getParameter("text");
           String mf = request.getParameter("radio");
  
           
           Date time = new Date();
           HttpSession hs = request.getSession(true);
           hs.setAttribute("name", n);
           hs.setAttribute("text", t);
           hs.setAttribute("radio", mf);
           //次の訪問で。
           /*HttpSession hs2 = request.getSession();
           out.print("最後のログインは、" + hs2.getAttribute("LastLogin"));*/         
            out.print("<p><a href='date5_1.jsp'>戻る</a></p>");
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
