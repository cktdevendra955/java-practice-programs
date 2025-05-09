public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr = {10,20,555,33,78,950,415};
        String n = "ram";
                
        int max = arr[0];
        int min = arr[0];
        System.out.println("------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];                
            }
        }

        
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Max Value : " + max);
        System.out.println("Min Value : " + min);

    }
}
