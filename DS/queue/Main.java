package queue;

import java.util.Arrays;
import java.util.Scanner;

public class Main {    
    static int myQueue[];
    static int top = -1;


    static public boolean isEmpty(){
        if (top == -1) {
            return true;
        }
        return false;
    }
    static public boolean isFull(){
        if (top == myQueue.length - 1) {
            return true;
        }
        return false;
    }

    public static void add(int val){
        if (isFull()) {
            System.out.println("\n !!!!!!!!!!!!!! Queue is full !!!!!!!!!!!!!!");
        }else{
            top++;
            myQueue[top] = val;
            System.out.printf("\n Element %d Added In Queue ",val);
        }
    }

    public static int remove(){

        if (isEmpty()) {
            return 0;
        }else{
            int removedElement = myQueue[0];

            for (int i = 0; i < top; i++) {
                myQueue[i] = myQueue[i+1];
            }            
            top--;
            return removedElement;
        }
        
    }

    public static void disp(){
        if (isEmpty()) {
            System.out.println("Queue Is Empty");
        }else{
            System.out.print("Queue : ");
            for (int i = 0; i <= top; i++) {
                System.out.print(myQueue[i] + ", ");                
            }
            System.out.println();
        }
    }
  
    public static void main(String[] args) {        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter The Size of Queue : ");        

        // int SIZE = sc.nextInt();
        myQueue = new int[5];
        System.out.println();

        
        add(55);
        add(15);
        add(550);
        add(85);
        add(558);
        System.out.println();
        System.out.println("*******************************************");
         
        disp();
        System.out.println("Removed Elemnet : "+ remove());
        System.out.println("Removed Elemnet : "+ remove());
        System.out.println("Removed Elemnet : "+ remove());
         
        disp();
        
    }
}
