package shortVedios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingObjects {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Adam");
        list.add("Jhon");
        list.add("Mary");
        list.add("Diana");
        list.add("Biniyam");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<Person> plist = new ArrayList<>();
        plist.add(new Person("Jhon", 20));
        plist.add(new Person("Adam",32));
        plist.add(new Person("MAry",10));

        System.out.println(plist);

        Collections.sort(plist);

    }
}
