/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strategy_pattern;

/**
 *
 * @author melek
 */
public class Strategy_pattern {

    public static void main(String[] args) {
        
        customerManager customerManager=new customerManager();
        customerManager.databaseManager=new OraclaDatabaseManager();//çalışacağımız database i newlemeliyiz.Base sınıf stratejimize atamalıyız
        customerManager.getCustomers();
        
    }
}
