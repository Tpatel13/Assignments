package advance1.day4.assignment32;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class TestReflaction {

    public static void main(String[] args) {


        try{
            Class abc=Class.forName("advance1.day4.assignment32.EmployeeBean");
            Method[] methods=abc.getMethods();

         for(int i=0;i<methods.length;i++){
             System.out.print("ACCESS SPECIFIER ::\""+Modifier.toString(methods[i].getModifiers()));

             System.out.print("\" RETURN TYPE :: \""+methods[i].getReturnType());

             System.out.print("\" METHOD NAME :: \" "+methods[i].getName()+"  ");
            // System.out.print(methods[i].getReturnType());


             Parameter[] para=methods[i].getParameters();
             for(int j=0;j<para.length;j++){
                 System.out.print("\" Parameters Tyre:: "+para[j].getType());
             }
             System.out.println("");
         }


        }
        catch(Exception e){

            e.printStackTrace();

        }
    }
}
