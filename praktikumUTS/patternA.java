package com.nflsdq.praktikumuts2;

public class patternA {
    public void cetak(int n) {
        System.out.println("Patern A");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
