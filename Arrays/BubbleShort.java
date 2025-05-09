import java.util.Arrays;
public class BubbleShort {
    public static void main(String[] args) {
        int[] arr = {12,3644,85,41,26,79};


        System.out.println("Array : "+ Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    
                    int temmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temmp;
                }
            }            
        }

        System.out.println("Sorted Array : "+ Arrays.toString(arr));
    }
}
