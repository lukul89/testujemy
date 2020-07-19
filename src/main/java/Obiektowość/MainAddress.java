package Obiektowość;

public class MainAddress {

    public static void main(String[] args) {
        Address address = new Address("Długa", "Krakow", "Poland", 6, 21);
        System.out.println("getter: " + address.getStreet());

        System.out.println(address.toString());
        address.setFlatNo(50);
        address.setHomeNo(66);
        address.setStreet("Krotka");

        System.out.println("Po zmianie " + address.toString());
        System.out.println("getter: " + address.getStreet());
        System.out.println("===================");
        Person examplePerson = new Person("Ana","Nowak",25, address);

        System.out.println("przed przeprowadzka: " + examplePerson.toString());
        Address exampleAddress = new Address("prosta", "warszawa", "poland", 8,9);
        examplePerson.setAddress(exampleAddress);
        System.out.println("po przeprowadzce " + examplePerson.toString());

    }
}
