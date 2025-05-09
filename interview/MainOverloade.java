public class MainOverloade {
    public static void main(String[] args) {
        String str = "LUL";
        boolean status = false;
        int len = str.length() -1;

        System.out.println();
        for (int i = 0; i < str.length()-1 /2 ; i++) { 
            System.out.print(str.charAt(i)+"\t"+str.charAt(len-i) +"\t");
            System.out.println();
            if (str.charAt(i) == (str.charAt(len-i))) {
                status = true;
            }else{
                status = false;
            }
            
        }
        System.out.println();
        if (status) {
            System.out.println("polidram");            
        }else{
            System.out.println("Not valid");
        }
    }
    
}
