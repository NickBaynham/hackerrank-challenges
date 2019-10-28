package io.nbaynham.hackerrank;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    private String regex = "\\b(\\w+)(?:,\\s+\\1\\b)+";
    private Pattern p = Pattern.compile(regex);
    private String[] cases = {
            "Goodbye bye bye world world world"
    };

    @Test
    public void test() {
        for (String testCase : cases) {
            System.out.println(testCase);
            Matcher matcher = p.matcher(testCase);
            System.out.println(matcher.find());
            while (matcher.find()) {
                System.out.println(matcher.replaceAll(""));
            }
        }
    }
}
