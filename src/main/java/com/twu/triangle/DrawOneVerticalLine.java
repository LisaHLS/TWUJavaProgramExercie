package com.twu.triangle;

import java.util.stream.IntStream;

/**
 * Created by ASUS on 2018/4/26.
 */
public class DrawOneVerticalLine {
    public static final String ASTERISK = "*";

    private int asterisksNum;

    public DrawOneVerticalLine(int asterisksNumber) {
        this.asterisksNum = asterisksNumber;
    }

    public void printAsterisks() {
        IntStream.range(0,asterisksNum).forEach(item -> System.out.println(ASTERISK));
    }

    public static void main(String[] args) {
        int n = 3;
        new DrawOneVerticalLine(n).printAsterisks();
    }
}
