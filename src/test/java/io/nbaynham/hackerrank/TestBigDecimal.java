package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestBigDecimal {
    @Test
    public void test() {
        Arrays.sort(cases, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal(o1);
                BigDecimal b = new BigDecimal(o2);
                return a.compareTo(b);
            }
        }));
        for (String nextCase : cases) {
            System.out.println(nextCase);
        }
    }

    private String[] cases = {
            "-100",
            "50",
            "0",
            "56.6",
            "90",
            "0.12",
            ".12",
            "02.34",
            "000.000"
    };
}
