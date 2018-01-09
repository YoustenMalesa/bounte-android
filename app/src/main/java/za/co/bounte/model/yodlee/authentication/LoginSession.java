package za.co.bounte.model.yodlee.authentication;

/**
 * Created by Rocky on 2018/01/09.
 */

public class LoginSession {
    private String cobrandId;
    private String applicationId;
    private String locale;
    private CobrandSession session;

    public LoginSession(String cobrandId, String applicationId, String locale, CobrandSession session) {
        this.cobrandId = cobrandId;
        this.applicationId = applicationId;
        this.locale = locale;
        this.session = session;
    }

    public String getCobrandId() {
        return cobrandId;
    }

    public void setCobrandId(String cobrandId) {
        this.cobrandId = cobrandId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public CobrandSession getSession() {
        return session;
    }

    public void setSession(CobrandSession session) {
        this.session = session;
    }
}
