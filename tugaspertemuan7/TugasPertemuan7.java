package com.nflsdq.tugaspertemuan7;
import java.util.Scanner;

public class TugasPertemuan7 {
    public static void main(String[] args) {
        Scanner projecScanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        double a = projecScanner.nextDouble();
        
        System.out.print("Masukkan nilai b: ");
        double b = projecScanner.nextDouble();
        
        System.out.print("Masukkan nilai c: ");
        double c = projecScanner.nextDouble();
        
        System.out.print("Masukkan nilai d: ");
        double d = projecScanner.nextDouble();
        
        System.out.print("Masukkan nilai e: ");
        double e = projecScanner.nextDouble();
        
        System.out.print("Masukkan nilai f: ");
        double f = projecScanner.nextDouble();
        
        LinearEquation persamaan = new LinearEquation(a, b, c, d, e, f);
        
        if (persamaan.isSolvable()) {
            System.out.println("nilai x: " + persamaan.getX());
            System.out.println("nilai y: " + persamaan.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi");
        }
    }
}
