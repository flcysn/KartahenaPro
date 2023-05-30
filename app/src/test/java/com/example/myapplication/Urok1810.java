package com.example.myapplication;

import java.util.Scanner;

public class Urok1810 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double x1 = (1 + y);
        double x2 = (2 * x);
        double x3 = (y * y);
        double x4 = (x + y);
        double x6 = (x * x);
        double x7 = (x6 - 4);
        double x9 = (1.0 / x7);
        double x5 = (y + x9);
        double x8 = (x4 / x5);
        double x10 = (x2 + x3);
        double x11 = (x10 - x8);
        double x12 = (x1 * x11);
        System.out.println(x12);
    }
}
