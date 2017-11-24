package kata6.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram <String> {
    private final Map<String,Integer> map = new HashMap<>();
    
    public int get(String key) {
        return map.get(key);
    }
    
    public Set<String> keySet() {
        return map.keySet();
    }
    
    public void increment(String key, int value) {
        map.put(key, map.containsKey(key) ? map.get(key)+1:1);
    }
    
    
}