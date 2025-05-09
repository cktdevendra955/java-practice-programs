/*
    Write a Java program to create an interface Flyable 
    with a method called fly_obj(). 
    Create three classes Spacecraft, Airplane, and Helicopter 
    that implement the Flyable interface. Implement the fly_obj() 
    method for each of the three classes.
*/
package Interface;
 
interface flyable {
    void fly_obj();    
} 
class Spacecraft implements flyable{
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft FLying.....");        
    }    
} 
class Helicopter implements flyable{
    @Override
    public void fly_obj() {
        System.out.println("Helicopter FLying.....");        
    }    
}
public class RunFlyable {
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.fly_obj();
        Helicopter helicopter = new Helicopter();
        helicopter.fly_obj();        
    }
}