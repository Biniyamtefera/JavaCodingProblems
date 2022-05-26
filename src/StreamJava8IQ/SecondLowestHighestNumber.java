package StreamJava8IQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,10,30,3);
        System.out.println("secondLowest(list) = " + secondHighest(list));
        System.out.println("secondLowest(list) = " + secondLowest(list));
        System.out.println("secondHighest1(list) = " + secondHighest1(list));
    }
    private static int secondHighest(List<Integer> list) {
       int secHighest = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
    return secHighest;
    }
    private static int secondLowest(List<Integer> list) {
       int lowestNum =  list.stream().sorted().distinct().skip(1).findFirst().get();
        return lowestNum;
    }
    private static int secondHighest1(List<Integer> list) {
        int secHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        return secHighest;
    }

}
