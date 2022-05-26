package StreamJava8IQ.MapMethod;

import java.util.Arrays;
import java.util.List;

public class LengthOfString {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","Car","bicycle","flight", "train");
        //Before java 8 without stream
        for(String name : vehicles) {
            System.out.println("name.length() = " +name + " = "+ name.length());
        }
        //Apply Stream
        vehicles.stream().map(name -> name.length()).forEach(str -> System.out.println(str));
        System.out.println("****Without lamda expression to print the result ");
        vehicles.stream().map(name -> name.length()).forEach(System.out::println);
    }
}
