package Obiektowość;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person young = new Person();                            // uzycie wszystkich konstruktorów za pomoca ctrl i najazd na Person przy new mysza pokazuje z jakiego konstruktora korzystamy
        Person johny = new Person("Johny","Bravo");
        Person ana = new Person("Ana","Nowak",25);
        Person old = new Person("Old","Japan",135);


        List<Person> listOfPersons = new ArrayList<>();    // tworzymy liste z imionami i wiekiem dlatego przy list ustawiamy Person bo nie ma tam tylko imion sa tez liczby
        listOfPersons.add(young);
        listOfPersons.add(johny);
        listOfPersons.add(ana);
        listOfPersons.add(old);

        System.out.println(listOfPersons.size());

        if (!listOfPersons.isEmpty()){                            // !-zaprzeczenie, jesli nie jest pusta, jesli nie jest pusta cos drukujemy
            Person person = listOfPersons.get(0);
            System.out.println("index 0 " + person.toString());
            System.out.println("index last " + listOfPersons.get(listOfPersons.size() - 1));
        }
        for (Person person : listOfPersons) {
            //System.out.println("person " + person.getAge());
            System.out.println(person.toString());
        }
        System.out.println("Przefiltrowana lista");


        List<Person> ageFiltered = Validator.filterPersons(listOfPersons);

        for (Person person : ageFiltered){
            System.out.println(person.toString());
        }
    }
}
