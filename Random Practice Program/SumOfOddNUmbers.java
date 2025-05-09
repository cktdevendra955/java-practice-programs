// Sum of odd numbers between

public class SumOfOddNUmbers {

    int sum = 0;
    public int sumOfOdd(int range){
        for (int i = 0; i <=range; i++) {
            if (i % 2 !=0) {
                sum = sum + i;
            }
        }
        return sum;        
    }

    public static void main(String[] args) {
        SumOfOddNUmbers obj = new SumOfOddNUmbers();

        System.out.println();
        System.out.println(obj.sumOfOdd(10));
        
    }
    
}
