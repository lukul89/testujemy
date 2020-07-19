package Obiektowość;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter             //dodanie getterow i seterow do punktu zadania z Address
@Setter
<<<<<<< HEAD
//@AllArgsConstructor odpowiada konstruktorowi z linii 18
=======
//@AllArgsConstructor odpowiada konstruktorowi z linii 17
>>>>>>> 52ea1e69f3616e3c86dbf583d1db455fc61f54e3
public class Person{

    public static final Integer MAX_AGE = 130;
    private String name;                    // pola, atrybuty prywatne
    private String surname;
    private int age = 18;
    private Address address;

    public Person(String name, String surname, int age, Address address) {          // nowy konstruktor do klasy Address kolejny etap zadania po tym jak wczesniejsze rzeczy byly zrobione
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(){                                    // kostruktor bezparametrowy ustawiamy wartości pól odrazu ale moga byc zmieniane
        this.name = "Młody";
        this.surname = "Bóg";
       // this.age = 18;
    }
    // konstruktor z parametrami
    public Person(String name, String surname, Integer age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.age = 20;
    }
    public Integer getAge(){
        return this.age;
    }

    public void introduce(){                        //robimy metode do przywitania, nie moze byc static bo wykorzystuje pola z konstruktorów
        System.out.println("Hello: " + this.name + " " + this.surname);

    }
    public void introduce(String hello){                // metoda przywitania gdzie hello trzeba podac bo moze byc w roznych jezykach
        System.out.println(hello + " " + this.name + " " + this.surname);
    }

    @Override                                       // jesli tego nie nadpiszemy to bedzie zwracac nam domyslne ustawienie z klasy Object sproboj zakomentowac to nadpisanie i zobacz roznice
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address.toString() +
                '}';
    }
}
