package com.admarv.saas.bing.model.accountmonthlyspend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class GetAccountMonthlySpendRequest {
    
    @XmlElement(name = "AccountId", namespace = "https://bingads.microsoft.com/Billing/v13")
    private String accountId;

    @XmlElement(name = "MonthYear", namespace = "https://bingads.microsoft.com/Billing/v13")
    private String monthYear;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(String monthYear) {
        this.monthYear = monthYear;
    }

    @Override
    public String toString() {
        return "GetAccountMonthlySpendRequest [accountId=" + accountId + ", monthYear=" + monthYear + "]";
    }
}
