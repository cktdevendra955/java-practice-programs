import java.util.Random;
import java.util.Scanner;

public class NumberGessing {

    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Between 1 to 10 : ");
        int num = sc.nextInt();
        int radNNumber = rm.nextInt(1,10);
        if (num == radNNumber) {
            System.out.println("You Wo The Game");
        }else{
            System.out.println("Try Again.............!");
        }

        System.out.println(radNNumber);
    }
    
}