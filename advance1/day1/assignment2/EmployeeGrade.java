package advance1.day1.assignment2;



/*
 * This java file is a program to calculate the average feedback
 * of 5 employees and determine their grade
 */

/**
 * This class will display the grade of 5 employees according
 * to their feedback.
 * Date : 07/18/2019
 *
 * @author Tirth
 * @version 1.0
 */

public class EmployeeGrade {
    /**
     * Calculates the average feedback of 5 employees and determines
     * their grade
     *
     * @param args: Command line arguments
     */
    public static void main(String[] args) {

//To-do: Calculate the average feedback of all the employees
//To-do: Determine the grade of all the employees
        int employeeID[] = {1001, 1002, 1003, 1004, 1005};

        float customer1Feedback[] = {5.0f, 3.8f, 4.5f, 4.9f, 3.9f};
        float customer2Feedback[] = {5.0f, 3.8f, 0.5f, 4.9f, 3.9f};
        float customer3Feedback[] = {5.0f, 2.2f, 0.2f, 2.3f, 2.4f};
        float[] avgFeedback = new float[5];
        char[] grade = new char[5];


        //Finding avg and save it to avgFeedback array
        for (int i = 0; i < employeeID.length; i++) {


            avgFeedback[i] = (customer1Feedback[i] + customer2Feedback[i] + customer3Feedback[i]) / 3;


        }

//         //Printing avg feedback
//        for (int i = 0; i < avgFeedback.length; i++) {
//            System.out.println(avgFeedback[i]);
//        }
        //Calculating Grade . A=4.5+ , B=3 to 4.5 and C less then 3
        for (int i = 0; i < avgFeedback.length; i++) {
            if (avgFeedback[i] >= 4.5) grade[i] = 'A';
            else if (avgFeedback[i] < 4.5 && avgFeedback[i] >= 2.5) grade[i] = 'B';
            else grade[i] = 'C';
        }


        //displaying everytime
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee No :" + employeeID[i] + " Avg Grade ::" + avgFeedback[i] + " Grade :: " + grade[i]);
        }

    }
}

