/*
    Write a Java program to create an interface Playable 
    with a method play() that takes no arguments and returns void. 
    Create three classes Football, Volleyball, and Basketball 
    that implement the Playable interface and override the play() 
    method to play the respective sports.
*/
package Interface;
 
interface Playable {
    void play();    
}
class Football implements Playable{
    @Override
    public void play() {System.out.println("Football");}    
}
class Volleyball implements Playable{
    @Override
    public void play() {System.out.println("Volleyball");}    
}
class Basketball implements Playable{
    @Override
    public void play() {System.out.println("Basketball");}    
} 
public class RunPlayable {    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("*************************");
        Football football = new Football();
        football.play();
        Volleyball volleyball = new Volleyball();
        volleyball.play();
        Basketball basketball = new Basketball();
        basketball.play();
    }
}