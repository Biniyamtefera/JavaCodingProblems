package LeetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public static void main(String [] args) {
        int [] arr1 = {1,2,3,4,5};
        int target = 7;

        System.out.println("sumTwo(arr1, target) = " + Arrays.toString(twoSum(arr1, target)));
    }
    public static int [] twoSum(int [] num, int target) {
        int [] answer = new int[2];

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if(map.containsKey(target-num[i])) {  // target = num[i] + num[]
                answer[1] = i;
                answer[0] = map.get(target-num[i]);
                return answer;
            }
            map.put(num[i],i);
        }
   return answer;
    }
}
