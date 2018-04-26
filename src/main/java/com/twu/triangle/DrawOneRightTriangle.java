package com.twu.triangle;

import java.util.stream.IntStream;

/**
 * Created by ASUS on 2018/4/26.
 */
public class DrawOneRightTriangle {
    public static final String ASTERISK = "*";

    private int lines;

    public DrawOneRightTriangle(int lines) {
        this.lines = lines;
    }



    public void printAsterisks(int asterisksNum) {
        IntStream.range(0, asterisksNum).forEach(item -> System.out.print(ASTERISK));
    }

    public void printTriangle() {
        for (int i = 0; i < lines; i++) {
            printAsterisks(i + 1);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        new DrawOneRightTriangle(n).printTriangle();
    }
}
