package advance1.day2.assignment18;

public class Animals {

     private String name,color;
     private int age;

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo()
    {
        System.out.println("AGe Name Color:::"+this.age+" "+this.name+" "+this.color);
    }
}
