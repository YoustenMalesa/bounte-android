package za.co.bounte.model.yodlee.authentication.service;

/**
 * Created by Rocky on 2018/01/09.
 */

public class Cobrand {

    private String cobrandLogin;
    private String cobrandPassword;
    private String locale;

    public Cobrand(String cobrandLogin, String cobrandPassword, String locale) {
        this.cobrandLogin = cobrandLogin;
        this.cobrandPassword = cobrandPassword;
        this.locale = locale;
    }

    public String getCobrandLogin() {
        return cobrandLogin;
    }

    public void setCobrandLogin(String cobrandLogin) {
        this.cobrandLogin = cobrandLogin;
    }

    public String getCobrandPassword() {
        return cobrandPassword;
    }

    public void setCobrandPassword(String cobrandPassword) {
        this.cobrandPassword = cobrandPassword;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
