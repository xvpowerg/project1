/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch7_20190613;
public class Ch7_1 {
    //讀取權限的分類
    //public 
    //protected
    //default(沒有輸入)
    //private 只有自己類別可讀
    
    //在相同package
    //public protected default 都可被讀取
    //在不同package
    //只有public可被讀取
    
   //protected 與 default 的差異在於 在不同package時，protected可透過繼承讀取
    //protected 含意 如果跨package 必須透過繼承才讀取
    //default 跨package就不能讀取
    public static void main(String[] args) {
     Test1 t1 = new Test1();
     t1.publicMethod();
     t1.protectedMethod();
     t1.defaultMethod();
     
    }
    
}
