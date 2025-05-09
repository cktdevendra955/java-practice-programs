public class Fibonaccisequence {
    static void FibonacciNumber(int num){
        int a = 0;
        int b=1,c=1 ;

        for (int i = 1; i <= num; i++) {
            System.out.print(a + ",");
            a = b;
            b = c;
            c = a + b;            
        }        
        System.out.println();
    }

    public static void main(String[] args) {
        FibonacciNumber(5);
    }
}
