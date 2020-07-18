package Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Cat garfield = new Cat();
//        Cat filemon = new Cat("Mrau");
       // System.out.println(Cat.testMakeSound());

        //String garfieldSound = garfield.makeSound();
        //System.out.println(garfieldSound);
        //System.out.println(filemon.makeSound());

//        Cow mucka = new Cow("Moo");
//        System.out.println(mucka.makeSound());
//
//        Dog reksio = new Dog("HauHau");
//        System.out.println(reksio.makeSound());
//
//        filemon.setAge(5);
//        System.out.println(filemon.getAge());

        Cat garfield = new Cat();
        Cat filemon = new Cat();
        Cat teodor = new Cat();
        Dog reksio = new Dog("Woof");
        Dog reks = new Dog("Hau");
        Cow mucka = new Cow("Mooo");


        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(garfield);
        listOfAnimals.add(filemon);
        listOfAnimals.add(teodor);
        listOfAnimals.add(reksio);
        listOfAnimals.add(reks);
        listOfAnimals.add(mucka);

        for (Animal animal : listOfAnimals){
            System.out.println(animal.makeSound());
        }


    }
}
