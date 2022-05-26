package loop;

public class PetersonNumber {
    /**
     * A number is said to be a Peterson number if the sum of factorials of each digit of
     * the number is equal to the number itself. Example: Input : n = 145 Output = Yes Explanation: 145 = 5! + 4!
     */
    public static void main(String[] args) {

        isPetersonNumber(141);

    }

    static void isPetersonNumber(int num) {

        int temp=num;//storing the number in a temporary
        //145 /10 14/10 1
        int f=1,sum=0;
          while(num != 0) {
              f=1;
              int r=num%10;
              //for loop to find the factorial of a digit
              for(int i=1;i<=r;i++)
              {
                  f=f*i;
              }
              sum=sum+f;//adding the factotial of the digits
              num=num/10;  //145/10 => 14%4  14/10 =>1

              }

        //checking if the sum of the factorial of digits
        //is equal to the number or not
        if(sum==temp)
            System.out.println("PETERSON NUMBER");
        else
            System.out.println("NOT PETERSON NUMBER");



          }



}
