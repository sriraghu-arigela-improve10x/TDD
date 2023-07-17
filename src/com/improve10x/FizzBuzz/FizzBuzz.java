package com.improve10x.FizzBuzz;

public class FizzBuzz {

    public String findFizzBuzz(int n) {
        if (n > 0) {
            if (isDivisibleByThree(n) && isDivisibleByFive(n)) {
                return "FizzBuzz";
            } else if (isDivisibleByThree(n)) {
                return "Fizz";
            } else if (isDivisibleByFive(n)) {
                return "Buzz";
            }
        }
        return String.valueOf(n);
    }

    private static boolean isDivisibleByThree(int n) {
        return n % 3 == 0;
    }

    private static boolean isDivisibleByFive(int n) {
        return n % 5 == 0;
    }
}
