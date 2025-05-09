public class HappyNewYear {

    public static boolean isHappyNewYear(String status){
         if (status == "sukoon" || status == "shanti" || status == "peace"|| status == "happyness" ) {
            return true;            
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        if (isHappyNewYear("shanti")) {
            System.out.println("\n*_* Happy New Year *_* \n");            
        }else{
            System.out.println("*.* Kahe Ka Happy New Year *.* \n");
        }

        
    }
}