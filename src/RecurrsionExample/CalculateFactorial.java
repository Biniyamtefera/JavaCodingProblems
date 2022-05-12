package RecurrsionExample;

public class CalculateFactorial {

    public static void main(String[] args) {
        System.out.println("calculateFactorial(4) = " + calculateFactorial(4));
        System.out.println("calculateFactorial2(4) = " + calculateFactorial2(4));
        System.out.println("iterativeFactorial(3) = " + iterativeFactorial(0));
    }

    private static int calculateFactorial(int num) {//5*4*3*2*11
        if(num!=0) {
            return num * calculateFactorial(num-1); //4*3
        }else {
            return 1;
        }
    }
    private static int calculateFactorial2(int num) {

        while(num!=0) {
             return num * calculateFactorial2(num-1);
        }
        return 1;
    }
    private static int iterativeFactorial(int num) {
        int factorial = 1;
        if(num < 0) {
            return -1;
        }
        for(int i=1; i <= num;i++) { //
            factorial *= i;
        }
        return factorial;
    }

}
