package za.co.bounte.model.yodlee.authentication.user;

/**
 * Created by Rocky on 2018/01/10.
 */

public class UserLoginResponse {
    private YodleeUserDetails user;

    public UserLoginResponse() {
    }

    public UserLoginResponse(YodleeUserDetails user) {
        this.user = user;
    }

    public YodleeUserDetails getUser() {
        return user;
    }

    public void setUser(YodleeUserDetails user) {
        this.user = user;
    }
}
