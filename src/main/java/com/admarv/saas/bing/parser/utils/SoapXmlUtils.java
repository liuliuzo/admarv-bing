package com.admarv.saas.bing.parser.utils;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoapXmlUtils {

    private static final Logger log = LoggerFactory.getLogger(SoapXmlUtils.class);

    public static <T> T parseSoapXml(String soapXml, Class<T> clazz) {
        try {
            log.info("Parsing SOAP XML to Object");
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(soapXml);
            return clazz.cast(unmarshaller.unmarshal(reader));
        } catch (JAXBException e) {
            log.error("Error parsing SOAP XML to Object: " + e.getMessage(), e);
            return null;
        }
    }

    public static <T> String convertObjectToXmlStr(T object) {
        try {
            log.info("Converting Object to SOAP XML String");
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter writer = new StringWriter();
            marshaller.marshal(object, writer);
            return writer.toString();
        } catch (JAXBException e) {
            log.error("Error converting Object to SOAP XML String: " + e.getMessage(), e);
            return "";
        }
    }
}
