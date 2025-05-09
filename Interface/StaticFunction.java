 
interface StaticFunctionIterface {
    
    static String greet(){
        return "Welcome to Static Function Interface";
    }  
    static String goodbye(){
        return "Good Bye Static Function Interface";
    }    
}
public class StaticFunction implements StaticFunctionIterface{
    public static void main(String[] args) {
        System.out.println();        
        System.out.println(StaticFunctionIterface.greet()); 
        System.out.println(StaticFunctionIterface.goodbye()); 
        System.out.println();
    }

    
}