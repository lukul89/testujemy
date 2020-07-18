package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void firstList() {
        List<String> names = new ArrayList<String>();
        names.add("Iwona");
        names.add("Ilona");
        names.add("Irek");
        System.out.println("list size: " + names.size());
        names.add("Tomek");
        System.out.println("list size: " + names.size());

        for (String name : names) {
            System.out.println("Hello: " + name);
        }
    }
}
