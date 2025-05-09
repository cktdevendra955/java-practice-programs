package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
        // System.out.println(list);
        System.out.println("********** USING FOR LOOP **********");        

        System.out.println("---------------");
        System.out.println("INDEX" + "\t|" + "VALUE");
        System.out.println("---------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "\t|" + list.get(i));
        }
        System.out.println("---------------");

        System.out.println("********** USING WHILE LOOP **********");        
        Iterator<Integer> itr =list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next()+"\t");
        }
        System.out.println();

        
        System.out.println("********** USING WHILE LOOP List Iterator (NEXT) **********");        
        ListIterator<Integer> itr2 = list.listIterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next()+"\t");            
        }
        System.out.println();
        System.out.println("********** USING WHILE LOOP List Iterator (PREVIOUS) **********");        
        
        while (itr2.hasPrevious()) {
            System.out.print(itr2.previous()+"\t");            
        }
        System.out.println();




    
    }
}
