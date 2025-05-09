import java.util.Scanner;

 
public class StackImp implements StackBluePrinnt{    
    Scanner sc = new Scanner(System.in);

    private int top = -1;
    private int arr[];
    
    StackImp(int size){
        arr = new int[size];
    }
    public int getTop() {
        return top;
    }
    public void setTop(int top) {
        this.top = top;
    }  

    @Override
    public boolean isEmpty() {
         if (getTop() == -1) {
            return true;
        }
        return false;
    }

    @Override
    public void push() {
        // TODO Auto-generated method stub
        if (isOverflow()) {
            System.out.println("Stack Is Over Flow");
        }else{
            System.out.print("Enter Elemwnt : ");
            int element = sc.nextInt();
            setTop(getTop()+1);
            arr[getTop()] = element;
        }
        
    }
    @Override
    public void pop() {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }else{            
            System.out.println("Poped Element Is : "+ arr[getTop()]);
            setTop(getTop()-1);
        }
        
    }
    @Override
    public void peek() {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }else{
            System.out.println(arr[getTop()]);
        }
        
    }  

    @Override
    public void display() {
        if (!isEmpty()) {
            System.out.println("***** Stack Eleents Is *****");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }            
        }else{
            System.out.println("Stack is Empty");
        }
        
    }
    @Override
    public boolean isOverflow() {
        // TODO Auto-generated method stub

        if (getTop() == arr.length - 1) {
            return true;
        }
        return false;
        
    }

   

}