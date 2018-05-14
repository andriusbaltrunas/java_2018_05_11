package com.kcs.days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 5/14/2018.
 */
public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pasirinkite kokios figuros plota skaiciusite:\n1. Statciojo trikampio plotas\n2.Staciakampio plotas\n3.Kvadrato plotas\n4.Apskritimo plotas");

/*        int selection = scanner.nextInt();

        System.out.println("Jusu pasirinkimas " + selection);*/

        getCorrectNumb(scanner);
    }

    private static int getCorrectNumb(Scanner scanner) {
        int result = 0;
        while (true) {
            try {
                result = scanner.nextInt();
                if (result < 1 || result > 4) {
                    throw new InputMismatchException("Blogas diapozonas ");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogas formatas pakartoti");
                scanner.nextLine();
            }
        }

        return result;
    }
}
