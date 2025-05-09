

package Conditionals;

public class MaximumBetweenTwoNumbers {

    // Write a program to find maximum between two numbers

    public static void main(String[] args) {
        int x =200,y = 20;


        
        System.out.printf("\nvalue of X = %d \nvalue of Y = %d \n",x,y);
        
        if (x == y) {
            System.out.println("Given Value is Same \n" );
            System.exit(0);            
        }
        if (x > y) {
            System.out.println("Max Value is :"+x+"\n");            
            
        }else{
            System.out.println("Max Value is  :"+y+"\n");            
        }

       
          
    }
}