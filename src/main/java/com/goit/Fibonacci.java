package com.goit;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static final Map<Integer, Long> memo = new HashMap<>();

//    Space Complexity  O(1)
//    Time Complexity O(n)

    public static long fibonacciIteration(int n) {
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        long prePreviousNumber = 0;
        long previousNumber = 1;
        long actualNumber = 0;
        for (int i = 1; i < n; i++) {
            actualNumber = prePreviousNumber + previousNumber;
            prePreviousNumber = previousNumber;
            previousNumber = actualNumber;
        }

        return actualNumber;
    }


//    Space Complexity O(n)
//    Time Complexity  O(2^n)

    public static long fibonacciDynamic(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long fib = fibonacciDynamic(n - 1) + fibonacciDynamic(n - 2);
        memo.put(n, fib);
        return fib;
    }

//    Space Complexity O(n)
//    Time Complexity  O(2^n)

    public static long fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

}