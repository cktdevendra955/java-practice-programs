package linkedin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedProgram {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println();
         System.out.println(ll);        
        System.out.println(ll.offer(60));
        System.out.println(ll);
        ll.addFirst(1);
        ll.addLast(100);
        System.out.println(ll);
        ll.offerFirst(11);
        ll.offerLast(55);
        System.out.println(ll);
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(999);
        list.add(888);
        ll.addAll(list);
        System.out.println(ll);

        System.out.println(ll.indexOf(10));
        Iterator<Integer>  itr = ll.iterator();
        System.out.println("*********************");        
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");            
        }                
        System.out.println("\n*********************");             
        for (Integer item: ll) {
            System.out.print(item+" ");            
        }
        System.out.println("\n*********************");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i)+" ");                        
        }
        System.out.println("\n*********************");
        ListIterator<Integer> prev = ll.listIterator();
        while (prev.hasPrevious()) {
            System.out.println(prev.previous());            
        }



        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(11,22,33,44,55,66,77,88,99));
        ll.addAll(5,myList);
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.element());        
        System.out.println(ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll.poll());

    }   
    
}