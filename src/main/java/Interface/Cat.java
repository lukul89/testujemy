package Interface;

public class Cat implements Animal {
    private String catSound;

    public Cat(){
        this.catSound = "Meow";
    }
    public Cat(String ownSound){
        this.catSound = ownSound;
    }

    @Override
    public String makeSound() {


        return catSound;
    }
    public static String testMakeSound(){
        return "testCatSound";
    }
}
