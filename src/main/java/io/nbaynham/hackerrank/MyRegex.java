package io.nbaynham.hackerrank;

class MyRegex {
    boolean isValidIP(String nextCase) {
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
        return nextCase.matches(pattern);
    }
}
