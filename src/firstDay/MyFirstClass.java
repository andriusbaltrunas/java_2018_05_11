package firstDay;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 5/11/2018.
 */
public class MyFirstClass {

    // statinis ne statini metoda tik per klases objekta

    //paleidzia programa psvm
    public static void main(String[] args) {
        // objekto sukurimas
        MyFirstClass myFirstClass = new MyFirstClass();

        float ff = 5.6f;

        myFirstClass.notStaticMethod("Value");

        System.out.println(sayHi());

        myFirstClass.checkThisNumber(50);

        System.out.println("Please insert a number!!!");
        Scanner scanner = new Scanner(System.in);

        try {
            int numb = scanner.nextInt();
            System.out.println("Your number is: " + numb);
        }catch (InputMismatchException e){
            System.out.println("Ivedete ne skaiciu");
        }


    }


    private void notStaticMethod(String name) {
        // sout trumpas parasymas
        System.out.println(name);
        sayHi();
    }

    private static String sayHi() {
        return "Hi Andrius";
    }

    private void checkThisNumber(int numb) {
        if (numb > 10 && numb < 60) {
            System.out.println("Daugiau");
        } else if (numb > 15) {
            System.out.println("daugiau uz 15");
        } else {
            System.out.println("maziau");
        }
    }


}
