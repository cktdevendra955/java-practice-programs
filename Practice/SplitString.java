public class SplitString {
    public static void main(String[] args) {
        String s1 = "this is string";
        String[] sSplit = s1.split("\\s");
        System.out.println();
       
        for (String s : sSplit) {
            System.out.println(s);
        }     
    }
}
