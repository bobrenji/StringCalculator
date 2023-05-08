package org.bob.learnings;

public class StringCalculator {
    public int add(String inputStrings) {
        int result = 0;
        if(inputStrings.isEmpty()) {
            return 0;
        }
        String[] numberArray = inputStrings.split(",");
        for (String numberStr: numberArray) {
            int number = Integer.parseInt(numberStr.trim());
            if(number < 0) {
                throw new RuntimeException("Illegal number");
            }
            result += number;
        }
        return result;
    }
}
