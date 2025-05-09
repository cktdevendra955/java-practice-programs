import java.util.Scanner;

public class QueueRunFile extends QueueImp {

    QueueRunFile(int size){
        super(size);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("###################################################");
        System.out.print("Enter the Size Of Queue : ");
        int size = sc.nextInt();        
        
        QueueImp queue = new QueueRunFile(size);
        
        
        System.out.println("queue is created with size of : " + size);        
        int choice;        
        System.out.println("###################################################");

        do{            
            System.out.println();
            System.out.println("---------------- WELCOE TO Queue MENU ----------");
            System.out.println();
            System.out.println("\t * Press 1 for Push (Insert Element)");
            System.out.println("\t * Press 2 for Pop (Delete Element)");
            System.out.println("\t * Press 3 for Display");
            System.out.println("\t * Press 4 for Peek (current Position)");
            System.out.println();

            System.out.println("---------------- END OF Queue MENU ----------");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queue.push();                 
                    break;
                case 2:
                    System.out.println("Poped Element is : "+queue.pop());
                    queue.pop();
                    break;
                
                case 3:
                    queue.display();
                    break;
                case 4:
                    
                    System.out.println("Rear Position : "+queue.peek());
                    break;
                default:
                    break;
            }
     

        }while(choice < 5 && choice > 0);

    }
}
