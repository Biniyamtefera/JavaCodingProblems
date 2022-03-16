package ArraysProblem;

public class Array_FindMinimum {
    public static void main(String[] args) {
        int [] num = {3,43,5,33,54,33};
        System.out.println("minNumber(num) = " + minNumber(num));
    }
    public static int minNumber(int [] arr) {
        int min = Integer.MIN_VALUE;
        for(int each : arr) {
            if(each < min) {
                min = each;
            }
        }
        return min;
    }
}
