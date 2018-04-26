package com.twu.diamond;

/**
 * Created by ASUS on 2018/4/26.
 */
public class IsoscelesTriangle {
    public static final String ASTERISK = "*";

    private int lines;

    public IsoscelesTriangle(int lines) {
        this.lines = lines;
    }

    public void printTriangle() {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i * 2 - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        new IsoscelesTriangle(n).printTriangle();
    }

}
