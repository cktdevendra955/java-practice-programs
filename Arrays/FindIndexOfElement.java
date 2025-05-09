/*
FIND IDEX OF ELEMENT
*/

import java.util.Scanner;
 
public class FindIndexOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int[] arr = {10,20,55,33,78,95,415};
        System.out.println("------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.print("Enter Element : ");
        int elm = sc.nextInt();
        boolean status = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elm) {
                System.out.println("Index of array is : "+ i);
                status = true;
                break;
            }
        }
        if (!status) {
            System.out.println("Given Element not found");
        }
        System.out.println("------------------------------------");
        sc.close();
    }
}