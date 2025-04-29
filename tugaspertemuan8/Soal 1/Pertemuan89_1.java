package com.nflsdq.pertemuan89_1;
import java.util.Scanner;

public class Pertemuan89_1 {

    public static void main(String[] args) {
        Scanner projectScanner = new Scanner(System.in);

        System.out.print("Masukkan sisi 1 segitiga: ");
        double sisi1 = projectScanner.nextDouble();
        System.out.print("Masukkan sisi 2 segitiga: ");
        double sisi2 = projectScanner.nextDouble();
        System.out.print("Masukkan sisi 3 segitiga: ");
        double sisi3 = projectScanner.nextDouble();

        System.out.print("Masukkan warna: ");
        String warna = projectScanner.next();

        System.out.print("Apakah segitiga terisi? (true/false): ");
        boolean terisi = projectScanner.nextBoolean();

        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        System.out.println("\nInformasi Segitiga:");
        System.out.println(segitiga.toString());
        System.out.println("Luas: " + segitiga.getLuas());
        System.out.println("Keliling: " + segitiga.getKeliling());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.isTerisi());
    }
}
