package advance2.assignment7;

public class Security {

    public synchronized void authorization(Account account, Customer customer)
            throws UnAuthorizedWithdrawTransactionException {


        if(account.getCustomer().getCustomerId()!=

                customer.getCustomerId()){

            throw new UnAuthorizedWithdrawTransactionException();
        }
    }
}
