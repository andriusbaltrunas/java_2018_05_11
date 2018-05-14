package com.kcs.days.second;

/**
 * Created by andriusbaltrunas on 5/14/2018.
 */
public class FirstTask {

   /* Jonukas mokykloje gavo u�duot? patikrinti ar duoti terminai yra polindromai.
    Jam sunku pa?iam tai padaryti tod?l jis pra�o J?s? pagalbos. Para�ykite metod? kuris patikrint?
    ar duotas �odis yra polindromas (�odis ar sakinys kur? skaitant nuo galo gaunamas tas pats �odis
            ar sakinys, pvz. �KOL EINU �UNIE LOK�, �ARGI TEN NE TIGRA� , �S?D?K U�U K?D?S�).
    U�uomina: pa�alinti tarpus ir tuomet keliauti per pus? �od�io i� abiej? pusi? tikrinant ar sutampa raid?s.*/

    private static final String PALINDROME_1 = "KOL EINU �UNIE LOK";
    private static final String PALINDROME_2 = "ARGI TEN NE TIGRA";
    private static final String PALINDROME_3 = "S?D?K U�U K?D?S";

    public static void main(String[] args) {

        String[] palindromeMas = {PALINDROME_1, PALINDROME_2, PALINDROME_3};

      /*  for(int i = 0; i< palindromeMas.length; i++){
            String p = palindromeMas[i];
        }*/

        for(String p : palindromeMas){
            if(isWordIsPalindrome(p.replaceAll(" " , ""))){
                System.out.println("Polindromas");
            }else{
                System.out.println("Nepolindromas");
            }
        }

      /*  boolean isPalindrome = isWordIsPalindrome("KOL EINU �UNIE LOK".replaceAll(" ", ""));

        if(isPalindrome){
            System.out.println("Tai yra polindromas");
        }else {
            System.out.println("Tai nera polindromas");
        }*/

    }

    private static boolean isWordIsPalindrome(String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            int t = word.length() - 1 - i;
            char b = word.charAt(t);
            if (a != b) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

}
