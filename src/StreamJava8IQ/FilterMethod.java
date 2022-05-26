package StreamJava8IQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {
       /** ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(15);
        numberList.add(20);
        numberList.add(25);
        numberList.add(30);*/
        //We can also add all the element together using the Arrays.asListmethod

        List<Integer> numberList = Arrays.asList(10,15,20,25,30);
        List<Integer> evenNumber = new ArrayList<>();
        //Before java 8 we use Enhanced loop
        for(int n : numberList) {
            if(n%2==0) {
                evenNumber.add(n);
            }
        }
        System.out.println(evenNumber);
        // With the stream concept
       List<Integer> evenNumber1 = numberList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
       System.out.println(evenNumber1);

       // Insteade of storing in collection we can also and print
       // numberList.stream().filter(n -> n%2==0).forEach(n-> System.out.println(n));
        //Insteade of lamda, We can also use println by calling the method using double colon
        numberList.stream().filter(n -> n%2==0).forEach(System.out::println);

        List<String> names = Arrays.asList("Biniyam","null","mekdes", "Rediet","null", "Mary", "Tefera");
        List<String> longestName = names.stream().filter(str -> str.length() > 6 && str.length() < 8).collect(Collectors.toList());
        System.out.println(longestName);

       /** List<String> notNull = names.stream().filter(str ->str!="null").collect(Collectors.toList());
        System.out.println(notNull);**/
       names.stream().filter(e -> e!=null).forEach(System.out::println);
        System.out.println("********Avoiding lamda****88");
       names.stream().filter(e -> e!=null).forEach(str -> System.out.println(str));

    }
}
