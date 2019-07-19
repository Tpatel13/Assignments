package advance1.assignment6;

public class Wells {
    public static void main(String[] args) {

        //Not taking arguma
        Salary account1 = new Salary("Tirth Patel", "tirthp1313@gmail.com", "15th July", 'M', 'S');


        //We can put condition if salary is less then 10k
        NonSalary account2 = new NonSalary("Vishwa", "tirthp1313@yahoo.com", "15th July", 'M', 'S', 12000);

        account2.displayDetails();
        account1.displayDetails();

    }
}
