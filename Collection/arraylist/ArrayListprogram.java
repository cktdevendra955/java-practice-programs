package arraylist;

import java.util.*;

class ArrayListprogram{

  public static void main(String args[]){
  
    List<String> days = new ArrayList<>();   
    days.add("SUN");
    days.add("MON");    
    System.out.println(days);
    
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 1; i<10; i++){
      arr.add(i);
    }    
    System.out.println(arr);
    
    
    List<String> names = new ArrayList<>();
    names.add("Raj");
    names.add("Priya");
    names.add("Shashank");
    names.add("Ansh");
    
    

    System.out.println("Elements in ArrayList names : " + names);
    Collections.sort(names);
    System.out.println("Sorted Elements in ArrayList names : " + names);
    System.out.println("Element at index 2 : " + names.get(2));
    
    // METHOD 1
    
    System.out.println("********************************************************");
    for(int i = 0; i<names.size(); i++){
      System.out.println(names.get(i));
    }
    System.out.println("********************************************************");
    for(String obj : names){
    System.out.println(obj);
    }
    System.out.println("********************************************************");
    
    ListIterator<String> itr =  names.listIterator();
    while(itr.hasNext()){
    System.out.println(itr.next());
    }
    

    
  }
}
