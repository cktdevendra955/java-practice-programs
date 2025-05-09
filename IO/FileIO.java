import java.io.*;

public class FileIO {

    public static void main(String[] args) throws Exception {
        

        FileOutputStream fos  = new FileOutputStream("dev.txt",true);
        String s1 = "Welcome";
        byte b[] = s1.getBytes();
        for (int i = 0; i < b.length; i++) {
            fos.write(b[i]);            
        }

        System.out.println("Saved");


    }
}