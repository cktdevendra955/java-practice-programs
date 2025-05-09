/*
    Write a Java program to create an interface Searchable 
    with a method search(String keyword) that searches 
    for a given keyword in a text document. 
    Create two classes Document and WebPage that 
    implement the Searchable interface and provide their own 
    implementations of the search() method.
*/
package Interface;
interface Searchable {
    void search(int keyword);   
}
class Document implements Searchable{
    int[] arr = {1,2,37,8,9,45,6};
    @Override
    public void search(int keyword) {                
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == keyword) {
                System.out.println("Search Index : + "+i);               
            }
        }
    }
}
 
class WebPage implements Searchable{    
    int[] arr = {10,20,37,8,9,45,60};
    @Override
    public void search(int keyword) {
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == keyword) {
                System.out.println("Search Index : + "+i);               
            }else{
                System.out.println("NOT FOUD");
            }
        }
    }
}
public class RunSearchable {
    public static void main(String[] args) {      
        Document document = new Document();
        document.search(10);
        WebPage webPage = new WebPage();
        webPage.search(6);
    }   
}