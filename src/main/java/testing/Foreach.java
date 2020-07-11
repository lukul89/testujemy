package testing;


public class Foreach {
    public static void ex1(String[] names) {
        for (String name : names) {
            System.out.println("Hello " + name);
        }

    }

    public static void main(String[] args) {
        String[] table = {"Michał", "Sara", "Kamil", "Żenata", "Lukasz"};
        ex1(table);

    }


}
