public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {10,20,10,33,78,950,33}; 

        System.out.println("------------------------------------");        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 ) {
                System.out.println("Even Element : "+arr[i]);                
            }else{
                System.out.println("Odd Element : "+arr[i]);                                
            }
        }
        System.out.println();
        System.out.println("------------------------------------");

    }
}
