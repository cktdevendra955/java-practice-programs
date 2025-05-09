public class StringCharoccarance {
    public static void main(String[] args) {
        String str = "DEVENDRA";
        int strLen = str.length();
        int RemoveE = str.replace("E", "").length();
        System.out.println("E Occ Times : "+(strLen - RemoveE));

    }
}
