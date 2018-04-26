package com.twu.diamond;

public class DiamondWithName extends Diamond{
    private String name;

    private int lines;

    public DiamondWithName(String name, int lines) {
        super(lines);
        this.name = name;
        this.lines = lines;
    }

    public void printDiamond(boolean withName) {

        printTriangle(withName);

        for (int i = lines - 1, j = 2 * i - 1; i > 0; i--, j -= 2) {
            String asterisks = super.printAsterisks(j);
            System.out.println(String.format("%" + (lines + i - 1) + "s", asterisks));
        }
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
        String name = "Bill";
        int n = 3;
        new DiamondWithName(name, n).printDiamond(true);
    }
}
