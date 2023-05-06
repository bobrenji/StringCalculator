package org.bob.learnings;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTests {
    StringCalculator stringCalculator = new StringCalculator();
    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenMoreThan2numbersAreUsed() {
        stringCalculator.add("1,2,3");
    }

    @Test
    public void when2NumbersAreUsedThenNoExceptionIsThrown() {
        stringCalculator.add("1,3");
        Assert.assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public void whenNonNumbersAreUsedThenThrowException() {
        stringCalculator.add("1,A");
    }
}
