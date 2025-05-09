import java.io.FileOutputStream;
import java.io.IOException; 
class FileServicesImp implements FileServices{
    @Override
    public boolean createNewfile(String fileName){        
        try {
            new FileOutputStream(fileName);
            return true;
        } catch (Exception e) {
            return false;
        }
    } 


    @Override
    public void workingDir() {
        System.out.println("######################################################################");
        System.out.println("\t   ########## WELCOME TO DASHBOARD ##########");
        System.out.println("######################################################################");
    }
    
}
