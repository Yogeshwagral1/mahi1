package collectionFramework.mapImplementations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        //if the key is already there then value be updated
        // when new entry is added with the same key
        //insertion order in LHM
        Map map = new TreeMap();
        map.put(1, "abc");
       // map.put(null, null);//NPE
       // map.put(null, null);
        map.put(2, null);
        map.put(1, "xyz");
        map.put(1, "pqr");
        map.put(1, "value will be updated");
        System.out.println(map);

    }
}
