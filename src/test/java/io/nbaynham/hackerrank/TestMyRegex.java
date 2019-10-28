package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

public class TestMyRegex {

    private String[] testCases = {
            "10.100.5.1",
            "1.156.2.80",
            "000.12.12.034",
            "121.234.12.12",
            "000.12.234.23.23",  // invalid
            "666.666.666.666",
            ".10.10.10",
            "1234.1234.1234.124"
    };

    @Test
    public void testMyRegex() {
        MyRegex myRegex = new MyRegex();
        for (String nextCase : testCases) {
            System.out.println(nextCase + ", " + myRegex.isValidIP(nextCase));
        }
    }
}
