package ArraysProblem;

import java.util.Arrays;

public class Array_mergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {33,43,23,43};
        int[] arr2 = {23,33,13,53};
        System.out.println("Arrays.toString(mergeArrays(arr1, arr2)) = " + Arrays.toString(mergeArrays(arr1, arr2)));
    }
       /**
    Write a return method that can concat two arrays
     */
       public static int [] mergeArrays(int[] arr1, int [] arr2) {
           int [] mergeArray = new int[arr1.length+arr2.length];
            int j=0;
           for(int i =0; i < arr1.length; i++) {
               mergeArray[j] = arr1[i];
               j++;
           }
           for (int k =0; k < arr2.length;k++) {
               mergeArray[j] = arr2[k];
               j++;
           }
           return mergeArray;
       }
}
