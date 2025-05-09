import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        HashSet<Integer> myset = new HashSet<>(Arrays.asList(55,33,55,78));
        myset.add(55);
        System.out.println(myset);
    }
}
