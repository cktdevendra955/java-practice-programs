public class SwaptwoNumber {
    public static void swap(int x, int y){
        System.out.printf("x = %d \t Y = %d",x,y);
        System.out.println();
        System.out.println("AFTER SWAPING");

        // x = 10 y =20
        x = x + y; //30
        y = x - y; // 10
        x = x - y; // 20

        System.out.printf("x = %d \t Y = %d",x,y);
        System.out.println();


    }
    public static void main(String[] args) {
        swap(10, 20);
    }
    
}
