package StreamIQ;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AvgOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,13,1,2,2,10,30,3);
        System.out.println("averageNumber(list) = " + averageNumber(list));
    }
    private static double averageNumber(List<Integer> list) {
        double avg = list.stream().mapToInt(e ->e).average().getAsDouble();
        return avg;
    }
}
