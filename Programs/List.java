import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(110);
        System.out.println(list.get(2));
        System.out.println(list);

        HashSet<Integer> hash = new HashSet<>();
        hash.add(110);
        hash.add(220);
        hash.add(10);
        hash.add(20);
        hash.add(20);
        System.out.println(hash);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "praveen");
        map.put(1, "raveen");
        map.put(2, "raven");
        System.out.println(map);
    }
}
