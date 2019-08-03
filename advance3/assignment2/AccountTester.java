package advance3.assignment2;

public class AccountTester {

    public void acceptAccountInfo() {
        System.out.println("\n\n\tPlease enter the details of the account");
        System.out.print("account Id :");
        String accountID = Readdata.acceptstring();
        System.out.print("Enter balance :");
        String balance = Readdata.acceptstring();

        // Customer customer = new Customer();
        Account account = new Account();
        account.setAccountNo(Integer.parseInt(accountID));
        account.setBalance(Double.parseDouble(balance));
        int status = new AccountDB().saveAccount(account);
        if (status == 0) {

            System.out.println("Your details are saved");
            Readdata.acceptstring();
            System.out.println("\n\n\n\n\n\n\n");
        } else {

            System.out.println("Your details could not be saved.Please try later");
            Readdata.acceptstring();
            System.out.println("\n\n\n\n\n\n\n");
        }
    }

    public void displayAccountInfo() {
        System.out.print("\n\nPlease enter account Id :");
        String accountId = Readdata.acceptstring();
        Account account = new
                AccountDB().getAccount(Integer.parseInt(accountId));
        if (account != null) {
            System.out.println("\n Account Id " + account.getAccountNo());
            System.out.println(" balance :: " + account.getBalance());
        } else {
            System.out.println("Invalid acccount Id!!!");
            Readdata.acceptstring();
            System.out.println("\n\n\n\n\n\n\n");
        }
    }

    public void accountTester() {
        while (true) {
            System.out.println("\tAccount Menu");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("1.Add account");
            System.out.println("2.Get account Info");
            System.out.println("3.Exit");
            System.out.print("\nEnter option :");
            String optedValue = Readdata.acceptstring();
            int option = Integer.parseInt(optedValue);
            switch (option) {
                case 1:
                    acceptAccountInfo();
                    break;
                case 2:
                    displayAccountInfo();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid option");
                    Readdata.acceptstring();
            }
        }
    }
}
