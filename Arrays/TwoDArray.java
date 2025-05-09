public class TwoDArray {
    public static void main(String[] args) {
        int[][] data = new int[10][5];

        System.out.println("------------------------------------");        
        for (int i = 0; i < 10; i++) {     
            System.out.print("ROW " + i+" => ");       
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = j+1;    
                System.out.print(data[i][j]+" ");            
            }
            System.out.println();
           
        }
        System.out.println("------------------------------------");        

    }
}
