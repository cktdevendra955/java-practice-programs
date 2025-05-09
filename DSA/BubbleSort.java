public class BubbleSort{

    public static void main(String[] args) {
        int arr[] = {1,10,5,9,3,7,4,6,8};
        for(int i = 0; i< arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++) {                
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (Integer elem : arr) {
            System.out.println(elem);            
        }
    }
}