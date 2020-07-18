package Interface;

import lombok.Getter;
import lombok.Setter;

@Getter             // ustawienie gettera przez lombook
@Setter             // ustawienie settera przez lombook
public class Cat implements Animal {
    private String catSound;
    private int age;


    public Cat(){
        this.catSound = "Meow";
    }
    public Cat(String ownSound){

        this.catSound = ownSound;
    }

    //public int getAge() {                 ustawianie getera po public zaczac pisac get i samo sie ustawi
    //    return age;
   // }

   // public void setAge(int age) {         ustawianie settera po public zaczac pisac set i samo sie ustawi
   //     this.age = age;
   // }

    @Override
    public String makeSound() {


        return catSound;
    }
    public static String testMakeSound(){
        return "testCatSound";
    }
}
