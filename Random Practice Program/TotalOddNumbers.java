public class TotalOddNumbers {

    public int TotalOdd(int range){
        int oddCount = 0 ;
        for (int i = 0; i <=range; i++) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }
    public static void main(String[] args) {
        TotalOddNumbers obj = new TotalOddNumbers();
        System.out.println();
        System.out.println(obj.TotalOdd(100));
    }
    
}
