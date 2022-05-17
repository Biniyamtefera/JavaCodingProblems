package CollectionIQ;

import java.util.ArrayList;
import java.util.List;

public class RevisionCollection {
    public static void main(String[] args) {
        /**
         * ArrayList and LinkedList are defined under the list interface
         * Insertion order, you can have duplicates
         * What is the diffrent between Arrays List and Arrays
         *
         * Arrays >> must have size, it keeps permitive type and object, to print use loop or conver to String
         * ArraysList>> you don't have to give size, only object type,We can print Arraylist without using string or us
         * using loop, lidt.get(i)
         *
         * list.get(), list.contains().list.remove(). list.size().list.size(), Collections.sort(list)
         */

        List<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("Denver");
        list.add("Houston");
        list.add(0,"Saber");
    }
}
