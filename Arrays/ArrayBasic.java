
public class ArrayBasic {

    public static void main(String[] args) {
        int[] intArr = new int[10];
        double []doubleArr = new double[10];        
 
        String []strArr = {"noida","delhi","gurugram","pujab"};
        char [] charArr = {'a','e','i','o','u'};

        for (int i = 0; i < 10; i++) {
            intArr[i] = i;
            doubleArr[i] = (double)i*5;
            
        }
        System.out.println("*********** Int Array ***********");
        for (int i = 0; i < intArr.length; i++) {
            System.out.printf("intArr[%d] = %d \n",i,intArr[i]);            
        }
        System.out.println();

        System.out.println("*********** Double Array ***********");
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.printf("doubleArr[%d] = %f \n",i,doubleArr[i]);            
        }
        System.out.println();

        System.out.println("*********** String Array ***********");
        for (int i = 0; i < strArr.length; i++) {
            System.out.printf("strArr[%d] = %s \n",i,strArr[i]);            
        }
        System.out.println();

        System.out.println("*********** Char Array ***********");
        for (int i = 0; i < charArr.length; i++) {
            System.out.printf("charArr[%d] = %c \n",i,charArr[i]);            
        }
        
    

    }
    
}