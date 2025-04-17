package com.nflsdq.praktikumuts2;

public class patternC {
    public void cetak(int n) {
        System.out.println("Pattern C");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
