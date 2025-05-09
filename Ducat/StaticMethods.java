/*
    Static Methods:
    Write a Java program to create a class called "MathUtility" 
    with a static method add that takes two integers and returns their sum. 
    Demonstrate the usage of this static method in the main method 
    without creating an instance of "MathUtility".
*/

/**
 * StaticMethods
 */
public class StaticMethods {
    static int sum(int x, int y){
        return (x+y);
    }

    public static void main(String[] args) {
        System.out.println("Sum Of Two : "+ sum(10, 20));
    }
}