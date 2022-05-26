package StreamJava8IQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SumOfNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,10,30,3);
        System.out.println("sumNumber(list) = " + sumNumber(list));
    }
    private static int sumNumber(List<Integer> list) {
        //Optional<Integer> sum =  list.stream().reduce((p, q) -> p+q);
       int sum2 =  list.stream().sorted().sorted().skip(2).reduce((p , q) -> p+q).get();
       Optional<Integer> sum = list.stream().sorted(Collections.reverseOrder()).distinct().skip(2).reduce((p, q) ->p + q);
       // return sum.get();
        return sum2;
    }
}
