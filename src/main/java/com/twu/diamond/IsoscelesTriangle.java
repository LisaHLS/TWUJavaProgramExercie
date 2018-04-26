package com.twu.diamond;

import java.util.stream.IntStream;

/**
 * Created by ASUS on 2018/4/26.
 */
public class IsoscelesTriangle {
    public static final String ASTERISK = "*";

    private int lines;

    private String name;

    public IsoscelesTriangle(int lines) {
        this.lines = lines;
    }

    public String printAsterisks(int asterisksNum) {
        return IntStream.range(0, asterisksNum).mapToObj(item -> ASTERISK).reduce("", String::concat);
    }

    public void printTriangle(boolean withName) {

        for (int i = 0, j = 1; i < lines; i++, j += 2) {

            String asterisks = printAsterisks(j);

            if (withName && name.length() > 0 && i == lines - 1) {
                System.out.println(name);

            }else{
                System.out.println(String.format("%" + (lines + i) + "s", asterisks));
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        new IsoscelesTriangle(n).printTriangle(false);
    }
}
