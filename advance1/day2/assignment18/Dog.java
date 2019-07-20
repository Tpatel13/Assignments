package advance1.day2.assignment18;

public class Dog extends Animals implements PetAnimal {

    private String breed;

    public Dog(String name, String color, int age,String breed) {
        super(name, color, age);
        this.breed=breed;
    }

    @Override
    public boolean beingFriendly() {
        return true;
    }

    @Override
    public boolean playingWithHumanbeings() {
        return true;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();

        System.out.println("Breed"+this.breed);
    }
}
