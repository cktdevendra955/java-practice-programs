// Program to find largest number in an array
public class LargestNumberInAnArray {

    public int Largestumber(int numbers[]){
        int max = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }            
        }
        return max;
    }
    public static void main(String[] args) {
        int[]  numbers = new int[] {1,234,56,78,9};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println( "ELENENT : " + numbers[i]);
        }
        LargestNumberInAnArray obj = new LargestNumberInAnArray();
        System.out.println("LARGEST ELEMETS : " + obj.Largestumber(numbers));
    }
    
}
