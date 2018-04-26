package com.twu.triangle;

import java.util.stream.IntStream;

/**
 * Created by ASUS on 2018/4/26.
 */
public class DrawOneHorizontalLine {
    public static final String ASTERISK = "*";

    private int asterisksNum;

    public DrawOneHorizontalLine(int asterisksNumber) {
        this.asterisksNum = asterisksNumber;
    }

    public void printAsterisks() {
        IntStream.range(0,asterisksNum).forEach(item -> System.out.print(ASTERISK));
    }

    public static void main(String[] args) {
        int n = 8;
        new DrawOneHorizontalLine(n).printAsterisks();
    }
}
