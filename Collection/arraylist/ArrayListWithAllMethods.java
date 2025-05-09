package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
 import java.util.Collections;

public class ArrayListWithAllMethods {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>(Arrays.asList(12,3,4,5,2,5,7,8));
        System.out.println(ll);
        ll.add(100);
        ll.addFirst(108);
        System.out.println(ll);
        ll.addLast(107);
        System.out.println(ll);

        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(11,22,33));
        ll.addAll(newList);
        System.out.println(ll);
        ll.addAll(5, newList);
        System.out.println(ll);
        System.out.println(ll.contains(5));
        System.out.println(ll.equals(newList));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getClass());
        System.out.println(ll.get(10));
        System.out.println(ll.indexOf(11));
        System.out.println(ll.isEmpty());
        System.out.println(ll.lastIndexOf(11));
        System.out.println(ll.size());
        System.out.println(ll.subList(5, 10));
        ll.sort(null);
        System.out.println(ll);
        ll.toArray();        
        ll.trimToSize();
        System.out.println(ll.reversed());     
        ll.removeAll(newList);
        System.out.println(ll);
        ll.remove((ll.size()-1));
        System.out.println(ll);
        Collections.shuffle(ll);
        System.out.println(ll);
    
    }
}
