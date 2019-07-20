package advance1.day3.assignment23;

public class ExceptionhandlingDemo {


    public static void main(String[] args) {
        String name = null;
        int total = 100,count=0;
        try{
            int average = total/count;
            System.out.println(average);
            System.out.println(name.length());
        }
        catch(NullPointerException exception){
            System.out.println("Object is null");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Continuing the execution...");
    }
}

