class Demo{
    public static void intList(int... lst){
        for (int i : lst) {
            System.out.println(i);           
        }

    }
    public static void main(String[] l) {
        
        int[] l1 = {10,20,30,40,50,60};
        
        intList(l1);
    }
}