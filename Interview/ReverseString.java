/**
 *  How do you reverse a string in Java?

    There is no reverse() utility method in the String class. 
    However, you can create a character array from the string and then 
    iterate it from the end to the start. You can append the characters to a 
    string builder and finally return the reversed string.

    
 */
public class ReverseString {

    public String RevString(String str){
        if ((str.length() > 1)) {
            String rev = "";
            
            for (int i = (str.length() -1); i >= 0; i--) {
                rev = rev + str.charAt(i);
            }

            return rev;
        }
        
        
        return "Single strig : " + str;
    }
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        System.out.println(obj.RevString("A"));

    }
    
}