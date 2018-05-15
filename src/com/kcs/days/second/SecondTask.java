package com.kcs.days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 5/14/2018.
 */
public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecondTask secondTask = new SecondTask();

        while (true){
            System.out.println("Pasirinkite kokios figuros plota skaiciusite:\n1. Statciojo trikampio plotas\n2.Staciakampio plotas\n3.Kvadrato plotas\n4.Apskritimo plotas\n0 Baikti darba");
            int selectedMenuItem = (int)getCorrectNumb(scanner);
            switch (selectedMenuItem) {
                case 1:
                    secondTask.triangle(scanner);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Neradome veiksmo pakartokite");
                    break;
            }
        }

    }

    private void triangle(Scanner scanner) {
        System.out.println("Iveskite a statini");
        double a = getCorrectNumb(scanner);
        System.out.println("Iveskite b statini");
        double b = getCorrectNumb(scanner);
        System.out.println("Trikampio plotas " + (a*b/2));
    }

    private static double getCorrectNumb(Scanner scanner) {
        double result;
        while (true) {
            try {
                result = scanner.nextDouble();
  /*              if (result < 1 || result > 4) {
                    throw new InputMismatchException("Blogas diapozonas ");
                }*/
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogas formatas pakartoti");
                scanner.nextLine();
            }
        }
        return result;
    }
}
