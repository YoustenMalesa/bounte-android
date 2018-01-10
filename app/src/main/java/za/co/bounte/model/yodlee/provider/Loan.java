package za.co.bounte.model.yodlee.provider;

/**
 * Created by Rocky on 2018/01/10.
 */

public class Loan {
    private Integer numberOfTransactionDays;

    public Loan() {
    }

    public Loan(Integer numberOfTransactionDays) {
        this.numberOfTransactionDays = numberOfTransactionDays;
    }

    public Integer getNumberOfTransactionDays() {
        return numberOfTransactionDays;
    }

    public void setNumberOfTransactionDays(Integer numberOfTransactionDays) {
        this.numberOfTransactionDays = numberOfTransactionDays;
    }
}
