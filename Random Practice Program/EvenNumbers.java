public class EvenNumbers {
    public void evenNumbers(int range){
        for (int i = 1; i <=range; i++) {
            if (i%2 ==0) {
                System.out.println("Even  Number : " + i);                
            }            
        }
    }

    public static void main(String[] args) {
        EvenNumbers obj = new EvenNumbers();
        obj.evenNumbers(50);
    }
}
