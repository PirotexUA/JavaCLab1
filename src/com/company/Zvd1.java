package com.company;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by Алексей on 19.03.2017.
 */
public class Zvd1 {
    private double x = 0, y = 0, z = 0;

    Zvd1 () {
        System.out.println();
        System.out.println();
        System.out.println("Перше завдання:");
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Insert x:");
        x = in.nextDouble();

        F1();
        F2();
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    private void F1 () {
        if (x < 0) {
            y = pow(x, 2);
        }
        else {
            y = pow(exp(cos(x)), (1.0E00 / 5.0E00));
        }
    }

    private void F2 () {
        if (y < 2.0E-01) {
            z = (5.0E-01 * x - pow(y, 3.0E00) + 1.0E00);
        }
        else
            if (y > 2.0E-01){
                z = pow(y, 2.0E00) / (x - 0.4E00);
            }
            else
                if (y == 2.0E-01) {
                    z = (1 - pow(y, 2.0E00)) / pow(3.0E00, x);
                }
    }
}
