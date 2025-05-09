/**
 * FactorialProgram
 */

public class FactorialProgram {
    static int factorailNumber(int num){
        if (num == 1) {
            return 1;
        }
        return (num * factorailNumber(num - 1));
    }

    static int sumOfNumbers(int n){
        if (n == 1) {
            return 1;
        }
        return (n + sumOfNumbers(n - 1));
    }

    public static void main(String[] args) {
        
        // factorial of 5 = 6 * 5 * 4 * 3 * 2 * 1 = 120 
        // int fac = 1;
        // for (int i = 1; i <= 5; i++) {
        //     fac = fac * i; 
        // }
        System.out.println(factorailNumber(5));
        System.out.println(sumOfNumbers(100));


        
    }
}