public class FatorialN {

    static int fa(int n) {
        if (n == 1) {
            return 1;            
        }
        return n * fa(n - 1);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("USING FUN : "+fa(5));

        int f = 0;
        for (int i = 0; i <= 5; i++) {
            f = f + i; 
        }
        System.out.println("USING LOOP : " + f);
    }

}
