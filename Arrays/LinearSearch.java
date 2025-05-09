 
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {12,3644,85,41,26,79};
        int search_elm = 85;
        boolean status = false; 
        for (int i = 0; i < arr.length; i++) {
            if (search_elm == arr[i]) {
                System.out.println("Element Found : "+i );
                status = true;                
                break;
            }
        }
        if (!status) {
            System.out.println("Element Not Found");            
        }
    }
}