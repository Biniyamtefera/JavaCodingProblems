package StreamIQ;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,10,30,3);
        System.out.println("squareAverage(list) = " + squareAverage(list));
    }
    private static double squareAverage(List<Integer> list) {
      //  Double avgNumber = list.stream().mapToInt(e->squareAverage(e)).
        //Extracting only number greater than 100
        //map is getting in arraylist  // filter always take a boolean predicator
       Double squaAvg =  list.stream().map(e -> e*e)
                .filter(e -> e > 100)
                .mapToInt(e ->e)
                .average().getAsDouble();
       return squaAvg;
    }
}
