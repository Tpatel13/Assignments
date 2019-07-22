package advance1.day4.assignment30;


import advance1.day4.assignment27.Employee;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeInfo {
    public  void main(String[] args) {
        //To-Do : create four employee objects
        //To-Do : store the objects in the ArrayList
        /* [ HINT :]
         * Employee employee1 = new Emlpoyee(); * employee1.employeeID = 1001 ;
         * List list = new ArrayList();
         * list.add(employee1);
         */
        //To-Do : retrieve the employee objects from the list using iterator
        // and display their information

        EmployeeBeen emp1 = new EmployeeBeen();
        EmployeeBeen emp2 = new EmployeeBeen();

        Calendar c1 = GregorianCalendar.getInstance();
        c1.set(2000, Calendar.AUGUST, 30);
        Calendar c2 = GregorianCalendar.getInstance();
      c2.set(1992,Calendar.MARCH,1);


        emp1.setDateOfBirth(c1);
        emp1.setEmployeeName("Tirth");
        emp1.setEmployeeID(1);

        emp2.setDateOfBirth(c2);
        emp2.setEmployeeName("Vishwa");
        emp1.setEmployeeID(2);

        ArrayList<EmployeeBeen> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        for (EmployeeBeen employee : empList) {
            System.out.println("ALl info :::"+ employee.employeeName+"  "+employee.getDateOfBirth().getTime());
        }




    }

}

