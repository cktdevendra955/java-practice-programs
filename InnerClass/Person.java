/*
    Inner Class with Constructor:
    Write a Java program to create an outer class called Person 
    with an inner class Address. 
    The Address class should have a constructor that takes 
    parameters city and state. 
    Create an instance of Address from the Person class 
    and print the address details.
*/
public class Person {
    String name;   
    Person(String name){
        this.name = name;
    }      
    public class Address {    
        String city;
        String state;
        Address(String city,String state){
            this.city = city;
            this.state = state;
        }        
    }
    public static void main(String[] args) {
        Person person = new Person("DEVENDRA");
        System.out.println();
        Person.Address address = person.new Address("CKTD", "UP");
        System.out.println("NAME : "+ person.name);
        System.out.println("CITY : " + address.city);
        System.out.println("STATE : " + address.state);

    }
}