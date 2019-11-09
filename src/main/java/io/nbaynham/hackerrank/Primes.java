package io.nbaynham.hackerrank;

import java.math.BigInteger;

public class Primes {
    public static void main(String[] args) {
        for (final String CASE : CASES) {
            BigInteger bigInteger = new BigInteger(CASE);
            System.out.println(bigInteger.isProbablePrime(100));
        }
    }

    private static final String[] CASES = {
            "19",
            "11234234",
            "1",
            "4",
            "3"
    };
}
