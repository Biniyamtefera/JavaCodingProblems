package StreamJava8IQ.MapMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultplyBYNumber {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(2,3,4,5,6);
        //Before Stream
        List<Integer> mulNumber = new ArrayList<>();
           for(int num : numbersList) {
               mulNumber.add(num*3);
           }
        System.out.println(mulNumber);

        System.out.println("******After using Stream map concept***********");
        List<Integer> multipliedElement = numbersList.stream().map(e -> e*3).collect(Collectors.toList());
        System.out.println(multipliedElement);
        numbersList.stream().map(e -> e*3).forEach(num -> System.out.println(num));
        System.out.println("*******Print without lamda expression");
        numbersList.stream().map(n -> n*3).forEach(System.out::println);
    }
}
