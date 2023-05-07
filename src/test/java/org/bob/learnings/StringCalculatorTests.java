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

    @Test
    public void whenEmptyStringIsPassedThenReturnZero() {
        Assert.assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void whenOneNumberIsPassedThenReturnSameNumber() {
        Assert.assertEquals(3, stringCalculator.add("3"));
    }

    @Test
    public void whenTwoNumbersArePassedThenReturnSumOfIt() {
        Assert.assertEquals(10, stringCalculator.add("5,5"));
    }

}
