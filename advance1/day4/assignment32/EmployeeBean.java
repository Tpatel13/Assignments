package advance1.day4.assignment32;

import java.util.Calendar;

public class EmployeeBean {


    int employeeID;
    String employeeName;
    Calendar dateOfBirth;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName,long value) {
        this.employeeName = employeeName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
