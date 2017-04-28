package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by Алексей on 19.03.2017.
 */
public class Zvd1 {
    private double a = 0, b = 0, t = 0, n = 0, x = 0, z = 0, y = 0;

    Zvd1 () {
        System.out.println();
        System.out.println();
        System.out.println("Завдання 1:");
        System.out.println();

        while (true)
        {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Insert a:");
                a = in.nextDouble();
                System.out.println("Insert b:");
                b = in.nextDouble();
                System.out.println("Insert t:");
                t = in.nextDouble();
                System.out.println("Insert n:");
                n = in.nextDouble();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Неправильно! Ведіть число!");
            }
        }

        F1();
        F2();
        System.out.println("x = " + x);
        System.out.println("z = " + z);
    }

    private void F1 () {
        x = min(a, b) / min (t, n);
    }

    private void F2 () {
        if (x > 5.0E-01) {
            z = log(pow(x, 2.0E00) + 1.5E01) + pow(t, 2.0E00);
        }
        if (x < 5.0E-01) {
            z = cos( (3.0E00 *x - 1.1E00) / 1.5E01) + 3.0E-01 * t * exp(x);
        }
        if (x == 5.0E-01) {
            z = x * pow(t + n, 1.0E00 / 3.0E00);
        }
    }
}
