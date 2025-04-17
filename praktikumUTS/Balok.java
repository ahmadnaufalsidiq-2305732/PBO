package com.nflsdq.praktikumuts4;

public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    
    Balok() {
        panjang = 1;
        lebar = 1;
        tinggi = 1;
    }

    Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }
    
    int getVolume() {
        return panjang * lebar * tinggi;
    }
    
    void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }
    
    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    public void setTinggi(int tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}
