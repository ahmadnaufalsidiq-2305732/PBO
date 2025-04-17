package com.nflsdq.praktikumuts3;
import java.util.Scanner;

public class PraktikumUTS3 {
    public static void main(String[] args) {
        Scanner projectScanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = projectScanner.nextInt();

        if (palindrome.isPalindrome(bilangan)) {
            System.out.println(bilangan + " adalah bilangan palindrom.");
        } else {
            System.out.println(bilangan + " bukan bilangan palindrom.");
        }

        int reversed = palindrome.reverse(bilangan);
        System.out.println("Bilangan terbalik: " + reversed);
    }
}
