package ArraysProblem;

public class IsNegPosZer {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9,9,9};
        System.out.println("isPostNegZero(arr) = " + isPostNegZero(arr));
        System.out.println("isPostNegZero1(arr) = " + isPostNegZero1(arr));
    }

    static int isPostNegZero(int [] arr) {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                return 0;
            } else if(arr[i] < 0){
                count++;
            }
        }
        return (count % 2 ==0) ?  1:-1;
    }
    static int isPostNegZero1(int [] arr) {
        //int count =0;
        boolean isNegative = false;
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            result *=arr[i];
        }
        if (result ==0) {
            return 0;
        } else if(result > 0) {
            return 1;
        }else {
            return -1;
        }

    }
}
