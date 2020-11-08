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
 * Deskripsi Program : program hukum ohm
 */
public class Baterai {
    private final float kuatArus;
    private final float hambatan;

    public Baterai() {
        kuatArus = 3;
        hambatan = 12;
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus() {
        return kuatArus;
    }
    
    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan() {
        return getKuatArus() * getHambatan();
    }
}
