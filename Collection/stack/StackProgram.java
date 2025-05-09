import java.util.List;
import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();
        mystack.push(55);
        mystack.push(50);
        mystack.push(45);
        mystack.push(40);
        System.out.println(mystack);
        mystack.pop();
        System.out.println(mystack);
        
        System.out.println(mystack.peek());
        for (Integer st : mystack) {
            System.out.println(st);
            
        }

        
    }
}
