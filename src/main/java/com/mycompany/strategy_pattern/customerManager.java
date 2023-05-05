/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy_pattern;

/**
 *
 * @author melek
 */
public class customerManager {
    BaseDatabaseManager databaseManager; //base sınıf stratejimizdir.hangi veritabanı sistemini verirsek onun getdatası çalışacak
    
    public void getCustomers(){
        databaseManager.getData();
    }
    
}
