package Kolekcje;

import java.util.*;

// 2. Utwórz zbiór Set implementujący HashSet.
//•Dodaj trzy imiona do zbioru
//•Dodaj jedno z tych imion ponownie
//•Sprawdź rozmiar zbioru


public class SetEx1 {
    public  static Set<String> firstSet() {
        Set<String> setOfNames = new HashSet<String>();
        setOfNames.add("Iwona");
        setOfNames.add("Paweł");
        setOfNames.add("Monika");
        System.out.println("Set size: " + setOfNames.size());
        setOfNames.add("Monika");
        System.out.println("Set size: " + setOfNames.size());
        return setOfNames;
    }
}
