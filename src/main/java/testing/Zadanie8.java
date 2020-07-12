package testing;

import zadaniasobota.Zadanie6;

public class Zadanie8 {
    public static boolean isArthmeticalArray(int[] arrayArthmetic){
        if (arrayArthmetic.length < 2) return false;
        boolean isCorrect = true;
        int gap = arrayArthmetic[1] - arrayArthmetic[0];
        for (int i = 2; i < arrayArthmetic.length; i++ ){
            int actualGap = arrayArthmetic[i] - arrayArthmetic[i-1];
            if (actualGap != gap){
                isCorrect = false;
                break;
            }
        }
        return isCorrect;
    }

    public static void main(String[] args) {
        int[] arrayIsNotCorrect = {4,54,4,4};
        int[] arrayIsCorrect = {1,5, 9, 13};
        Zadanie6.printTable(arrayIsCorrect);
        boolean result = isArthmeticalArray(arrayIsCorrect);
        System.out.println(result);
    }
}
