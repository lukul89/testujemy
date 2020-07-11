package zadaniasobota;

public class Zadanie1 {
    public static void Multiplying(int number){
        for (int i = 1; i < 5; i++){
            int result = number * i;
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Multiplying(5);
    }
}
