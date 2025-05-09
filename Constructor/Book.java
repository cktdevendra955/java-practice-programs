/* Constructor Overloading
    Write a Java program to create a class called "Book" 
    with instance variables title, author, and price. 
    Implement a default constructor and two parameterized constructors:
        * One constructor takes title and author as parameters.
        * The other constructor takes title, author, and price as parameters.
        * Print the values of the variables for each constructor.
*/
public class Book {
    String title, author;
    double price;
    Book(){}
    Book(String title, String author){
        this.title = title;
        this.author = author;
        System.out.printf("Title: %s \t Author: %s",title,author);
        System.out.println();
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.printf("Title: %s \t Author: %s \t Price: %f",title,author,price);
        System.out.println();        
    }
    public static void main(String[] args) {
        Book obj = new Book("Java", "James Goslin");
        Book Obj2 = new Book("Reat", "Faebook", 100.0);
     }
    
}
