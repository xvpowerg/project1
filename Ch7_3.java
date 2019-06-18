/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch7_20190613;
import java.sql.SQLException;
import java.io.IOException;
/**
 *
 * @author howard
 */
public class Ch7_3 {
    public static void main(String[] args)throws SQLException {
        
        TestException tex = new TestException();
        //tex.readData();
        try{
         tex.connectDB();   
        }catch(SQLException ex){
            System.out.println(ex);
            for(StackTraceElement ste : ex.getStackTrace()){
                System.out.println(ste);
            }
        }catch(IOException ex){
            System.out.println(ex);
        }   
        
        
        
    }    
}
