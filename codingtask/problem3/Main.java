package codingtask.problem3;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(111, 100);
        Account acc2 = new Account(222, 200);
        Account acc3 = new Account(333, 300);

        try {
            acc1.deposit(200);
        } catch (InvilidAmountException e) {
            System.out.println(e);

        }
        try {
            acc3.deposit(-100);
        } catch (InvilidAmountException e) {
            System.out.println(e);
        }
        try {
            acc2.withdraw(300);
        } catch (BalanceException e) {
            System.out.println(e);
        }


        System.out.println("Total number of accounts is " + Account.totalAccounts);
    }
}
