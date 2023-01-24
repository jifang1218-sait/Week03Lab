/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fang.week3lab_calculators.entity;

import java.io.Serializable;

/**
 *
 * @author jifang
 */
public class User implements Serializable {
    private int age;
    
    public User() {
        age = 0;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
