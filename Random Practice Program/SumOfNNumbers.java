// Find sum of first n numbers
public class SumOfNNumbers {    
    public int sumOfumbers(int range){

        int sum = 0;
        for (int i = 0; i <= range; i++) {
          sum = sum +i;  
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfNNumbers obj = new SumOfNNumbers();
        System.out.println();
        System.out.println(obj.sumOfumbers(100));
    }
}
