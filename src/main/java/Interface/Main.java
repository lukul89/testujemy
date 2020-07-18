package Interface;

public class Main {
    public static void main(String[] args) {
        Cat garfield = new Cat();
        Cat filemon = new Cat("Mrau");
       // System.out.println(Cat.testMakeSound());

        //String garfieldSound = garfield.makeSound();
        //System.out.println(garfieldSound);
        //System.out.println(filemon.makeSound());

        Cow mucka = new Cow("Moo");
        System.out.println(mucka.makeSound());

        Dog reksio = new Dog("HauHau");
        System.out.println(reksio.makeSound());
    }
}
