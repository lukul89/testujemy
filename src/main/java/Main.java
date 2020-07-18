import Interface.Cat;
import Kolekcje.ListEx1;
import Kolekcje.MapEx1;
import Kolekcje.SetEx1;

import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ListEx1.firstList();
        Set<String> returnedExamples = SetEx1.firstSet(); // Set<String> returnedExamples = setOfNames z klasy SetEx1
        for (String name : returnedExamples){
            System.out.println("Hello: " + name);
            Map<Integer, String> getFirstMap = MapEx1.firstMap(); // Map<Integer, String> getFirstMap = mapOfNames z klasy MapEx1
            System.out.println("START");
            System.out.println(getFirstMap.get(1));
            System.out.println(getFirstMap.get(2));
            System.out.println(getFirstMap.get(3));


        }
    }
}
