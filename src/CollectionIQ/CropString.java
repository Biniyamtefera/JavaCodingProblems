package CollectionIQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CropString {
    public static void main(String[] args) {
        /**
         * Given a string, given a string without cropping the given index 
         * (Love is good, 7) >> Love is
         */

        String str = "I love reading book Since I born";
        System.out.println("cropString(str, 20) = " + cropString(str, 20));
        System.out.println("cropString(str, 3) = " + cropString(str, 3));
    }
    
    static String cropString(String str, int a) {
        //To Store in Array
        String[] str1 = str.split(" ");
        //To store in list then we can remove easily
        List<String> list = new ArrayList<>();
        //We can add all the array element in the list
        Collections.addAll(list,str1);

        //now check the given index if a bove the length of the string then return the original string
        if(str.length() < a) {
            return str;
        }else {
            // Starting from the back, remove the the last index from the list then
            //compare the remaing length of the string by converting the list to string by using join method
            //join method uses the String.join(delimter, list)
            //if the length after removing the the last index less than the given index then return the string
            //which after the String join
            for (int i= list.size()-1; i > 0  ; i--) {
                list.remove(i);
                if(String.join(" ", list).length() < a) {
                    return String.join(" ", list);
                }
            }
        }
        return String.join(" ", list);
    }

}
