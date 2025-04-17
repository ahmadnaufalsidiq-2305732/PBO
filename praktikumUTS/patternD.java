package com.nflsdq.praktikumuts2;

public class patternD {
    public void cetak(int n) {
       System.out.println("Pattern D");
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    } 
}
