package ArraysProblem;

import java.util.Arrays;

public class Arrays_moveAllZerosToTheEnd {
    public static void main(String[] args) {
         int [] arr = {4,0,4,0,6,3,8,0};
        System.out.println("Arrays.toString(moveZero(arr)) = " + Arrays.toString(moveZero(arr)));
    }
    /**
   write a program that can move all the zeros to the end of an array
    */
    public static int[] moveZero(int [] arr) {
        int [] newArr = new int[arr.length];
         int j =0;
        for(int i =0 ; i < arr.length; i++) {
            if(arr[i]!=0) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}
