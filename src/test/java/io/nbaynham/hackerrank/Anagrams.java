package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    private static final String[][] testCases = {
            {
                    "anagram", "margana"
            },
            {
                    "Hello", "hello"
            }
    };

    private static final String[] expectedResults = {
            "Not Anagrams", "Anagrams"
    };

    @Test
    public void test() {
        for (String[] testCase : testCases) {
            if (isAnagram(testCase[0], testCase[1])) {
                System.out.println("Anagrams");
            } else System.out.println("Not Anagrams");
        }
    }

    private static boolean isAnagram(String a, String b) {
        Map<String, Integer> mapOfA = getMap(a);
        Map<String, Integer> mapOfB = getMap(b);
        return mapOfA.equals(mapOfB);
    }

    private static Map<String, Integer> getMap(String aString) {
        aString = aString.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < aString.length(); i++) {
            String nextCharacter = aString.substring(i, i + 1);
            if (map.containsKey(nextCharacter)) {
                int value = map.get(nextCharacter) + 1;
                map.replace(nextCharacter, value);
            } else {
                map.put(nextCharacter, 1);
            }
        }
        return map;
    }
}
