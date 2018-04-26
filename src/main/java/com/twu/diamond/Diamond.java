package com.twu.diamond;

/**
 * Created by ASUS on 2018/4/26.
 */
public class Diamond {
    public static final String ASTERISK = "*";

    private int lines;

    public Diamond(int lines) {
        this.lines = lines*2-1;
    }

    public void printDiamond() {
        if (lines % 2 == 0) {
            lines++; // 计算菱形大小
        }
        for (int i = 0; i < lines / 2 + 1; i++) {
            for (int j = lines / 2 + 1; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = lines / 2 + 1; i < lines; i++) {
            for (int j = 0; j < i - lines / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * lines - 1 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        new Diamond(n).printDiamond();
    }
}
