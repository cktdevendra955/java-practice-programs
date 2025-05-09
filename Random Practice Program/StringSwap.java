public class StringSwap {
    public static void main(String[] args) {
        String a = "Hello";    //length = 5;
        String b = "World";   //length = 5;
        System.out.println("\n Strings before swap: a = " + a + " and b = "+b);
        a = a + b; // legth = 10

        
        b = a.substring(0, a.length()-b.length()); //10-5 = 5;        
        a = a.substring(b.length());        
        System.out.println("Strings after swap: a = " + a + " and b = " + b);

        
    }
}
