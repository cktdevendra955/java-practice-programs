
class Base {
    void display(){
        System.out.println("SHow From Base");
    }
    
    void foo(){
        System.out.println("BASE -> FOO"); 
    }
}
public class MathodHiding extends Base{

    void display(){
        System.out.println("SHow From Chaild");
    }

    public static void main(String[] args) {
        
        UpcastAdDowncast obj = new UpcastAdDowncast();
        obj.display(); // METHOD HDING
        obj.foo();
    }
}
