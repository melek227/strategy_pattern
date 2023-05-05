/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy_pattern;

/**
 *
 * @author melek
 */
public class OraclaDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("veri getirildi:Oracle");
    }
    
}
