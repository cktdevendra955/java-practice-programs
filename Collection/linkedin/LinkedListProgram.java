package linkedin;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(55);
        list.add(20);
        list.add(55);
        list.add(30);
        list.add(55);
        System.out.println(list);
    }
    
}