package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

import java.util.Locale;

import static io.nbaynham.utils.Currency.getFormattedCurrency;
import static org.testng.Assert.assertEquals;

public class CurrencyTests {

    @Test(groups={"unit", "functional"})
    public void currencyTest() {
        final double number = 10.99;
        assertEquals(getFormattedCurrency(Locale.US, number), "$10.99");
        // assertEquals(getFormattedCurrency(Locale.CHINA, number), "¥10.99");
        System.out.println(getFormattedCurrency(Locale.CHINA, number));
        //assertEquals(getFormattedCurrency(Locale.FRANCE, number), "10,99 €");
        System.out.println(getFormattedCurrency(Locale.FRANCE, number));
        assertEquals(getFormattedCurrency(new Locale("en", "in"), number), "Rs.10.99");
    }
}
