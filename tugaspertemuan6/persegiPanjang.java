package com.nflsdq.tugaspertemuan6;

public class persegiPanjang {
    int panjang, lebar;
    
    persegiPanjang() {
        panjang = 1;
        lebar = 1;
    }
    
    persegiPanjang(int panjangBaru, int lebarBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    int getLuas() {
        return panjang * lebar;
    }
    
    int getKeliling() {
        return (2 * panjang) + (2 * lebar);
    }
    
    void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }
    
    void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }
}
