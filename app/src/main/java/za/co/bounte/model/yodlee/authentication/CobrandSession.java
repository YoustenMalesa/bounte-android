package za.co.bounte.model.yodlee.authentication;

/**
 * Created by Rocky on 2018/01/09.
 */

public class CobrandSession {

    public String cobSession;

    public CobrandSession(String cobSession) {
        this.cobSession = cobSession;
    }

    public String getCobSession() {
        return cobSession;
    }

    public void setCobSession(String cobSession) {
        this.cobSession = cobSession;
    }
}
