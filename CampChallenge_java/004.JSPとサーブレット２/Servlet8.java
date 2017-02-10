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
//import java.util.*;

/**
 * 引数・戻り値２
 *
 * 課題「引数、戻り値1」の3人分のプロフィールのうち1人だけ住所が値nullの状態で定義し、
 * 値nullの状態が、ないっていう意味のこと。なので、最初から書かなければ、いい！
 * ループ処理で全員分のプロフィールをid以外表示する処理を実行する。 
 * この際、歯抜けになっているデータはcontinueで飛ばす
 *
 * @author i_am_kaede
 */
public class Servlet8 extends HttpServlet {
    
    //String[] profile;
    //使用するときは必ずthis.つける
    //クラスで宣言するとすべてのメソッドで共通して使える
    
    
    String[] prof(int id){
        
        
        String[] profile= new String [3];
        //this.profile = new String[3];
        
        
        switch(id){
            case 1:
            profile[0] = "名前：津島楓";
            profile[1] = "誕生日：１月９日";
            profile[2] = "住所：山梨県";
            break;
       
            case 2:
            profile[0] = "名前：田中";
            profile[1] = "誕生日：２月２日";
            //profile[2] = "住所：神奈川県";
            break;
        
       
            case 3:
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
            
                //サーブレットは、PrintWriter
    //PrintWriterはimportしなくて、おk
    
    
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet8</title>");
            out.println("</head>");
            out.println("<body>");


            for(int count=1; count<=3; count++){
            
                //out.println(prof(count));
                userdata(prof(count), out);
                
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    public void userdata(String[] data, PrintWriter out) throws IOException{
        for(int num=0; num < 3; num++){
            if(data[num] == null){
                continue;
            }
            out.print(data[num] + "<br>");
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
