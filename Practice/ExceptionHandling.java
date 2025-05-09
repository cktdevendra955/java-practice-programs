import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int y = sc.nextInt();
        int result;

        try{
            result = x / y;
            System.out.println("Result = " + result);
        }catch (ArithmeticException e) {
                System.out.println("Exception caught: Division by zero.");
        }
    }
}
