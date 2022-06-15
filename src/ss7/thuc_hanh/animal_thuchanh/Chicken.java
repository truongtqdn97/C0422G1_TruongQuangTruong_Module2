package ss7.thuc_hanh.animal_thuchanh;

public class Chicken extends Animal implements IEdible {
    private String name = "chick";
    @Override
    public String makeSound() {
        return "Chicken: chip-chip!!!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }

    public String getName(){
        return this.name;
    }
}
