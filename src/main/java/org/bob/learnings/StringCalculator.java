package org.bob.learnings;

public class StringCalculator {
    public int add(String inputStrings) {
        int result = 0;
        if(inputStrings.isEmpty()) {
            return 0;
        }
        String[] numberArray = inputStrings.split(",");
        for (String numberStr: numberArray) {
            result += Integer.parseInt(numberStr);
        }
        return result;
    }
}
