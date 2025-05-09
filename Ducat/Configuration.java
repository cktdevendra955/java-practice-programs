/*
    ****Static Block for Initialization*****
    
    Write a Java program to create a class called Configuration 
    with a static block that initializes a 
    static variable 'configValue' 
    from a configuration 
    file (simulated with a default value). 
    Print the value of 'configValue' in the main method.
*/
/**
 * Configuration
 */
public class Configuration {

    static String  configValue;
    static{
        configValue = "private-key";        
    }

    public static void main(String[] args) {
        System.out.println(configValue);
    }
}