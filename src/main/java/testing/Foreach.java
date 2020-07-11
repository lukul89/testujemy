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

        String[] names = {"cheese", "bun", "ham"};
        String shopinglist = ex2(names);
        System.out.println(shopinglist);

    }

    public static String ex2(String[] products){

        String lists = "";
        for (String product: products) {
            lists += product;
            lists += ", ";

        }

        return lists;
    }

}
