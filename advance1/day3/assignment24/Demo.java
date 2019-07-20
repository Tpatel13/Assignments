package advance1.day3.assignment24;

public class Demo {


    public static void main(String[] args) {
        String name =  "john";
        int total = 100,count=10;
        try{
            int average = total/count;
            System.out.println(average);
            System.out.println(name.length());
        }

        catch(ArithmeticException exception) {
            System.out.println("Arithmetic Exception " +
                    exception.getMessage());
        }

        catch(NullPointerException exception){
            System.out.println("Object is null");
        }

        finally{
            System.out.println("within finally block");
        }

        System.out.println("Continuing the execution...");

    }

    
}
