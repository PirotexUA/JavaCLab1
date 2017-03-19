package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert x:");
        double x = in.nextDouble();
        Zvd1 ZvdObj1 = new Zvd1(x);
    }
}
