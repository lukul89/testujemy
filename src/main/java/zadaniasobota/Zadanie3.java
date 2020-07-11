package zadaniasobota;

public class Zadanie3 {
    public static void SumBetween(int FirstNum, int ScondNum){
        int sum = 0;
        for (int i = FirstNum; i <= ScondNum; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumBetween(1, 5);
    }
}
