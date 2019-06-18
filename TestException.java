/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch7_20190613;
import java.sql.SQLException;
import java.io.IOException;
/*
Exception
1 必要例外檢測 一定處理可能是try catch
  無法由軟體處理 如網路訊號過弱等等..硬碟壞軌...
  程式上的表達方式:直接繼承Exception的類別
2 非必要例外檢測 不一定要處理
  Ex:輸入不符合的Range
     程式上的表達方式:繼承RuntimeException的類別
*/
//必要例外檢測測試
public class TestException {  
    public void readData(){
        //假設發生了壞軌
        try{
          throw new Exception("硬碟壞軌");  
        }catch(Exception ex){
            System.out.println(ex);
        }        
    }
   //throws 定義方法可能拋出什麼錯誤
    public void connectDB()throws SQLException,IOException{
        boolean isConnect = false;
        boolean canRead = false;
        if (!canRead) throw new IOException();
        
        if (!isConnect){
            throw new SQLException();
        }
        
    }
    
    
}
