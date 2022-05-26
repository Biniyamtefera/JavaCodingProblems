package StreamIQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,10,30,3,0);
        System.out.println("sortNum(list) = " + sortNum(list));
        System.out.println("sortNum2(list) = " + sortNum2(list));

    }
    private static List<Integer> sortNum(List<Integer> list) {
       List<Integer> AsscendingSort =  list.stream().sorted().collect(Collectors.toList());
       return AsscendingSort;
    }

    private static List<Integer> sortNum2(List<Integer> list) {
        List<Integer> descendingOrder = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        return descendingOrder;
    }
}
