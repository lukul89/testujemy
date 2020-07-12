package zadaniasobota;

public class Zadanie6 {
    public static int getNegatives(int[] numbers){
        int negativeCount = 0;
        for(int number : numbers){
            if(number < 0) negativeCount++;
        }
        return negativeCount;
    }
    public static int[] storeNegatives(int[] numbers) {
        int size = getNegatives(numbers);
        int[] negativesArray = new int[size];
        int iterator = 0;
        for (int number : numbers){
            if (number < 0) {
                negativesArray[iterator] = number;
                iterator++;
            }
        }

        return negativesArray;
    }
    public static void printTable(int[] tables){
        for (int index : tables){
            System.out.println("[" + index + "] ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {99, -1, 44, 9, -45, -9, 8};
        printTable(numbers);
        int[] negatives = storeNegatives(numbers);
        printTable(negatives);
    }
}
