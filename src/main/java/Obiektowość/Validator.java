package Obiektowość;

import java.util.LinkedList;
import java.util.List;

public class Validator {
    public static List<Person> filterPersons(List<Person> listOfPersons){
        List<Person> filtered = new LinkedList<>();   // utworzylismy pusta liste dla filtrowanych osob

        for(Person person : listOfPersons){                 // przechodzimy po liscie ktora dostalismy i sprawdzamy czy wiek jest mniejszy od 130 i jesli tak to dodajemy do naszej pustej listy utworzonej wyzej
            if (person.getAge() <= Person.MAX_AGE){
                filtered.add(person);
            }
        }

        return filtered;
    }
}
