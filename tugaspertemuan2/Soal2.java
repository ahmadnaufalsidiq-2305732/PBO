/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.nflsdq.pertemuan2;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner projectScanner = new Scanner(System.in);
        
        System.out.print("Masukkan peringkat anda: ");
        int peringkat = projectScanner.nextInt();
        
        System.out.print("Apakah anda naik kelas? y/n: ");
        char pilih = projectScanner.next().charAt(0);
        boolean naikKelas = (pilih == 'y' || pilih == 'Y');
        
        if (peringkat == 1 && naikKelas) {
            System.out.println("Selamat anda mendapatkan hadiah!");
        } else if (peringkat > 1 && naikKelas) {
            System.out.println("Selamat anda tidak tinggal kelas!");
        } else {
            System.out.println("Kasihan sekali anda tidak naik kelas.");
        }
    }
}
