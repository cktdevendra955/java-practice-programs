/**
 * InnerDefaultfunction
 */
interface DefaultfunctionInterface {    
    default String greet(){
        return "Welcome to Static Function Interface";
    }  
    default String goodbye(){
        return "Good Bye Static Function Interface";
    }      
}
public class Defaultfunction implements DefaultfunctionInterface{
 
    public String goodbye(){
        return "Good Bye Static Function Interface from class";
    }
    public static void main(String[] args) {
        DefaultfunctionInterface df = new Defaultfunction();
        System.out.println();
        System.out.println(df.greet());
        System.out.println(df.goodbye());
        
    }
}
