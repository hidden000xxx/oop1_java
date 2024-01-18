/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

/**
 *
 * @author ADMIN
 */
public class Student extends Person{
    private String masv,email;
    private double diemtk;
    public Student(){}
    public Student(String msv,String em,double dtk,String ht,int ns,String dc,String gt){
        super(ht,dc,gt,ns);
        masv=msv;
        email=em;
        diemtk=dtk;
    }
    public void setMasv(String msv){
        masv=msv;
    }
    public String getMasv(){
        return masv;
    }
    public void setEmail(String em){
        email=em;
    }
    public String getEmail(){
        return email;
    }
    public void setDiemtk(double dtk){
        diemtk=dtk;
    }
    public double getDiemtk(){
        return diemtk;
    }
    public void display(){
        super.display();
        System.out.println("Ma sinh vien: "+masv);
        System.out.println("Email: "+ email);
        System.out.println("Diem tong ket: "+diemtk);
    }
}
