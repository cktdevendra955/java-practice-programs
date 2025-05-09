/*
    Inner Class:
    Write a Java program to create an outer class called Computer 
    with an inner class Processor. 
    The Processor class should have a method "displayDetails()" that 
    prints the details of the processor (e.g., brand and speed). 
    Create an instance of Processor from the Computer class and call the "displayDetails()" method.
*/ 
public class Computer {
    void displayDetails(){
        System.out.println("DELL COMPUTER");
    }

    public class Processor {    
        void displayDetails(){
            System.out.println("Processor with Itel");
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println();
        computer.displayDetails();
        Computer.Processor processor = computer.new Processor();
        processor.displayDetails();
    }
}