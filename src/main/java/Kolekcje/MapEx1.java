package Kolekcje;



// 1.Utwórz Mapę implementującą HashMap.
//•Kluczem niech będzie Integer a wartością String
//•Dodaj trzy imiona do mapy np. (1 , „ Adam”)
//•Sprawdź rozmiar mapy
//•Dodaj kolejne imię pod klucz 1
//•Sprawdź rozmiar mapy i wyświetl w pętli wszystkie imiona z mapy.


import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static Map<Integer,String> firstMap() {
        Map<Integer, String> mapOfNames = new HashMap<>();
        mapOfNames.put(1,"Tomek");
        mapOfNames.put(2, "Kamila");
        mapOfNames.put(3, "Mike");
        System.out.println("Map size: " + mapOfNames.size());
        System.out.println("Map: " + mapOfNames.get(2));
        mapOfNames.put(2, "Monika");
        System.out.println("Map size: " + mapOfNames.size());
        System.out.println("Map: " + mapOfNames.get(2));


        return mapOfNames;

    }
}
