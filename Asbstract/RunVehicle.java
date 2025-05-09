/*
    Write a Java program to create an abstract class Vehicle 
    with abstract methods startEngine() and stopEngine(). 
    Create subclasses Car and Motorcycle that extend the Vehicle class 
    and implement the respective methods to start and stop the engines 
    for each vehicle type.
*/
abstract class Vehicle {    
    abstract public void startEngine();
    abstract public void stopEngine();    
}
class Car extends Vehicle{
    @Override
    public void startEngine() {System.out.println("Car Engine ON "); }
    @Override
    public void stopEngine() {System.out.println("Car Engine STOP "); }    
}
class Motorcycle extends Vehicle{
    @Override
    public void startEngine() {System.out.println("Bike Engine ON ");}
    @Override
    public void stopEngine() {System.out.println("Bike Engine STOP ");}    
} 
public class RunVehicle {    
    public static void main(String[] args) {
        System.out.println();
        Car car = new Car();
        car.startEngine();
        car.stopEngine();       
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
        System.out.println();
    }    
}
