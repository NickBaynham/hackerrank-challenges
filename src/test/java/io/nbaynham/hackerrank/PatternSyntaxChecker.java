package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    @Test
    public void test() {
        String[] sampleInput = {
                "([A-Z])(.+)",
                "[AZ[a-z](a-z)",
                "batcatpat(nat"
        };

        for (String pattern : sampleInput) {
            System.out.println(checkPattern(pattern));
        }
    }

    private boolean checkPattern(String pattern) {
        try {
            Pattern.compile(pattern);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
