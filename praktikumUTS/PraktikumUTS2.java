package com.nflsdq.praktikumuts2;
import java.util.Scanner;

public class PraktikumUTS2 {
    public static void main(String[] args) {
        Scanner projectScanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris yang akan dicetak: ");
        int n = projectScanner.nextInt();
        
        System.out.print("Masukkan pattern yang akan dicetak(A/B/C/D): ");
        char pattern = projectScanner.next().charAt(0);
        
        switch(pattern) {
            case 'A':
            case 'a':
                new patternA().cetak(n);
                break;
            case 'B':
            case 'b':
                new patternB().cetak(n);
                break;
            case 'C':
            case 'c':
                new patternC().cetak(n);
                break;
            case 'D':
            case 'd':
                new patternD().cetak(n);
                break;
        }
    }
}
