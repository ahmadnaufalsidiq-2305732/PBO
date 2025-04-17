package com.nflsdq.praktikumuts4;

public class PraktikumUTS4 {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(30, 40, 50);
        Balok balok3 = new Balok();
        
        balok3.setPanjang(25);
        balok3.setLebar(35);
        balok3.setTinggi(45);
        
        System.out.println("Balok dengan panjang: " + balok1.getPanjang() 
                + ", lebar: " + balok1.getLebar() + " dan tinggi: " + balok1.getTinggi() 
                + ". Luasnya: " + balok1.getLuas() + ", sedangkan kelilingnya: " + balok1.getKeliling() 
                + " dan volumenya: " + balok1.getVolume());
        System.out.println("Balok dengan panjang: " + balok2.getPanjang() 
                + ", lebar: " + balok2.getLebar() + " dan tinggi: " + balok2.getTinggi() 
                + ". Luasnya: " + balok2.getLuas() + ", sedangkan kelilingnya: " + balok2.getKeliling() 
                + " dan volumenya: " + balok2.getVolume());
        System.out.println("Balok dengan panjang: " + balok3.getPanjang() 
                + ", lebar: " + balok3.getLebar() + " dan tinggi: " + balok3.getTinggi() 
                + ". Luasnya: " + balok3.getLuas() + ", sedangkan kelilingnya: " + balok3.getKeliling() 
                + " dan volumenya: " + balok3.getVolume());
    }
}
