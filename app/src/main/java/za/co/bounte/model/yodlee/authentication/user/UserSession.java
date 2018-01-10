package za.co.bounte.model.yodlee.authentication.user;

/**
 * Created by Rocky on 2018/01/09.
 */

public class UserSession {

    public String userSession;

    public UserSession() {
    }

    public UserSession(String userSession) {
        this.userSession = userSession;
    }

    public String getCobSession() {
        return userSession;
    }

    public void setCobSession(String userSession) {
        this.userSession = userSession;
    }
}
