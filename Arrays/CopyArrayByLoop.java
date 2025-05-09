/*
COPY ARRAY BY LOOP
*/

/**
 * CopyArrayByLoop
 */
public class CopyArrayByLoop {

    public static void main(String[] args) {
        String[] color = {"RED","GREEN","BLUE","YELLOW","DARK","WHITE"};
        String[] colorCopy;
        colorCopy = new String[color.length];
        
        System.out.println("------------------------------------");

        for (int i = 0; i < color.length; i++) {
            System.out.print("Color : "+color[i]);
            colorCopy[i] = color[i];
            System.out.print("\t Color Copy : "+colorCopy[i]);
            System.out.println();
        }
        System.out.println("------------------------------------");


    }
}