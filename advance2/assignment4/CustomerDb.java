package advance2.assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CustomerDb {
    private List<Customer> customerList=new ArrayList<Customer>();
    /**
     * <h3>Description :</h3> This method saves input
     * customer object in the list
     * @param customer The customer bean
     * @return true if the customer is successfully added else
     * returns false
     */
    public boolean saveCustomer(Customer customer){
        boolean status=false;
//adding the customer to the list i.e saving the customer
//object
        status=customerList.add(customer);
 return status;
    }
    /**
     //returning the list of customers
     return status;

     * <h3>Description :</h3> This method is used to get the details
     * of all the customers
     * @return the list of all the customers
     */
    public List<Customer> getAllCustomers(){
        return customerList;
    }
    public Set<Integer> getLoanAvailedCustomers() {
//creating the set of customer ids
        Set<Integer> loanAvailedCustomers = new TreeSet<Integer>();
//getting the iterator for the list of customers
        Iterator<Customer> customerIterator =

                customerList.iterator();
        while (customerIterator.hasNext()) {
//getting the customer object
            Customer customer = customerIterator.next();
//checking if the loan is availed
            if (customer.isLoanAvailed()) {
//adding the customer ids to the set
                loanAvailedCustomers.add(customer.getCustomerId());
            }
        }
//returning the set of customers who have availed the loan
        return loanAvailedCustomers;
    }
}
