package com.admarv.saas.bing.model.accountmonthlyspend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Header {
    
    @XmlElement(name = "UserName", namespace = "https://bingads.microsoft.com/Billing/v13")
    private String userName;

    @XmlElement(name = "Password", namespace = "https://bingads.microsoft.com/Billing/v13")
    private String password;

    @XmlElement(name = "DeveloperToken", namespace = "https://bingads.microsoft.com/Billing/v13")
    private String developerToken;

    @XmlElement(name = "AuthenticationToken", namespace = "https://bingads.microsoft.com/Billing/v13")
    private String authenticationToken;

    @XmlElement(name = "ApplicationToken", namespace = "https://bingads.microsoft.com/Billing/v13")
    private String applicationToken;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeveloperToken() {
        return developerToken;
    }

    public void setDeveloperToken(String developerToken) {
        this.developerToken = developerToken;
    }

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    public String getApplicationToken() {
        return applicationToken;
    }

    public void setApplicationToken(String applicationToken) {
        this.applicationToken = applicationToken;
    }

    @Override
    public String toString() {
        return "Header [userName=" + userName + ", password=" + password + ", developerToken=" + developerToken
                + ", authenticationToken=" + authenticationToken + ", applicationToken=" + applicationToken + "]";
    }
}
