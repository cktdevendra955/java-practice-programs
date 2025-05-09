public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,10,33,78,950,33,0}; 
        System.out.println("------------------------------------");   
        System.out.print("Actual Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");         
        }    
        System.out.println();
        System.out.print("Rotate Array : ");
        for (int i = arr.length -1 ; i >= 0; i--) {
            System.out.print(arr[i]+", ");         
        }      
        
        System.out.println();
        System.out.println("------------------------------------");

    }
}
