/*
    PROGRAM TO SUM VALUE OF ARRAY
*/
public class SumValueOfArray {

    public static void main(String[] args) {
        int[] intArr = new int[11];
        int sum = 0;        
        System.out.println("------------------------------------");
        for (int i = 1; i < 11; i++) {
            intArr[i] = i;
            System.out.print(intArr[i]+", ");
        }       
        System.out.println();
        for (int i = 1; i < 11; i++) {
            sum = sum + intArr[i];
        }       
        
        System.out.println("Sum OF Array : "+ sum);
        System.out.println("------------------------------------");
    }
    
}