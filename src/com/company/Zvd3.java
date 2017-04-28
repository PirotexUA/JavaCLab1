package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by Алексей on 25.04.2017.
 */
public class Zvd3 {
    Zvd3() {
        String str;
        char arr[];
        boolean exit = false;

        do {
            while (true) {
                try {
                    Scanner in = new Scanner(System.in);
                    System.out.println("Ведіть число з 5 цифрами:");
                    int a = in.nextInt();
                    str = Integer.toString(a);
                    if (str.length() != 5) System.out.println("ПОМИЛКА. Введіть число на 5 цифр!");
                    else break;
                } catch (InputMismatchException ex) {
                    System.out.println("ПОМИЛКА. Введіть число!");
                }
            }

            arr = str.toCharArray();

            if (((arr[0] - 48) + (arr[4] - 48)) > (arr[1] - 48)) {
                System.out.println("Цифра: " + arr[1] + ". Поизція :2.");
                exit = true;
            }

            if (((arr[0] - 48) + (arr[4] - 48)) > (arr[1] - 48)) {
                System.out.println("Цифра: " + arr[2] + ". Поизція :3.");
                exit = true;
            }

            if (exit) break;
            else
                System.out.println("Ведіть інше число!");
        }
        while (true);


    }


}
