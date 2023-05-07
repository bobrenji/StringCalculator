package org.bob.learnings;

public class StringCalculator {
    public int add(String inputStrings) {
        int result = 0;
        if(inputStrings.isEmpty()) {
            return 0;
        }
        String[] numberArray = inputStrings.split(",");
        if(numberArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma(,) are allowed");
        } else {
            for (String numberStr: numberArray) {
                int number = Integer.parseInt(numberStr);
                result += number;
            }
        }
        return result;
    }
}
