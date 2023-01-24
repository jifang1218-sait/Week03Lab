/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fang.week3lab_calculators.utils;

/**
 *
 * @author jifang
 */
public class StringUtils {
    public static boolean isNumeric(String value) {
        boolean ret = false;
        
        try {
            Integer.valueOf(value);
            ret = true;
        } catch (NumberFormatException e) {
        }
        
        return ret;
    }
    
    public static int toInt(String value) {
        return Integer.parseInt(value);
    }
}
