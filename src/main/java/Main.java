import Kolekcje.ListEx1;
import Kolekcje.SetEx1;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ListEx1.firstList();
        Set<String> returnedExamples = SetEx1.firstSet(); // Set<String> returnedExamples = setOfNames z klasy SetEx1
        for (String name : returnedExamples){
            System.out.println("Hello: " + name);
        }
    }
}
