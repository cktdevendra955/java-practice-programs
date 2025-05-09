import java.io.Console;

public class Consoleiput {

    public static void main(String[] args) {
        

        Console cw =  System.console();
        if (cw != null) {
            System.out.println("Console is alive......");
            System.out.print("Enter The Line : ");
            String line = cw.readLine();
            System.out.print("Enter The password : ");
            char[] pass = cw.readPassword();

            System.out.println(line);
            System.out.println(new String(pass));
        }
    }
    
}
