import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapProgram {
    public static void main(String[] args) {
     
        System.out.println();
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "dev");
        map.put(2, "devi");
        map.put(33, "devo");
        map.put(4, "devel");
        map.put(11, null);
        map.put(55, null);
        map.put(21, "ram");
        map.put(22, "ram");
        map.put(23, "ram");

        System.out.println(map.hashCode());

        System.out.println(map);
        map.remove(4);
        System.out.println(map);
        System.out.println(map.containsKey(33));
        System.out.println(map.containsValue("devsad"));

        Map<Integer,String> map2 = new TreeMap<>();
        map2.put(11, "dev");
        map2.put(2, "devi");
        map2.put(33, "devo");
        map2.put(4, "devel");

        System.out.println(map2);
        map2.remove(4);
        System.out.println(map2);
        System.out.println(map2.containsKey(33));
        System.out.println(map2.containsValue("devsad"));


        System.out.println();


    }
}
