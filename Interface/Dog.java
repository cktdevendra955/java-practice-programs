package Interface;
/*
    Write a Java program to create a Animal interface 
    with a method called bark() that takes no arguments and returns void. 
    Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
*/

/**
 * Dog
 */
interface Animal {
    void bark();       
}
public class Dog implements Animal{
    @Override
    public void bark() {
        System.out.println("DOG");
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println();
        dog.bark();
    }
}