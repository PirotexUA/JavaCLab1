package com.company;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Created by Алексей on 19.03.2017.
 */
public class Zvd2 {
    private final double xPoch = -5.6E00, xKinc = 3.17E00, xDelta = 4.5E-01;
    private double fX = 0;

    Zvd2() {
        System.out.println();
        System.out.println();
        System.out.println("Друге завдання:");
        System.out.println();
        int i = 0;

        out.println(format("%2s | %18s |", "#", "Fx:"));

        for (double _i = xPoch; _i <= xKinc; _i = _i + xDelta) {
            i++;
            fX = pow(_i + (5.0E-01 * cos(_i)), (double)1/(double)3);
            out.println(format("%2d | %18.16f |", i, fX));
        }

    }
}
