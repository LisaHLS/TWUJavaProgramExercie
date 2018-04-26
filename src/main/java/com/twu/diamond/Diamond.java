package com.twu.diamond;

public class Diamond extends IsoscelesTriangle{

    private int lines;
    public Diamond(int lines) {
        super(lines);
        this.lines = lines;
    }

    public void printDiamond() {
        super.printTriangle();
        for (int i = lines - 1, j = 2 * i - 1; i > 0; i--, j -= 2) {
            String asterisks = super.printAsterisks(j);
            System.out.println(String.format("%" + (lines + i - 1) + "s", asterisks));
        }
    }

    public static void main(String[] args) {
        int n = 3;
        new Diamond(n).printDiamond();
    }
}
