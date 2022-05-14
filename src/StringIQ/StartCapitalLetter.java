package StringIQ;

import java.util.Arrays;

public class StartCapitalLetter {
    /**
     *
     * Write a function that verifies that every word in a sentence start with a capital letter
     * If the sentence is valid return an empty array if not return an array with all the word that violet the rule
     * (don't start with a capital letter)
     */
    public static void main(String[] args) {
        String str = "Biniyam tefera Amdenrhan tama";
        System.out.println("IsNotStartCapitalLetter(str) = " + Arrays.toString(IsNotStartCapitalLetter(str)));

    }
    static String[] IsNotStartCapitalLetter( String str) {
      String[] newStr = str.split(" ");
      String notCapital = "";
        System.out.println(Arrays.toString(newStr));

      for(int i =0 ; i < newStr.length; i++) {
          System.out.println("newStr[i].indexOf(0) = " + newStr[i].charAt(0));
          if(!Character.isUpperCase(newStr[i].charAt(0))) {
              str += newStr[i].charAt(0);
          }
      }
      return str.split("");
    }

}
