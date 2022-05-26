package StreamIQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,10,30,3,440);
        System.out.println("maxNumber(list) = " + maxNumber(list));
        System.out.println("minNumber(list) = " + minNumber(list));
    }
    private static int maxNumber(List<Integer> list) {
        int maxNum = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
    return maxNum;
    }

    private static int minNumber(List<Integer> list) {
        int minNum = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
     return minNum;
    }
}
