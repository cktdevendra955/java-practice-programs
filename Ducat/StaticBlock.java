
/*
    Static Block
    Write a Java program to create a class called "Initializer" 
    with a static block that initializes a static variable 'initialValue' 
    to 1000. 
    Print the value of 'initialValue' before and after creating 
    an instance of "Initializer".

*/


/**
 * StaticBlock
 */
public class StaticBlock {

    static int var;
    static{
        var = 1000;
    }

    public static void main(String[] args) {
        System.out.println("Before : "+var);
        var = 2000;
        System.out.println("After : "+var);
        
    }
}