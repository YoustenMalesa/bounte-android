package za.co.bounte.model.yodlee.authentication.user;

/**
 * Created by Rocky on 2018/01/10.
 */

public class YodleeUserDetails {
    private int id;
    private String loginName;
    private String roleType;
    private Names name;
    private UserSession session;
    private UserPreferences preferences;

    public YodleeUserDetails() {
    }

    public YodleeUserDetails(int id, String loginName, String roleType, Names name, UserSession session, UserPreferences preferences) {
        this.id = id;
        this.loginName = loginName;
        this.roleType = roleType;
        this.name = name;
        this.session = session;
        this.preferences = preferences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public Names getName() {
        return name;
    }

    public void setName(Names name) {
        this.name = name;
    }

    public UserSession getSession() {
        return session;
    }

    public void setSession(UserSession session) {
        this.session = session;
    }

    public UserPreferences getPreferences() {
        return preferences;
    }

    public void setPreferences(UserPreferences preferences) {
        this.preferences = preferences;
    }
}
