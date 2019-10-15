package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

public class Reverse {
    private String[] testData = {
            "madam",
            "gentleman",
            "radar"
    };

    @Test
    public void test() {
        for (String testItem : testData) {
            if (reverse(testItem).equals(testItem)) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    private String reverse(String item) {
        StringBuilder result = new StringBuilder();
        for (int i = item.length() - 1; i >= 0; i--) {
            result.append(item.substring(i, i+1));
        }
        return result.toString();
    }
}
