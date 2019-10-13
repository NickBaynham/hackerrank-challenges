package io.nbaynham.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency {
    public static String getFormattedCurrency(Locale locale, double number) {
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(number);
    }
}
