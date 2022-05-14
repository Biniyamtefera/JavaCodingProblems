package LeetCode.Easy;

import java.util.Arrays;

public class TwoSum {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such
     * that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     * @param args
     */
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int target = 7;

        System.out.println("sumTwo(arr1, target) = " + Arrays.toString(sumTwo(arr1, target)));

    }

    public static int[] sumTwo(int[] num, int target) {
        int sum1 =0;
        int sum2 =0;
        int [] result = new int[2];

        for(int i=0; i < num.length; i++) {
            if(i == num.length-1) {
                sum1 = num[i] + num[i];
            } else {
                sum1 = num[i] + num[i];
                sum2 = num[i] + num[i + 1];
            }

            if(sum1 == target ) {
                result[0] = num[i];
                result[1] = num[i];
            } else if (sum2 ==target ) {
                result[0] = num[i];
                result[1] = num[i + 1];
            }
        }
        return result;
    }

}
