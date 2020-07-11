package testing;


import java.time.LocalDate;

public class Datetime {

    public static void dateNow(){
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
    }
  

    public static void main(String[] args) {
        dateNow();
    }

}
