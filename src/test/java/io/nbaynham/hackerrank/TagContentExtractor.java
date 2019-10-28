package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

public class TagContentExtractor {
    private final String[] TEST_CASES = {
        "<h1>Nayeem loves counseling</h1>",
        "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
        "<Amee>safat codes like a ninja</amee>",
        "<SA premium>Imtiaz has a secret crush</SA premium>"
    };

    @Test
    public void test() {
        for (String item : TEST_CASES) {
            System.out.println(getInnerText(item));  // getInnerText will handle everything recursively
        }
    }

    private String getInnerText(String text) {
        // find the position of the text within the outer most tag
        int leftPosition = findLeft(text);
        int rightPosition = findRight(text);
        if (leftPosition == -1 || rightPosition == -1) return text;     // no tags, so whatever text is available must be the answer
        return getInnerText(text.substring(leftPosition, rightPosition));
    }

    private int findLeft(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i+1).equals(">")) {
                return i + 1;
            }
        }
        return -1;
    }

    private int findRight(String text) {
        for (int i = text.length() - 1; i > 1; i--) {
            String nextString = text.substring(i - 1, i + 1);
            if (nextString.equals("</")) {
                return i - 1;
            }
        }
        return -1;
    }
}
