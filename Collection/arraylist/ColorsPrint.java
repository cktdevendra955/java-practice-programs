package arraylist;

import java.util.ArrayList;
import java.util.Iterator; 
public class ColorsPrint {
    // Write a Java program to create an array list, 
    // add some colors (strings) and print out 
    // the collection.
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>(); 
        color.add("Blue");
        color.add("Red");
        color.add("Green");
        color.add("Yellow");
        System.out.println();
        System.out.println(color);

        System.out.println("\n******** ForEach Loop ********");
        for (String c : color) {
            System.out.print(c +"\t");
        }
        System.out.println("\n******** For Loop ********");
        for (int i = 0; i < color.size(); i++) {
            System.out.print(color.get(i) + "\t");            
        }
        System.out.println("\n******** While Loop With Iterator********");        
        Iterator<String> itr = color.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }        
        System.out.println("\n******** While Loop ListIterator ********");       
    }    
}
