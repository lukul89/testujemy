package zadaniasobota;

public class Zadanie4 {


    public static int[] switchTable(int[] tables){
        if (tables.length > 1){
            int tmp = tables[0];
            tables[0] = tables[tables.length - 1];
            tables[tables.length - 1] = tmp;
        }

        return tables;
    }
    public static void printTable(int[] array){
        for (int value:array) {
            System.out.print("[" + value + "] ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] beforeTable = {12, 23, 80};
        printTable(beforeTable);
        int[] afterTbale = switchTable(beforeTable);
        //printTable(afterTbale);
        Zadanie4.printTable(afterTbale);
    }
}
