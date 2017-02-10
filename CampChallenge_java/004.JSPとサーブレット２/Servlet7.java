/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.servlet.java.kaede;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 ** 　　引数・戻り値１
 * 
 * 引き数に1つのid(数値)をとり、3人分のプロフィール(項目は課題5参照)をあらかじめメソッド内で定義しておく。
 * 引き数のid値により戻り値として返却するプロフィールを誰のものにするか選択する。
 * それ以降などは課題「戻り値2」と同じ扱いにする。
 * 
 * @author i_am_kaede
 */
public class Servlet7 extends HttpServlet {
    
    
    
        //switch(id){case 1:   }使ってもok
    
    ArrayList<String> prof(int id) {
         ArrayList<String> x = new ArrayList<String>();
         
         if(id==1){     
         x.add("id:1");
         x.add("津島楓");
         x.add("１月９日");
         x.add("山梨県");
         } else if(id==2){

         x.add("id:2");
         x.add("田中");
         x.add("２月２日");
         x.add("東京");
         }else if(id==3){
         
         
         x.add("id:3");
         x.add("山田");
         x.add("３月３日");
         x.add("神奈川");
         
         }
         
        return x;
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
            out.println("<title>Servlet Servlet7</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1></h1>");
            
            out.println(prof(2));
            
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
