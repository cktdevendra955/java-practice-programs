import java.util.Scanner;

public class SwapUsingthirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("SWAP VARIABLE USING THIRD VARIABLE");
        System.out.println("----------------------------------------");
        System.out.println();

        System.out.print("Enter Frist Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Frist Second : ");
        int b = sc.nextInt();

        System.out.println("-------------");
        System.out.println("BEFORE SWAPIG");
        System.out.println("--------------");
        System.out.println("A : "+ a);
        System.out.println("B : "+ b);
        
        int temp;        
        temp = a; //10
        a = b; //20
        b = temp; //10
        System.out.println("-------------");
        System.out.println("AFTER SWAPIG");
        System.out.println("--------------");
        System.out.println("A : "+ a);
        System.out.println("B : "+ b);


    }
                                        
}
