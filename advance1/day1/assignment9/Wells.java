package advance1.day1.assignment9;


public class Wells {

    public static void main(String[] args) {
        EmployeeGrade Elvis = new EmployeeGrade();

        Elvis.initilizeEmployeee(1, "Tirth", 0, 4, 4);

        Elvis.calculateAverageFeedback();
        Elvis.calculateGrade();
        Elvis.displayInfo();

        EmployeeGrade Maratha = new EmployeeGrade();
        Maratha.initilizeEmployeee('2', "Vishwa", 5, 5);
        Maratha.calculateAverageFeedback();
        Maratha.calculateGrade();
        Maratha.displayInfo();
    }
}
