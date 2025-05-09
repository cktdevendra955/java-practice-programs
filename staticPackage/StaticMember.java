    //  Static Variables:
    // Write a Java program to create a class called 
    // "Counter" with a static variable count. 
    // Implement a constructor that increments count every time an object is created. 
    // Print the value of count after creating several objects.

package staticPackage;

public class StaticMember { 
    static int count = 0;    
    StaticMember(){
        count ++;
    }
    public static int getCount() {
        return count;
    }
    public static void main(String[] args) {    
        StaticMember obj1 = new StaticMember();
        System.out.println(obj1.getCount());
        StaticMember obj2 = new StaticMember();
        System.out.println(obj2.getCount());
        StaticMember obj3 = new StaticMember();
        System.out.println(obj3.getCount());
        StaticMember obj4 = new StaticMember();
        System.out.println(obj4.getCount());
        StaticMember obj5 = new StaticMember();
        System.out.println(obj5.getCount());
        StaticMember obj6 = new StaticMember();
        System.out.println(obj6.getCount());
        StaticMember obj7 = new StaticMember();
        System.out.println(obj7.getCount());
        StaticMember obj8 = new StaticMember();
        System.out.println(obj8.getCount());
        StaticMember obj9 = new StaticMember();
        System.out.println(obj9.getCount());

    }
}
