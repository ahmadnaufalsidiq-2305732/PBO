package com.nflsdq.praktikumuts3;

public class palindrome {
    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }

        return reversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
