package za.co.bounte.model.yodlee.provider;

/**
 * Created by Rocky on 2018/01/10.
 */

public class ContainerAttributes {
    private Loan lOAN;
    private CreditCard creditCard;
    private Bank bank;
    private Investment investment;

    public Loan getLOAN() {
        return lOAN;
    }

    public void setLOAN(Loan lOAN) {
        this.lOAN = lOAN;
    }

    public CreditCard getCREDITCARD() {
        return creditCard;
    }

    public void setCREDITCARD(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Bank getBANK() {
        return bank;
    }

    public void setBANK(Bank bbankANK) {
        this.bank = bank;
    }

    public Investment getINVESTMENT() {
        return investment;
    }

    public void setINVESTMENT(Investment investment) {
        this.investment = investment;
    }
}
