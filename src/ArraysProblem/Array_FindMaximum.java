package ArraysProblem;

public class Array_FindMaximum {
    public static void main(String[] args) {
        int [] arr = {3,5,7,3,9,4};
        maxNumber(arr);
        System.out.println("maxNumber1(arr) = " + maxNumber1(arr));

    }

    public static void maxNumber(int[] arr ) {
        int max = arr[0];

        for (int i=0;i < arr.length;i++) {
            if(arr[i] > max ) {
                max= arr[i];
            }
        }
        System.out.println(max);
    }
    public static int maxNumber1(int[] arr2) {
        int max = Integer.MIN_VALUE;
        for(int each : arr2) {
            if(each > max) {
                max=each;
            }
        }
        return max;
    }
}
