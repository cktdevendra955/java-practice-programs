package arraylist;


import java.util.*;

class ArrayListStrinng{

  public static void main(String args[]){
    List<String> names = new ArrayList<>();    
    names.add("abc");
    names.add("xyz");
    names.add("pqr");
    names.add("mp");
    names.add("abc");
    names.add("wxy");
    names.add(0,"new one");
    System.out.println("Names List : "+ names);
    
    names.set(0,"updated");
    System.out.println("Names List : "+ names);
    
    names.remove(0);
    System.out.println("Names List : "+ names);
    /*
    ListIterator<String> itr = names.listIterator();
    
    while(itr.hasNext()){
      System.out.println("Element : "+ itr.next());
    }
    */
    
    if( names.contains("abc")){
      System.out.println("FOUND");
    }else{
      System.out.println("NOT FOUNND ");
    }
    
    Collections.sort(names);
    System.out.println("Names List : "+ names);
    
    Collections.shuffle(names);
    System.out.println("Names List : "+ names);



  }
}
