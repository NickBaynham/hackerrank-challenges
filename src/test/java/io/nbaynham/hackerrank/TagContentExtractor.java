package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    private final String[] TEST_CASES = {
        "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
        "<h1>Nayeem loves counseling</h1>",
        "<Amee>safat codes like a ninja</amee>",
        "<SA premium>Imtiaz has a secret crush</SA premium>"
    };

    @Test
    public void testByRegex() {
        String regex = "<(.+)>([^<]+)<\\/\\1>";
        Pattern pattern = Pattern.compile(regex);
        for (String testCase : TEST_CASES) {
            Matcher matcher = pattern.matcher(testCase);
            boolean found = false;
            while(matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            };
            if (!found) System.out.println("None");
        }

    }
}
