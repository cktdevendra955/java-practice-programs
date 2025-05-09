import java.util.Scanner;

public class QueueImp implements QueueServices{


    Scanner sc = new Scanner(System.in);
    private int rear = -1;
    private int[] arr;

    QueueImp(int size){
        arr = new int[size];
    }

     
    public int getRear() {
        return rear;
    }
    public void setRear(int rear) {
        this.rear = rear;
    }    

    @Override
    public boolean isEmpty() {
        if (getRear() == -1) {
            return true;
        }
        return false;
    }

    @Override
    public void push() {        
        if (isOverflow() ) {
            System.out.println("Queue is Overflow");
        }else{
            setRear(getRear() + 1);
             System.out.print("Enter Your Element : ");
            int element = sc.nextInt();
            arr[getRear()] = element;
            System.out.println("ELEMENT Successfull Added IN the Queue");
        }
        
    }

    @Override
    public int pop() {
        int popedElement = arr[0];        
        for (int i = 0; i < getRear(); i++) {
            arr[i] = arr[i + 1];
        }
        setRear(getRear()-1);                

        return popedElement;
    }
    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue Is Empty");
        }else{
            System.out.println("***** THE ELEENTS ARE.. *****");
            System.out.println();

            for (int i = 0; i <= getRear(); i++) {
                System.out.printf("|_%d_",arr[i]);
                // System.out.print(arr[i]);
            }
            System.out.println();
        }

        
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            return -1;
        }else{
            return arr[getRear()];
        }
    }
    @Override
    public boolean isOverflow() {        
        if (getRear() == (arr.length -1)) {
            return true;            
        }
        return false;
    }    
}
