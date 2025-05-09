/**
 * PalindromeString
 */
public class PalindromeString {

    public static void main(String[] args) {
        String str = "LOLO";        
        int strlen = str.length();        
        boolean status = true;

        for (int i = 0; i < strlen / 2; i++) {
            if (str.charAt(i) != str.charAt((strlen-i)-1)) {
                status = false;
                break;                
            }            
        }

        System.out.println(status);
    }
}