import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.println();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.print("Common Elements : ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.print(array1[i] + ", ");                    
                }               
            }           
        }
        System.out.println();
        System.out.println();

    }
}
