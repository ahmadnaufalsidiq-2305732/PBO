package com.nflsdq.praktikumuts2;

public class patternB {
    public void cetak(int n) {
        System.out.println("Patern B");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
