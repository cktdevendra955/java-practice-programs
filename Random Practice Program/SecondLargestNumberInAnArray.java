public class SecondLargestNumberInAnArray {

    public int SeoudLagestEement (int list[]){            
        return 1;
    }

    public static void main(String[] args) {

        int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
        int largest =  arr[0];
        int secoud_largest =  arr[0];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Eelement : " + arr[i]);            
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secoud_largest = largest;
                largest = arr[i];                
            }else if (arr[i] > secoud_largest) {
                secoud_largest = arr[i];                
            }
        }

        System.out.println("Largest Elemet = "+ largest);
        System.out.println("Secound Largest Elemet = "+secoud_largest);

        
    }
}
