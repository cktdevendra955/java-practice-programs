/* 
    Write a Java program to create a class called "Counter" with a static variable count. 
    Implement a constructor that increments count every time an object is created. 
    Print the value of count after creating several objects.
*/

class Counter{
  public static int count = 0;  
  Counter(){
    count++;
  }  
  public int getCount(){
    return count;
  }  
   public static void main(String args[]){
    Counter obj = new Counter();
    System.out.println(obj.getCount());

    Counter obj1 = new Counter();
    System.out.println(obj1.getCount());
    
    Counter obj2 = new Counter();
    System.out.println(obj2.getCount());
    
  }
}


