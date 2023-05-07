package org.bob.learnings;

public class StringCalculator {
    public int add(String inputStrings) {
        if(inputStrings.isEmpty()) {
            return 0;
        }
        String[] numberArray = inputStrings.split(",");
        if(numberArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma(,) are allowed");
        } else {
            for (String number: numberArray) {
                Integer.parseInt(number);
            }
        }
        return 0;
    }
}
