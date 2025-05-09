
class Base {
    void display(){
        System.out.println("SHow From Base");
    }
    
    void foo(){
        System.out.println("BASE -> FOO"); 
    }
}
public class UpcastAdDowncast extends Base{

    void display(){
        System.out.println("SHow From Chaild");
    }

    void getName(){
        System.out.println("This is getName()");
    }

    public static void main(String[] args) {
        
        Base upcastig = new UpcastAdDowncast();

        upcastig.display(); 
        
        UpcastAdDowncast dowcastinng = (UpcastAdDowncast) upcastig;
        dowcastinng.getName();
    }
}
