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
public class TestRuntimeException {
    public void setAge(int age){
        if (age < 0 || age > 300){
            //throw new RuntimeException();
            throw new IllegalArgumentException("錯誤的年齡");
        }
    }
}
