import java.util.Scanner;

public class StackRunFile extends StackImp{
    StackRunFile(int size){
        super(size);
    }


    void mymethod(){
        System.out.println("Display");
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("###################################################");
        System.out.print("Enter the Size Of stack : ");
        int size = sc.nextInt();        
        
        StackImp stack = new StackRunFile(size);      
        
        
        System.out.println("Stack is created with size of : "+size);        
        int choice;        
        System.out.println("###################################################");
        
        do{            
            System.out.println();
            System.out.println("---------------- WELCOE TO StACK MENU ----------");
            System.out.println();
            System.out.println("\t * Press 1 for Push (Insert Element)");
            System.out.println("\t * Press 2 for Pop (Delete Element)");
            System.out.println("\t * Press 3 for Display");
            System.out.println("\t * Press 4 for Peek (current Position)");
            System.out.println();

            System.out.println("---------------- END OF STACK MENU ----------");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stack.push();                 
                    break;
                case 2:
                    stack.pop();
                    break;
                
                case 3:
                    stack.display();
                    break;
                case 4:
                    stack.peek();
                    break;
                default:
                    break;
            }
     

        }while(choice < 5 && choice > 0);


      
    }
}
