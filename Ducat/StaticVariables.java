/*
    Static Variables:
    Write a Java program to create a class called "Counter" 
    with a static variable count. 
    Implement a constructor that increments count every time an object is created. 
    Print the value of count after creating several objects.
*/

public class StaticVariables {

    static int count = 0;
    StaticVariables(){
        count++;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Before creating Istance Of Class Couter Value is : "+count);
        StaticVariables counter = new StaticVariables();
        StaticVariables counter2 = new StaticVariables();
        StaticVariables counter3 = new StaticVariables();
        StaticVariables counter4 = new StaticVariables();
        StaticVariables counter5 = new StaticVariables();
        System.out.println("After creating Istance Of Class Couter Value is : "+count);
    }
    
}