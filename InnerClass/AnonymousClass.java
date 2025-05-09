/*
    Write a Java program to create an interface 
    called Greeting with a method sayHello(). 
    In the main method, create an anonymous 
    class that implements the Greeting interface 
    and override the sayHello() method to print "Hello, World!". 
    Call the sayHello() method.
*/

interface Greeting {
    void sayHello();    
}
public class AnonymousClass implements Greeting{    
    public static void main(String[] args) {
        
        Greeting greeting = new AnonymousClass({
            @Override
            public void sayHello() {
                System.out.println("WELCOME");        
            }
        });
    }
    
}