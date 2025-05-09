import java.io.Console;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        LoginServicesImp auth = new LoginServicesImp();
        FileServicesImp fileOprations = new FileServicesImp();

        Scanner sc = new Scanner(System.in);
        Console cs = System.console();
        String userid;
        char[] password;   
        
        System.out.print("User id : ");
        userid = sc.nextLine();
        
        if (cs != null) {
            System.out.print("Password : ");
            password = cs.readPassword();          
            System.out.println();            
            auth.login(userid, new String(password));
            if (auth.login(userid, new String(password))) {  
                    
                    System.out.print("\n \t PRESS 1 FOR  CREATE NEW FILE =>  ");
                    System.out.print("\n \t PRESS 2 FOR YOUR WORKING DIR =>  ");
                    System.out.print("\n \t FOR EXIT PRESS OTHER => ");
                    int mych = sc.nextInt();
                    switch (mych) {
                        case 1:
                            System.out.print("\n \t File Name : ");
                            String fileName = cs.readLine();
                            String fileFormates[] = {".txt",".doc",".csv"};
                            for (int i = 0; i < fileFormates.length; i++) {
                                System.out.println("\n \t PRESS " +(i)+" FOR "+fileName+fileFormates[i]+" FILE");
                            }
                            System.out.print("\n \n \t Press Here............");
                            int fileFormateInput =  sc.nextInt();
                            
                            if (fileFormateInput > fileFormates.length - 1) {
                                System.out.println("wrong input Plz try again");                                
                            }else{
                                fileName = fileName+fileFormates[fileFormateInput];
                            }
                            
                            fileOprations.createNewfile(fileName);                            
                            System.out.println(" \n \t ** * * ** * *File Created......... ** * * ** * *");                            
                            break;
                        case 2:
                            fileOprations.workingDir();                            
                            break;
                    
                        default:
                            break;
                    }
                

                // int mych;
                // do {                    
                //     System.out.print("\n \t Press 1 for Create file : ");
                //     System.out.print("\n \t Press 2 for Read file : ");
                //     System.out.print("\n \t For Exit Press Othes : ");
                //     mych = sc.nextInt();                    
                //     switch (mych) {
                //         case 1:
                //             String fileName;
                //             System.out.print("Enter File name : ");
                //             fileName = sc.nextLine();
                //             // fileName = fileName+".txt";
                //             // System.out.println(fileName);
                //             // FileOutputStream fio = new FileOutputStream(fileName);                            
                //             System.out.println("creating File.........");

                //             break;

                //         case 2:                            
                //             System.out.println("Opning File.........");
                //             break;
                    
                //         default:
                //             break;
                //     }
                    
                // } while (mych < 3);
                
            }
        }else{
            System.out.println("Console Ot found!!!!!!!!!!!!");            
        }
    }
}