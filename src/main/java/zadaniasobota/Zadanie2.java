package zadaniasobota;

public class Zadanie2 {
    public static void isPrimeNumber(int number){

        boolean PrimeNumber = true;
        if (number <= 1){
            System.out.println("Podaj liczbę wiekszą niż 1");
            return;
        }

        for (int i = 2; i < number/2; i++){
            if (number % i == 0){
            PrimeNumber = false;
            break;
            }
        }
        if (PrimeNumber){
            System.out.println(number + " jest liczbą pierwszą!");
        }else {
            System.out.println(number + " nie jest liczbą pierwszą!");
        }
    }

    public static void main(String[] args) {
        isPrimeNumber(190);
    }
}
