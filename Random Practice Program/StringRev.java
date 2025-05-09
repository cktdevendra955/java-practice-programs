import java.util.Scanner;

public class StringRev {
    
   public static void main(String[] args) {
        String str = "WELCOME";
        String revStr = "";
        System.out.println();
        for (int i = (str.length()-1); i>=0; i--) {
            revStr = revStr+str.charAt(i);
        }
        System.out.println();
        System.out.println(revStr);
   } 
}
