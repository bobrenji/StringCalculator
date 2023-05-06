package org.bob.learnings;

public class StringCalculator {
    public Integer add(String inputStrings) {
        String[] numberArray = inputStrings.split(",");
        if(numberArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma(,) are allowed");
        } else {
            for (String number: numberArray) {
                Integer.parseInt(number);
            }
        }
        return 1;
    }
}
