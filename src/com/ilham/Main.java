/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Main Baterai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("======Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan.");
        
        Baterai baterai = new Baterai();
        
        System.out.println("\nKuat Arus : " + baterai.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + baterai.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + baterai.hitungTegangan() + " volt");
    }
    
}
