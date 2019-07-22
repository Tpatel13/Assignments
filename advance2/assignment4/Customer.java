package advance2.assignment4;

public class Customer{
    /*
     * The customer Id of the customer
     */
    private int customerId;
    /*
     * The name of the customer
     */
    private String customerName;
    /*
     * The status of the cuatomer if has already availed the loan
     */
    private boolean loanAvailed;
    public Customer(int customerId,String customerName){
        this.customerId=customerId;
        this.customerName=customerName;
    }
    public Customer(int customerId,String customerName,boolean
            loanAvailed){
        this.customerId=customerId;
        this.customerName=customerName;
        this.loanAvailed=loanAvailed;
    }
    /**
     * <h3> Description :</h3> The getter method for the customer Id
     * @return the customerId
     */
    public int getCustomerId() {
        return customerId;
    }
    /**
     * <h3> Description :</h3> The setter method for the customer Id
     * @param customerId the customerId to set
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    /**
     * <h3> Description :</h3> The getter method for the customer
     * name
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    /**
     * <h3> Description :</h3> The getter method for the customer
     * loan status
     * @return the loanAvailed
     */
    public boolean isLoanAvailed() {
        return loanAvailed;
    }
    /**
     * <h3> Description :</h3> The setter method for the customer
     * loan status
     * @param loanAvailed the loanAvailed to set
     */
    public void setLoanAvailed(boolean loanAvailed) {
        this.loanAvailed = loanAvailed;
    }
}
