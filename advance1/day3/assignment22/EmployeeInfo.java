package advance1.day3.assignment22;

import java.util.Vector;

public class EmployeeInfo {

    public static void main (String[] args) {
        //Vector is in java.util package. Refer javaDocs
        Vector empList = new Vector();
        int empNo=1000;
        for(int count=0;count<5;count++)
        {
            empNo++;
            // Only object can be added to the vector.
            // Convert the int to Integer
            // To-do: add the empNo to the vector
             empList.add(Integer.valueOf(empNo));
            //empList.add(empNo); **IT was working,too**

        }
        System.out.println(empList);


        // To-do: retrieve and display the elements in vector
    }
}
