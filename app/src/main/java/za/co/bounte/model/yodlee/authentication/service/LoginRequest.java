package za.co.bounte.model.yodlee.authentication.service;

/**
 * Created by Rocky on 2018/01/09.
 */

public class LoginRequest {
    private Cobrand cobrand;

    public LoginRequest(Cobrand cobrand) {
        this.cobrand = cobrand;
    }

    public Cobrand getCobrand() {
        return cobrand;
    }

    public void setCobrand(Cobrand cobrand) {
        this.cobrand = cobrand;
    }
}
