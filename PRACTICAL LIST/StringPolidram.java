public class StringPolidram {
    public static void main(String[] args) {
        String str = "abcd";
        int len = str.length();
        System.out.println(str.charAt(len-1));

        
        for (int i = len -1 ; i > len / 2; i--) {
            System.out.print(str.charAt(len-i));
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print(str.charAt(i));
            

                                  
        }
         System.out.println();
    }
}
