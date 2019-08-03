package advance3.assignment3;

import java.io.Serializable;

public class SavingAccount extends Account implements Serializable {
    private float rateOfInterest;

    private double minimumBalance;

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public SavingAccount(int accountNo, Customer customer, double
            balance, float rateOfInterest, double minimumBalance) {

        super(accountNo,customer,balance);
        this.rateOfInterest = rateOfInterest;
        this.minimumBalance = minimumBalance;
    }
}
