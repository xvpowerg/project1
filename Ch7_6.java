/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch7_20190613;

/**
 *
 * @author howard
 */
public class Ch7_6 {

//字串永遠不會改變自己
    public static void main(String[] args) {
        //數字 < 大寫< 小寫 < 中文
        String s1 = "Cdfg";
        String s2 = "abc";
        //如果s1 大於 s2 回傳正數 
        //如果s1 小於 s2 回傳負數 
        //如果s1 等於 s2 回傳0
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        /*String s3 = "efghijk";
       
      int index =  s3.indexOf("gh");
       if (index >= 0){
           System.out.println("找到了!!");
       }
       for (int i =0; i < s3.length();i++){
            char tmp = s3.charAt(i);
            if (i!=0 && i %2 ==0){
                System.out.println();
            }
            System.out.print(tmp+" ");
       }*/
       
       String s4 = "12345678";
       String newS4 = s4.substring(3);
       System.out.println(newS4);
       int start = 2;
       int end = 6;
       //substring取範圍為>=start < end
       String newS42 = s4.substring(start,end);
       System.out.println(newS42);
       
        
        
    }
    
}
