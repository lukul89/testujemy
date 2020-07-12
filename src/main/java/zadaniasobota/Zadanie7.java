package zadaniasobota;

public class Zadanie7 {
    public static int[] arraySeries(int lenght, int firstNumber, int gap){
        int[] array = new int[lenght];
        array[0] = firstNumber;
        for (int i = 1; i < lenght; i++){
            array[i] = array[i-1] + gap;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] result = arraySeries(4,1,2);
        Zadanie6.printTable(result);
    }
}
