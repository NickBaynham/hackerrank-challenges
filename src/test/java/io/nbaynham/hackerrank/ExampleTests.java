package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

import java.util.Locale;

import static io.nbaynham.utils.Currency.getFormattedCurrency;
import static org.testng.Assert.assertEquals;

public class ExampleTests {
    private static final double number = 10.99;

    @Test
    public void currencyTest() {
        assertEquals(getFormattedCurrency(Locale.US, number), "$10.99");
        assertEquals(getFormattedCurrency(Locale.CHINA, number), "￥10.99");
        assertEquals(getFormattedCurrency(Locale.FRANCE, number), "10,99 €");
        assertEquals(getFormattedCurrency(new Locale("en", "in"), number), "Rs.10.99");
    }
}
