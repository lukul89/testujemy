package zadaniasobota;

public class Zadanie5 {
    public static void getMinAndMaxValueFromArray(int[] numbers) {
        if (numbers.length > 0) {
            int min = numbers[0];
            int max = numbers[0];
            for (int number : numbers) {
                if (number > max){
                    max = number;
                }
                if (number < min) min = number;
            }
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }
    public static void main(String[] args) {
        int[] numbers = {99, -1, 0, 2};
        getMinAndMaxValueFromArray(numbers);
    }
}
