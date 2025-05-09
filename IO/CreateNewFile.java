import java.io.FileOutputStream;

public class CreateNewFile {
    public static void main(String[] args) throws Exception{

        FileOutputStream fos = new FileOutputStream("demo.csv",true);
        
        String greet = "Good Morning at 4am \n";
        byte b[] = greet.getBytes();
        
        for (int i = 0; i < b.length; i++) {
            fos.write(b[i]);            
        }

        fos.close();        
    }
}
