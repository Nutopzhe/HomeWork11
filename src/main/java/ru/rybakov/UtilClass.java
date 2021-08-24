package ru.rybakov;

public class UtilClass {
    public String getStringFromArrayOfNumbers(int[] ints) {
        StringBuilder result = new StringBuilder();
        for (int i : ints) {
            result.append(i).append(" ");
        }
        return String.valueOf(result).trim();
    }
}
