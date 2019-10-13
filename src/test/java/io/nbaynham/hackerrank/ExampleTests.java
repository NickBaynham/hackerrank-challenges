package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class ExampleTests {
    private static final String example = "Example";

    @Test
    public void test() {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        String currency = format.format(100.99);
        System.out.println("Currency in US: " + currency);
    }
}
