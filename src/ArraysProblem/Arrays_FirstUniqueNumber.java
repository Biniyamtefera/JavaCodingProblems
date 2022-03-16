package ArraysProblem;

public class Arrays_FirstUniqueNumber {
    public static void main(String[] args) {
       int [] arr = {34,33,22,2,4,33,5,22};
       firstDuplicate(arr);
    }

    /**
    write a program that can find the first duplicated element from the array
     */

    public  static void firstDuplicate(int [] arr) {
        int firstDuplicate;

        int count =0;
        for(int i=0; i < arr.length; i++) {
            count=0;
            for(int j=0; j < arr.length; j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            if(count > 1) {

                System.out.println(firstDuplicate=arr[i]);
                break;
            }
        }

    }


}
