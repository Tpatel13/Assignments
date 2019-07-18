package basic.day3;

public class Assignment5 {

    public static void main(String[] args) {
        String input=args[0];
        System.out.println("2 .Length of Input is "+ input.length());
        System.out.println("3. Hi"+input);
        System.out.println("4 .Lowercase "+ input.toLowerCase());
        System.out.println("5. Upper case"+input.toUpperCase());
        if(input.contains("a"))
        {
            System.out.println("It contains A");
        }
        else
            System.out.println("There is no A");
        input="KRISHNA";
        System.out.println("7.Replaced String "+input);


    }
}
