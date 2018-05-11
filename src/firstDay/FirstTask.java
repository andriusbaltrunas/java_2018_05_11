package firstDay;


import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 5/11/2018.
 */
public class FirstTask {

   /* Para�yti program? kuri papra�yt? vartotojo ?vesti �od? ir j? i� karto atvaizduot?,
    tada v?l papra�yt? ?vesti kit? �od?, j? atvaizduot?, ir proces? kartot? tol, kol nebus ?vestas �odis �pabaiga�.
    Patikrinkite ar ?vestas �od�io ilgis yra lyginis ar ne tam panaudokite % operatoriu.
    Jei �odis yra lyginis atspausdinkite �?vestas �odis  {?vestas_�odis}
    yra lyginis� ir �alia kokio ilgio yra �odis. Jei nelyginis �?vestas �odis {?vestas_�odis}
    nelyginis� �alia jo ilg?. Taip suskai?iuokite kiek tame �odyje yra �a� raid�i?.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.println("Iveskite zodi");
            word = scanner.nextLine();
            if (word.length() % 2 == 0) {
                System.out.println("Ivesteas zodis" + word + " yra lyginis, rasta raidziu " + countLetters(word, 'a'));
            } else {
                System.out.println("Ivestas zodis " + word + " yra nelyginis, rasta raidzius " + countLetters(word, 'a'));
            }
        } while (!word.equals("pabaiga"));
    }

    private static int countLetters(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

}
