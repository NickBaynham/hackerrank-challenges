package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SubstringComparisons {
    @Test
    public void test() {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= s.length()-k; i++) {
            list.add(s.substring(i, i + k));
        }
        java.util.Collections.sort(list);
        smallest = list.get(0);
        largest = list.get(list.size() - 1);
        return smallest + "\n" + largest;
    }
}