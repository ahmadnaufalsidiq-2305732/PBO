package com.nflsdq.tugaspertemuan6;

public class TugasPertemuan6 {
    public static void main(String[] args) {
        // objek persegi panjang 1 dengan constructor tanpa parameter
        persegiPanjang persegiPanjang1 = new persegiPanjang();
        
        System.out.println("Objek Persegi Panjang 1");
        System.out.println("Persegi panjang dengan panjang: " + persegiPanjang1.panjang + ", lebar: " + persegiPanjang1.lebar + ", Luasnya: " + persegiPanjang1.getLuas() + ", kelilingnya: " + persegiPanjang1.getKeliling());
        
        // objek persegi panjang 2 dengan constructor dan parameter
        persegiPanjang persegiPanjang2 = new persegiPanjang(30, 40);
        
        System.out.println("\nObjek Persegi Panjang 2");
        System.out.println("Persegi panjang dengan panjang: " + persegiPanjang2.panjang + ", lebar: " + persegiPanjang2.lebar + ", Luasnya: " + persegiPanjang2.getLuas() + ", kelilingnya: " + persegiPanjang2.getKeliling());
        
        // objek persegi panjang 3 tanpa constructor
        persegiPanjang persegiPanjang3 = new persegiPanjang();
        
        persegiPanjang3.setPanjang(25);
        persegiPanjang3.setLebar(35);
        
        System.out.println("\nObjek Persegi Panjang 3");
        System.out.println("Persegi panjang dengan panjang: " + persegiPanjang3.panjang + ", lebar: " + persegiPanjang3.lebar + ", Luasnya: " + persegiPanjang3.getLuas() + ", kelilingnya: " + persegiPanjang3.getKeliling());
    }
}
