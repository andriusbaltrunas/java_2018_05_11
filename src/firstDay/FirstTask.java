package firstDay;


import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 5/11/2018.
 */
public class FirstTask {

   /* Parašyti program? kuri paprašyt? vartotojo ?vesti žod? ir j? iš karto atvaizduot?,
    tada v?l paprašyt? ?vesti kit? žod?, j? atvaizduot?, ir proces? kartot? tol, kol nebus ?vestas žodis „pabaiga“.
    Patikrinkite ar ?vestas žodžio ilgis yra lyginis ar ne tam panaudokite % operatoriu.
    Jei žodis yra lyginis atspausdinkite “?vestas žodis  {?vestas_žodis}
    yra lyginis” ir šalia kokio ilgio yra žodis. Jei nelyginis “?vestas žodis {?vestas_žodis}
    nelyginis” šalia jo ilg?. Taip suskai?iuokite kiek tame žodyje yra “a” raidži?.*/

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
