/*
    Write a Java program to create a class called Person 
    with private instance variables name, age. and country. 
    Provide public getter and setter methods to access and modify 
    these variables.
*/
public class Person {
    private String name, country;
    private int pincode;
    public String getName() {return name;}
    
    public String getCountry() { return country;}    
    public int getPincode() { return pincode; }    
    public void setName(String name) { this.name = name;}    
    public void setCountry(String country) {this.country = country;}    
    public void setPincode(int pincode) {this.pincode = pincode;}  
    
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println();
        person.setName("Dev");
        System.out.println(person.getName());
        person.setCountry("IND");
        System.out.println(person.getCountry());
        person.setPincode(223);
        System.out.println(person.getPincode());
    }
}

