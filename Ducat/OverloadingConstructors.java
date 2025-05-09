/*
 * Overloading Constructors with Different Data Types
    Write a Java program to create a class called Point with instance variables x and y. 
    Implement overloaded constructors:
        
        One constructor takes int parameters.
        Another constructor takes double parameters.
        Print the values of the variables for each constructor.
 */ 
 public class OverloadingConstructors {
 
    int x,y;
    OverloadingConstructors(int x, int y){
        this.x =x;
        this.y = y;
        System.out.println("Integer  X :"+x);
        System.out.println("Integer  X :"+y);
    }

    OverloadingConstructors(double x, double y){
        this.x = (int)x;
        this.y = (int)y;
        System.out.println("Double  X : "+x);
        System.out.println("Double  X : "+y);
    }
    public static void main(String[] args) {
        OverloadingConstructors obj = new OverloadingConstructors(10, 20);
        OverloadingConstructors obj2 = new OverloadingConstructors(10.55, 20.55);
    }
 }