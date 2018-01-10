package za.co.bounte.model.yodlee.authentication.user;

/**
 * Created by Rocky on 2018/01/10.
 */

public class UserPreferences {
    private String currency;
    private String timeZone;
    private String dateFormat;
    private String locale;


    public UserPreferences() {
    }

    public UserPreferences(String currency, String timeZone, String dateFormat, String locale) {
        this.currency = currency;
        this.timeZone = timeZone;
        this.dateFormat = dateFormat;
        this.locale = locale;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
