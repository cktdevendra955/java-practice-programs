import java.io.FileInputStream;

public class ReadFile {
 
    public static void main(String[] args) throws Exception{
        FileInputStream fio = new FileInputStream("demo.txt");
        int i = 0;
        while ((i = fio.read()) != -1) {
            System.out.print((char) i);            
        }
        
    }
}
