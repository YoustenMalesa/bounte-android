package za.co.bounte.model.yodlee.provider;

/**
 * Created by Rocky on 2018/01/10.
 */

public class CreditCard{
    private Integer numberOfTransactionDays;

    public CreditCard() {
    }

    public CreditCard(Integer numberOfTransactionDays) {
        this.numberOfTransactionDays = numberOfTransactionDays;
    }

    public Integer getNumberOfTransactionDays() {
        return numberOfTransactionDays;
    }

    public void setNumberOfTransactionDays(Integer numberOfTransactionDays) {
        this.numberOfTransactionDays = numberOfTransactionDays;
    }

}
