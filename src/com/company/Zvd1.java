package com.company;

/**
 * Created by Алексей on 19.03.2017.
 */
public class Zvd1 {
    private double x = 0, y = 0, z = 0;

    Zvd1 (double _x){
    this.x = _x;
    F1();
    F2();
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    }

    private void F1 () {
        if (x < 0) {
            y = Math.pow(x, 2);
        }
        else {
            y = Math.pow(Math.exp(Math.cos(x)), ((double)1 / (double)5));
        }
    }

    private void F2 () {
        if (y < 2.0E-01) {
            z = (5.0E-01 * x - Math.pow(y, 3) + 1);
        }
        else
            if (y > 2.0E-01){
                z = Math.pow(y, 2) / (x - 0.4);
            }
            else
                if (y == 2.0E-01) {
                    z = (1 - Math.pow(y, 2)) / Math.pow(3, x);
                }
    }
}
