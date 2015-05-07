package com.company;

public class Main {


    static binsearch bin = new binsearch();

    public static void main(String[] args) {
        int points = 1000;
        System.out.println(bin.search(makeArray(1000000)));
//        double[] Binary_Average = new double[points];
//        for (int x = 1; x <= points; x++) {
//            Binary_Average[x - 1] = bin.search(makeArray(x));
//        }
    }

    public static int[] makeArray(int length) {
        int[] f = new int[length];
        for (int x = 1; x <= length; x++) {
            f[x - 1] = x;
        }
        return f;
    }
}