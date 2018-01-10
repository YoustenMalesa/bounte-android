package za.co.bounte.model.yodlee.provider;

import java.util.List;

/**
 * Created by Rocky on 2018/01/10.
 */

public class Provider {

    private String PRIORITY;
    private Integer id;
    private String name;
    private String loginUrl;
    private String baseUrl;
    private String favicon;
    private String logo;
    private String status;
    private Boolean oAuthSite;
    private String languageISOCode;
    private String primaryLanguageISOCode;
    private String countryISOCode;
    private String lastModified;
    private String forgetPasswordUrl;
    private Boolean isAutoRefreshEnabled;
    private ContainerAttributes containerAttributes;
    private List<String> containerNames = null;
    private List<AdditionalDataSet> additionalDataSet = null;
    private String authType;

    public Provider() {
    }

    public Provider(String PRIORITY, Integer id, String name, String loginUrl, String baseUrl, String favicon, String logo, String status, Boolean oAuthSite, String languageISOCode, String primaryLanguageISOCode, String countryISOCode, String lastModified, String forgetPasswordUrl, Boolean isAutoRefreshEnabled, ContainerAttributes containerAttributes, List<String> containerNames, List<AdditionalDataSet> additionalDataSet, String authType) {
        this.PRIORITY = PRIORITY;
        this.id = id;
        this.name = name;
        this.loginUrl = loginUrl;
        this.baseUrl = baseUrl;
        this.favicon = favicon;
        this.logo = logo;
        this.status = status;
        this.oAuthSite = oAuthSite;
        this.languageISOCode = languageISOCode;
        this.primaryLanguageISOCode = primaryLanguageISOCode;
        this.countryISOCode = countryISOCode;
        this.lastModified = lastModified;
        this.forgetPasswordUrl = forgetPasswordUrl;
        this.isAutoRefreshEnabled = isAutoRefreshEnabled;
        this.containerAttributes = containerAttributes;
        this.containerNames = containerNames;
        this.additionalDataSet = additionalDataSet;
        this.authType = authType;
    }

    public String getPRIORITY() {
        return PRIORITY;
    }

    public void setPRIORITY(String PRIORITY) {
        this.PRIORITY = PRIORITY;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getFavicon() {
        return favicon;
    }

    public void setFavicon(String favicon) {
        this.favicon = favicon;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getOAuthSite() {
        return oAuthSite;
    }

    public void setOAuthSite(Boolean oAuthSite) {
        this.oAuthSite = oAuthSite;
    }

    public String getLanguageISOCode() {
        return languageISOCode;
    }

    public void setLanguageISOCode(String languageISOCode) {
        this.languageISOCode = languageISOCode;
    }

    public String getPrimaryLanguageISOCode() {
        return primaryLanguageISOCode;
    }

    public void setPrimaryLanguageISOCode(String primaryLanguageISOCode) {
        this.primaryLanguageISOCode = primaryLanguageISOCode;
    }

    public String getCountryISOCode() {
        return countryISOCode;
    }

    public void setCountryISOCode(String countryISOCode) {
        this.countryISOCode = countryISOCode;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getForgetPasswordUrl() {
        return forgetPasswordUrl;
    }

    public void setForgetPasswordUrl(String forgetPasswordUrl) {
        this.forgetPasswordUrl = forgetPasswordUrl;
    }

    public Boolean getIsAutoRefreshEnabled() {
        return isAutoRefreshEnabled;
    }

    public void setIsAutoRefreshEnabled(Boolean isAutoRefreshEnabled) {
        this.isAutoRefreshEnabled = isAutoRefreshEnabled;
    }

    public ContainerAttributes getContainerAttributes() {
        return containerAttributes;
    }

    public void setContainerAttributes(ContainerAttributes containerAttributes) {
        this.containerAttributes = containerAttributes;
    }

    public List<String> getContainerNames() {
        return containerNames;
    }

    public void setContainerNames(List<String> containerNames) {
        this.containerNames = containerNames;
    }

    public List<AdditionalDataSet> getAdditionalDataSet() {
        return additionalDataSet;
    }

    public void setAdditionalDataSet(List<AdditionalDataSet> additionalDataSet) {
        this.additionalDataSet = additionalDataSet;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

}