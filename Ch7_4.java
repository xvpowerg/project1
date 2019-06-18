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
public class Ch7_4 {
    public static void main(String[] args) {
       TestRuntimeException tre = new TestRuntimeException();
       System.out.println("Step 1");
       try{
          tre.setAge(-100);
            System.out.println("Step 2"); 
       }catch(IllegalArgumentException ex){
         System.out.println(ex);
    }
        System.out.println("Step 3");   
    
        
    }    
}
