package advance1.day2.assignment18;

public class Cat extends Animals implements PetAnimal {

    private String sound;
    @Override
    public boolean beingFriendly() {
        return false;
    }

    @Override
    public boolean playingWithHumanbeings() {
        return false;
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }



}
