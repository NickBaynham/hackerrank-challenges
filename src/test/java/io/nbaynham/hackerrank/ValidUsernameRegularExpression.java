package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegularExpression {
    private final String[] TEST_CASES = {
            "Julia",                 // < 8 characters, invalid
            "Samantha",              // Valid
            "Samantha_21",           // Valid
            "1Samantha",             // Invalid - Cannot start with non-alpha
            "Samantha?10_2A",        // Invalid - ? character not allowed
            "JuliaZ007"              // Valid
    };

    @Test
    public void test() {
        for (String test : TEST_CASES) {
            if (isValid(test)) System.out.println("Valid");
            else System.out.println("Invalid");
        }
    }

    private boolean isValid(String item) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9_]{7,29}$");
        Matcher matcher = pattern.matcher(item);
        return matcher.find();
    }
}
