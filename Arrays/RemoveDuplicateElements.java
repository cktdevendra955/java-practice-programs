import java.util.*;

public class  RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] myarr = {10,20,30,10,40,20,50,60,70};
        int[] uniqueelement = new int[myarr.length];
        int len = myarr.length;

        System.out.println(Arrays.toString(myarr));

        System.out.println();
       
        for (int i = 0; i < myarr.length; i++) {
            for (int j = i+ 1; j < myarr.length; j++) {                
                if (myarr[i] == myarr[j]) {
                     myarr[j] = myarr.length - 1;
                    len --;
                    j--;
                }
            }            
        }
        System.out.println(Arrays.toString(myarr));

        System.out.println();

    }
}
