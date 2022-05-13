package CollectionIQ;

import java.util.*;
import java.util.stream.Collectors;

public class removeDuplicate {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,6,1,200,156,32,3,666,0,999));
        System.out.println("removeDuplicate03(list) = " + removeDuplicate03(list));
        int[] arr = {1,2,3,6,1,200,156,32,3,666,0,999};
        System.out.println("removeDuplicate2(list) = " + removeDuplicate2(arr));
         removeDuplicate01(list);
         uniqueList(list);
    }
     static Set<Integer> removeDuplicate03(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        return set;
    }
    static List<Integer> removeDuplicate2(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i < arr.length;i++) {
            list.add(arr[i]);
        }
        return list.stream().distinct().collect(Collectors.toList());
    }
    static void removeDuplicate01(ArrayList<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for(int i =0; i < list.size(); i++) {
            if(!result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }
        System.out.println(result);
    }

    static void uniqueList(ArrayList<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for(int i =0; i < list.size(); i++) {
            if(!result.contains(list.get(i))) {
                result.add(list.get(i));
            } else {
                result.remove(list.get(i));
            }
        }
        System.out.println(result);
    }
}
