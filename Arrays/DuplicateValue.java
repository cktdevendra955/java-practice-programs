public class DuplicateValue {
    public static void main(String[] args) {
        int[] arr = {10,20,10,33,78,950,33};        
        
        System.out.println("------------------------------------");        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate value : "+ arr[i]);                    
                }
            }
        }        
        System.out.println();
        System.out.println("------------------------------------");
        


    }
}
