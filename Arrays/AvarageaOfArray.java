/**
 * Calculate the average value of array elements
 */
public class AvarageaOfArray {

    public static void main(String[] args) {
        int[] intArr = {10,20,30,40,50,60,70};
        int sum = 0;
        System.out.println("------------------------------------");
        for (int i = 1; i < intArr.length; i++) {
            
            System.out.print(intArr[i]+", ");
            sum = sum + intArr[i];
        }       
        System.out.println();
           
        int avarage = (sum / intArr.length);
        System.out.println("Avarage OF Array : "+ avarage);
        System.out.println("------------------------------------");
    }
    
}