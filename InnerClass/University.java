/*
    Static Nested Class:
    Write a Java program to create an outer class called University 
    with a static nested class Department. 
    The Department class should have a method "displayInfo()" 
    that prints the department name and the number of faculty members. 
    Instantiate the Department class from the main method and call 
    the "displayInfo()" method.
*/
public class University {
    void displayInfo(){
        System.out.println("THIS IS UNIVERSITY ");
    }   

    static class Department {
        void displayInfo(){
            System.out.println("THIS IS DEPARTMENT ");
        }   
        
    }
    public static void main(String[] args) {
        University university = new University();
        University.Department department = new Department();
        System.out.println();
        university.displayInfo();
        department.displayInfo();
    }
    
}