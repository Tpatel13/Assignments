package advance1.day4.assignment31;

import java.util.ArrayList;

public class Gen {
    public static void main(String[] args) {
        ArrayList<Integer> employeeId = new ArrayList<Integer>(0);
        employeeId.add(1001);
        employeeId.add(1002);
        //  employeeId.add("asa");
        for (int count = 0; count < employeeId.size(); count++) {

            System.out.println(employeeId.get(count));

        }


        Car car1 = new Car("FOrd");
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Honda");


        ArrayList<Car> car = new ArrayList<>();
        car.add(car1);
        car.add(car2);
        car.add(car3);

        for (Car cr : car) {
            System.out.println(cr.name);
        }

    }


}


class Car {
    String name;

    int a = 0;

    Car(String name) {
        this.name = name;
    }
}