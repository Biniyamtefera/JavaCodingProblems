package StreamIQ;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicateNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,10,30,3,100);
        System.out.println("dupNumber(list) = " + dupNumber(list));
        System.out.println("dupNumber2(list) = " + dupNumber2(list));
    }

    private static Set<Integer> dupNumber(List<Integer> list) {
       Set<Integer> duplicateNum =  list.stream().filter(e -> Collections.frequency(list, e) > 1)
               .collect(Collectors.toSet());
      return duplicateNum;
    }
    private static Set<Integer> dupNumber2(List<Integer> list) {
        Set<Integer> dupSet = new HashSet<>();

        Set<Integer> duplicateNum = list.stream().filter(e -> !dupSet.add(e)).collect(Collectors.toSet());
        return dupSet;
    }
}
