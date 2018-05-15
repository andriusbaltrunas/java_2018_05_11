package com.kcs.days.third;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 6.  	Onutei sunkei sekasi mokytis matematik? ir ji neturi skai?iuotuvo,
 * pad?kite Onutei ir sukurkite skai?iuotuv? kuris atliktu:
 * a.       Sumos
 * b.      Skirtumo
 * c.       Dalybos, nepamirškite, kad dalyba iš nulio negalima!
 * d.      Daugybos
 * e.       K?limas laipsniu
 * Skai?iuoto veiksm? skai?iavimai turi b?ti atskiroje klas?je.
 * Onutei negalima leisti ?vesti blog? skai?i? ir netinkam? operacij? reikia prašyti pakartoti ?vedim?.
 * Onut? ?vedin?s veiksmus tokiu formatu : „12 + 12“, „50 - 15“ ir t.t.
 */
public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaicius ir veiksma tarp jus pvz: \"12 + 12\"");

        String line = scanner.nextLine();

        String[] items = line.split(" ");

        Calculator calculator = new Calculator();
        double numb, numb2;
        if (items.length == 3) {
            switch (items[1]) {
                case "+":
                     numb = getCorrectNumber(items[0], scanner, "Iveskite pirma skaiciu");
                     numb2 = getCorrectNumber(items[2], scanner, "Iveskite antra skaiciu");
                    //double sum = calculator.sum(numb, numb2);
                    System.out.println("Suma " + calculator.sum(numb, numb2));
                    break;
                case "-":
                    //TODO call minus method ^
                    break;
                default:
                    System.out.println("Nera tokio veiksmo mergyt");
            }
        } else {
            System.out.println("Nepasiseke bandyk dar karta");
        }
    }

    private static double getCorrectNumber(String numb, Scanner scanner, String text) {
        double result;
        try {
            result = Double.parseDouble(numb);
        }catch (NumberFormatException e){
            while (true){
                System.out.println(text);
                try {
                    result = scanner.nextDouble();
                    break;
                }catch (InputMismatchException ex){
                    System.out.println("Juk sakiau skaiciu");
                    scanner.nextLine();
                }
            }
        }
        return result;
    }
}
