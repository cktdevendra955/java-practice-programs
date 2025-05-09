import java.util.Scanner;

public class ScannerProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.println("-------------------");
        System.out.println("Table of : " + num);
        System.out.println("-------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }

    }
}
