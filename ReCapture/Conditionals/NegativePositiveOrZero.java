package Conditionals;

import java.util.Scanner;

public class NegativePositiveOrZero {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        System.out.print("\nEnter Any number : ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Number is ZERO \n");            
        }else if(num > 0){
            System.out.println("Positive Number \n");            
        }else{
            System.out.println("Negative Number \n");            
        }
    }
}
