/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_posttest1_013;

/**
 *
 * @author Bramantyo
 */
 
public class Athlete {
    String nama;
    int umur;
    String tmptLahir;
    String tglLahir;
    String kurata;
    double bB;
    double tB;
    
    
    public Athlete(String nama,int umur, String tmptLahir,String tglLahir,String kurata, double bB, double tB){
        this.nama = nama;
        this.umur = umur;
        this.tmptLahir = tmptLahir;
        this.tglLahir = tglLahir;
        this.kurata = kurata;
        this.bB = bB;
        this.tB = tB;
    }
    
    public void registrasi(){
        System.out.println(" " + this.nama);
        System.err.println(" " + this.umur);
        System.out.println(" " + this.tmptLahir);
        System.out.println(" " + this.tglLahir);
        System.out.println(" " + this.kurata);
        System.out.println(" " + this.bB);
        System.out.println(" " + this.tB);
        System.out.println("Data Atlit telah terdaftar");
    }

    public void terupdate(){
        System.out.println(" " + this.nama);
        System.err.println(" " + this.umur);
        System.out.println(" " + this.tmptLahir);
        System.out.println(" " + this.tglLahir);
        System.out.println(" " + this.kurata);
        System.out.println(" " + this.bB);
        System.out.println(" " + this.tB);
        System.out.println("Data Atlit Telah Terupdate");
    }
}
