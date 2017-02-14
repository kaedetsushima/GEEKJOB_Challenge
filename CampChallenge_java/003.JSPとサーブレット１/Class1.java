/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.servlet.java.kaede;
//プリントライター呼び出す
import java.io.PrintWriter;

/**
 *
 * @author i_am_kaede
 */
public class Class1 {

    public String name = "";
    public Integer age;

    public void catdata() {

        this.name = "cat";
        this.age = 12;
    }
    
        // ２つの変数の中身をprintするパブリックなメソッド
    
        public void print(PrintWriter out){
            
            out.print(this.name+this.age);

    }

}
