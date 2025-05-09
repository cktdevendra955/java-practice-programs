public class RevWord {

    public static void main(String[] args) {
        String str = "Hello world";
        String[] words = str.split(" ");
        String revStr = "";

        System.out.println();
        System.out.println("Given String is : "+ str);
        for (String w : words) {            
            for (int i = (w.length() -1); i >= 0 ; i--) {                
                revStr = revStr + w.charAt(i);
            }            
            revStr = revStr + " ";            
        }
        System.out.println("Result : " + revStr);
        System.out.println();
        
    }
    
}
