package codingtask.problem2;

public class Musician extends Instrument {
    private String name;

    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }

    public void playInstrument(Instrument i){
        super.playSound();
    }

}
