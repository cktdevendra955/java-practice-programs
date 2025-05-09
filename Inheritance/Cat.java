/*
    Write a Java program to create a class called Animal 
    with a method called makeSound(). 
    Create a subclass called Cat that overrides the makeSound() method to bark.
*/ 
class Animal {
    public void makeSound(){
        System.out.println("Make sound");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {        
        System.out.println("Meoooo Meoooo !!!!!!!!!!");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();        
        Animal upCastigAnimal = new Cat();
        upCastigAnimal.makeSound();       
    }    
}