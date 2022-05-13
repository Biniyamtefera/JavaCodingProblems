package CollectionIQ;

import java.util.*;
import java.util.stream.Collectors;

public class removeDuplicate {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,6,1,200,156,32,3,666,0,999));
        System.out.println("removeDuplicate(list) = " + removeDuplicate(list));
        int[] arr = {1,2,3,6,1,200,156,32,3,666,0,999};
        System.out.println("removeDuplicate2(list) = " + removeDuplicate2(arr));
    }
     static Set<Integer> removeDuplicate(List<Integer> list) {
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
}
