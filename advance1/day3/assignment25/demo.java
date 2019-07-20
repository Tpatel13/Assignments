package advance1.day3.assignment25;

public class demo {
    static {
        System.out.println("In the static block of ExceptionDemo..");
    }

    public static void main(String[] args) {
       try{
        Class.forName("com.exception.ExceptionDemo");
    }
       catch(Exception e){
           System.out.println("Exception :"  + e );
       }
     }

}
