package Interface;

import lombok.AllArgsConstructor;

@AllArgsConstructor  // lombook dodaje konstruktor automatycznie nic wiecej nie trzeba robic pisac konstruktorów jak poniżej
public class Cow implements Animal{
    private String cowSound;

    //public Cow(String mlaskMlask){                Tworzenie konstruktora
     //   this.cowSound = mlaskMlask;
    //}

   // public Cow(String cowSound) {                 Automatyczne tworzenie konstruktora przez Gnerate za pomocą InteliJ
    //    this.cowSound = cowSound;
   // }



    @Override
    public String makeSound() {
        return cowSound;
    }
}
