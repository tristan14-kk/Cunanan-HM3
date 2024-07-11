/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.milestonecalculator;

/**
 *
 * @author Cha
 */
public class Student {
    //attributes
    private String studentNumber;
    private String studentName;
    private float m1;
    private float m2;
    private float m3;
    private float averageGrade;
   
    //getter and setter methods
    //getter methods
    public String getStudentNumber() {
        return studentNumber;
    }
   
    public String getStudentName() {
        return studentName;
    }
   
    public String getm1() {
        return String.valueOf(m1);
    }
   
    public String getm2() {
        return String.valueOf(m2);
    }
   
    public String getm3() {
        return String.valueOf(m3);
    }
   
    public String getAveGrade() {
        return String.valueOf(averageGrade);
    }
   
    //setter methods
    public void setStudentNumber(String studNumber) {
        studentNumber = studNumber;
    }
   
    public void setStudentName(String studName) {
        studentName = studName;
    }
   
    public void setm1(float ms1) {
        ms1 = (float) (ms1*0.25);
        m1 = ms1;
    }
   
    public void setm2(float ms2) {
        ms2 = (float) (ms2*0.4);
        m2 = ms2;
    }
   
    public void setm3(float ms3) {
        ms3 = (float) (ms3*0.35);
        m3 = ms3;
    }
   
    //methods
    public float computeAverage() {
        averageGrade = m1+ m2 + m3;
        return averageGrade;
    }
}
