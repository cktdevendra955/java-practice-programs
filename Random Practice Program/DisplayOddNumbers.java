
// Display odd numbers between 1 -100
public class DisplayOddNumbers {

    public void odd(int range){
        for (int i = 1; i <=range; i++) {
            if (i%2 !=0) {
                System.out.println("Odd Number : " + i);                
            }            
        }
    }

    public static void main(String[] args) {
        DisplayOddNumbers obj = new DisplayOddNumbers();
        obj.odd(10);
    }
    
}
