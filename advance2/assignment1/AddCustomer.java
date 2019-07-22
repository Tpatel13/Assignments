package advance2.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddCustomer {


   public void printCustomers(List<String> list)
   {
       System.out.println("Given List is ");

//       for(String list1:list)
//       {
//           System.out.println(list1);
//       }
     Iterator<String> data=list.iterator();

     while(data.hasNext()){
         System.out.println(data.next());
     }
   }

    public static void main(String args[]){
//Create reference of List and object of ArrayList
        List<String> list=new ArrayList<String>();
        list.add("Jack");
        list.add("Harry");
        list.add("Tabrez");
        list.add("Leezu");
        AddCustomer addCustomer=new AddCustomer();
//Call printCustomers()to print the contents of list
        addCustomer.printCustomers(list);
    }
}

