public class CheckWithoutZeroAndOne {
    public static void main(String[] args) {
        int[] arr = {10,20,10,33,78,950,33,0}; 

        System.out.println("------------------------------------");   
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");         
        }     
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0 ) {
                System.out.println("Array with 0 or -1 Value ");                
            }
        }
        System.out.println();
        System.out.println("------------------------------------");

    }
}
