package com.admarv.saas.bing.model.accountmonthlyspend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Body {
    
    @XmlElement(name = "GetAccountMonthlySpendRequest", namespace = "https://bingads.microsoft.com/Billing/v13")
    private GetAccountMonthlySpendRequest getAccountMonthlySpendRequest;

    public GetAccountMonthlySpendRequest getGetAccountMonthlySpendRequest() {
        return getAccountMonthlySpendRequest;
    }

    public void setGetAccountMonthlySpendRequest(GetAccountMonthlySpendRequest getAccountMonthlySpendRequest) {
        this.getAccountMonthlySpendRequest = getAccountMonthlySpendRequest;
    }

    @Override
    public String toString() {
        return "Body [getAccountMonthlySpendRequest=" + getAccountMonthlySpendRequest + "]";
    }
}
