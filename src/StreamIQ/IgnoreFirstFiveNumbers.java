package StreamIQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IgnoreFirstFiveNumbers {
    public static void main(String[] args) {
       // List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,3,10.20,30,15,1,13,1,13,1,2,2,10,30,3));
        LimitTheNumber();
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,10,30,3);
        System.out.println("SumListOfLimitNumber(list) = " + SumListOfLimitNumber(list));
        System.out.println("SkipListOfLimitNumber(list) = " + SkipListOfLimitNumber(list));
        System.out.println("SumSkipListOfLimitNumber(list) = " + SumSkipListOfLimitNumber(list));
    }


    private static void LimitTheNumber() {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,10,30,3);
        List<Integer> listLimited = list.stream().limit(6).collect(Collectors.toList());
        System.out.println(listLimited);
    }

    private static int SumListOfLimitNumber(List<Integer> list) {
       int sum =  list.stream().limit(6).reduce((p,q) -> p+q).get();
        return sum;
    }
    private static List<Integer> SkipListOfLimitNumber(List<Integer> list) {
        List<Integer> skipNumber = list.stream().skip(6).collect(Collectors.toList());
        return skipNumber;
    }

    private static int SumSkipListOfLimitNumber(List<Integer> list) {
        int sumSkipNumbers = list.stream().skip(6).reduce((p,q) -> p + q).get();
        return sumSkipNumbers;
    }
}
