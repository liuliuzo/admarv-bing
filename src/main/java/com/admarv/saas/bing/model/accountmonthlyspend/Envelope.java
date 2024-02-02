package com.admarv.saas.bing.model.accountmonthlyspend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.StreamingHttpOutputMessage.Body;

import com.admarv.saas.bing.parser.utils.SoapXmlUtils;

@XmlRootElement(name = "Envelope", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
@XmlAccessorType(XmlAccessType.FIELD)
public class Envelope {
    
    private static final Logger log = LoggerFactory.getLogger(Envelope.class);
    
    @XmlElement(name = "Header", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    private Header header;

    @XmlElement(name = "Body", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    private Body body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Envelope [header=" + header + ", body=" + body + "]";
    }
    
    public static void main(String[] args) {
        String soapXml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v13=\"https://bingads.microsoft.com/Billing/v13\"><soapenv:Header><v13:UserName></v13:UserName><v13:Password></v13:Password><v13:DeveloperToken></v13:DeveloperToken><v13:AuthenticationToken></v13:AuthenticationToken><v13:ApplicationToken></v13:ApplicationToken></soapenv:Header><soapenv:Body><v13:GetAccountMonthlySpendRequest><v13:AccountId>176344337</v13:AccountId><v13:MonthYear>2024-02</v13:MonthYear></v13:GetAccountMonthlySpendRequest></soapenv:Body></soapenv:Envelope>";
        Envelope envelope = SoapXmlUtils.parseSoapXml(soapXml, Envelope.class);
        log.info("envelope：{}", envelope);
    }
}
