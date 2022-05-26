package StreamJava8IQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,-10,30,3);
        System.out.println("startWith(list) = " + startWith(list));
    }
    private static List<Integer> startWith(List<Integer> list) {
        List<Integer> staWith = list.stream().map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("3") || e.startsWith("-") )
                .map(e -> Integer.valueOf(e)).collect(Collectors.toList());

        return staWith;
    }
}
