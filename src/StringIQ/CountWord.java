package StringIQ;

import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        String str = "I love to play to I love play you Ethiopia";
        System.out.println("countWord(str) = " + countWord(str));
    }

    private static Map<String, Integer> countWord(String str) {
        String [] arr = str.split(" ");
        List<String> list = new ArrayList<>();
       Collections.addAll(list, arr);
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
           String str2 = list.get(i);
           if(map.containsKey(str2)) {
               map.put(str2, map.get(str2) + 1);
           } else {
               map.put(str2, 1);
           }

        }
        return map;
    }
}
