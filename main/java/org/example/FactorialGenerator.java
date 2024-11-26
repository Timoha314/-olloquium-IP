package org.example;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactorialGenerator {

    public static List<BigInteger> generateFactorials(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Input must be a natural number (n >= 1).");
        }
        List<BigInteger> factorials = new ArrayList<>();
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            factorials.add(factorial);
        }
        return factorials;
    }

    public static void main(String[] args) {
        try {
            int n = 10;
            List<BigInteger> factorials = generateFactorials(n);
            System.out.println("Первые " + n + " факториалов: " + factorials);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}