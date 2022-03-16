package shortVedios;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();

        System.out.println(scoreMap.size());
        //V put (K key, V value)
        scoreMap.put("Adam", 90);
        scoreMap.put("John", 92);
        scoreMap.put("Mary",100);

        System.out.println(scoreMap);
        System.out.println(scoreMap.size());

        //V get (Object key)

        System.out.println(scoreMap.get("Mary"));
        System.out.println(scoreMap.get("Adam"));


        //boolean isEmpty();
        System.out.println(scoreMap.isEmpty());

        //boolean containsKey(Object key);

        System.out.println(scoreMap.containsKey("Mary"));

        //adding duplicate key
        scoreMap.put("Mary",100);
        scoreMap.put("Mary", 99);


        //boolean containsValue(Object value
        System.out.println("scoreMap.containsValue(100) = " + scoreMap.containsValue(100));

        // v remove (Object key)

        scoreMap.remove("Adam");

        //void putAll

        System.out.println(scoreMap.size());
        //V put (K key, V value)
        System.out.println(scoreMap);
        Map<String,Integer> scoreMap2 = new HashMap<>();
        scoreMap2.put("Adam1", 90);
        scoreMap2.put("John1", 92);
        scoreMap2.put("Mary1",100);

        scoreMap.putAll(scoreMap2);
        System.out.println("score Map" + scoreMap);

        //void clear


        scoreMap2.clear();
        System.out.println(scoreMap2);


        //----Java 8 addtion
        // v putIfAbsent (k Key, v value)
        scoreMap.putIfAbsent("Mary", 100);

        //V getOrDefault(Object key, V default vvvalue
        System.out.println(scoreMap.get("Alex"));
        System.out.println(scoreMap.get("Mary"));
        System.out.println(scoreMap.getOrDefault("Alex", 400));

        //boolean remove(Object key, object value

        System.out.println("Remove Brain's score " + scoreMap.remove("Brain"));
        System.out.println("Remove oth key and value match" + scoreMap.remove("Mary1",100));

        //boolean repleace(k key, V oldValue, V newValue)

        System.out.println("Replace Mary score from 92 to 100" + scoreMap.replace("Mary", 300));

        //boolean replace(k key, v oldvalue, V, new value)
        System.out.println("Replace Mary scorrre from 100 to 90" + scoreMap.replace("Mary", 300,45));


        //--------------------Map view---------------

        //set<k> keySet();

        Set<String> keyyys = scoreMap.keySet();
        System.out.println(keyyys);
        keyyys.remove("Adam");

        for(String eachkey: keyyys) {
            System.out.println("Key is " + eachkey + " Value is " + scoreMap.get(eachkey));
        }

        // Collection<V> values();

        Collection<Integer> allScores = scoreMap.values();
        System.out.println(allScores);

        // Set<Entry<K,V>> entrySet();
        //Entery : an interface embedded in Map interface
        //represent A map entry(key-value pair).

        //methods available :
        //getvalue(), setValue(), getKey()
        //System.out.println("-------")

        Set<Map.Entry<String,Integer>> allEntries= scoreMap.entrySet();

        for(Map.Entry<String,Integer> eachEntery : allEntries) {
            System.out.println(eachEntery);
            System.out.println(eachEntery.getKey());
            System.out.println(eachEntery.getValue());


            if(eachEntery.getValue() <=90) {
                eachEntery.setValue(95);

            }
            System.out.println(scoreMap);
        }




    }
}
