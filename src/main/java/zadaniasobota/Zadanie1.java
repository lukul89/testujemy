package zadaniasobota;

public class Zadanie1 {
    public static void Multiplying(int number, int range){
        for (int i = 1; i <= range; i++){
            int result = number * i;
            System.out.println(" " + number + " * " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        Multiplying(5, 6);
    }
}
