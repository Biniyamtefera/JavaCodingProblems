package StringIQ;

public class reverseSentenceAsExpected {
    public static void main(String[] args) {

        String str = "I am from California";
        System.out.println("reverse(str) = " + reverse(str));
    }
    /**
     * String xyz = "I am from California";
     *          *
     *          * String expectedOutput = "a in rofi laCmorfmaI"
     */

    public static String reverse(String str) {
       String str2 = "";
        for (int i = str.length()-1, j=0 ;j < str.length() ; j++) {
         if(!(str.charAt(j) + "").equals(" ")) {
             if((str.charAt(i) + "").equals(" ")){
                 i--;
                 continue;

             } else {
                 str2 +=str.charAt(i);
                 i--;
             }

         } else {
             str2 += " ";
         }
        }
        return str2;
    }
}
