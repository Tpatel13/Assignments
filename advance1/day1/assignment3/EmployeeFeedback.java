package advance1.day1.assignment3;


public class EmployeeFeedback {
    /**
     * Stores and displays the feedback of the employees from their
     * customer
     * @param args: Command line arguments
     */
    public static void main (String [] args) {
        int empInfo[][] = {{1001,4,5}, {1002,2,4,5}};
        for (int outerLoop=0;outerLoop<2;outerLoop++) {
            for (int innerLoop=0;innerLoop<empInfo[outerLoop].length;innerLoop++) {
                System.out.println(empInfo[outerLoop][innerLoop]);
            }
        }
    }


}
