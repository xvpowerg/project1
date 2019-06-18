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
public class Ch7_5 {


    public static void main(String[] args)throws MyException {
        // TODO code application logic here
        boolean testMyException = true;
        if (testMyException){
            //"測試客製錯誤!!..."
            throw new MyException("測試客製錯誤!!...");
        }
    
    
    }
    
}
