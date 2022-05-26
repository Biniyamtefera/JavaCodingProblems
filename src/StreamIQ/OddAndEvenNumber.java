package StreamIQ;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OddAndEvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,10,30,3,0);
        System.out.println("evenNumber(list) = " + evenNumber(list));
        System.out.println("oddNumber(list) = " + oddNumber(list));

    }
    private static List<Integer> evenNumber(List<Integer> list) {
        List<Integer> evenNumber = list.stream().filter(e -> e%2==0).filter(e->e!=0).collect(Collectors.toList());
        return evenNumber;
    }
    private static List<Integer> oddNumber(List<Integer> list) {
        List<Integer> oddNumber = list.stream().filter(e -> e%2!=0).collect(Collectors.toList());
        return oddNumber;
    }
}
