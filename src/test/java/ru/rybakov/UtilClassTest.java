package ru.rybakov;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilClassTest {

    public static UtilClass util;
    public static int[] array;
    static String result;

    @BeforeAll
    static void setUp() {
        util = new UtilClass();
        array = new int[]{10, -2, 44, 15};
    }

    @BeforeEach
    public void getString() {
        result = util.getStringFromArrayOfNumbers(array);
    }

    @Test
    public void stringClassReturn() {
        Assertions.assertEquals(result.getClass(), String.class);
    }

    @Test
    public void lengthStringIsGreaterThanElementsOfArray() {
        Assertions.assertTrue(result.length() > array.length);
    }

    @Test
    public void lengthStringIsShorterThanElementsOfArray() {
        Assertions.assertFalse(result.length() < array.length);
    }

    @Test
    public void stringNotNull() {
        Assertions.assertNotNull(result);
    }

    @Test
    public void stringContainsSpace() {
        Assertions.assertTrue(result.contains(" "));
    }

    @Test
    public void stringNotEmpty() {
        Assertions.assertFalse(result.isEmpty());
    }

    @Test
    public void matchOfArrayElementsWithNumbersInString() {
        String[] numbersToString = result.split("\\s");
        for (int i = 0; i < numbersToString.length; i++) {
            Assertions.assertEquals(array[i], Integer.parseInt(numbersToString[i]));
        }
    }

    @Test
    public void checkingTheLastCharForSpaceChar() {
        char[] arrayChars = result.toCharArray();
        Assertions.assertTrue(arrayChars[arrayChars.length - 1] != ' ');
    }

    @Test
    public void checkingTheFirstCharForSpaceChar() {
        char[] arrayChars = result.toCharArray();
        Assertions.assertTrue(arrayChars[0] != ' ');
    }
}
