
package com.example.demo.wbservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nc.bs.workorder.itf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RepairDeleteString_QNAME = new QName("", "string");
    private final static QName _RepairInsertResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nc.bs.workorder.itf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RepairUpdateResponse }
     * 
     */
    public RepairUpdateResponse createRepairUpdateResponse() {
        return new RepairUpdateResponse();
    }

    /**
     * Create an instance of {@link RepairInsertResponse }
     * 
     */
    public RepairInsertResponse createRepairInsertResponse() {
        return new RepairInsertResponse();
    }

    /**
     * Create an instance of {@link RepairDelete }
     * 
     */
    public RepairDelete createRepairDelete() {
        return new RepairDelete();
    }

    /**
     * Create an instance of {@link RepairDeleteResponse }
     * 
     */
    public RepairDeleteResponse createRepairDeleteResponse() {
        return new RepairDeleteResponse();
    }

    /**
     * Create an instance of {@link RepairUpdate }
     * 
     */
    public RepairUpdate createRepairUpdate() {
        return new RepairUpdate();
    }

    /**
     * Create an instance of {@link RepairInsert }
     * 
     */
    public RepairInsert createRepairInsert() {
        return new RepairInsert();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = RepairDelete.class)
    public JAXBElement<String> createRepairDeleteString(String value) {
        return new JAXBElement<String>(_RepairDeleteString_QNAME, String.class, RepairDelete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = RepairInsert.class)
    public JAXBElement<String> createRepairInsertString(String value) {
        return new JAXBElement<String>(_RepairDeleteString_QNAME, String.class, RepairInsert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = RepairInsertResponse.class)
    public JAXBElement<String> createRepairInsertResponseReturn(String value) {
        return new JAXBElement<String>(_RepairInsertResponseReturn_QNAME, String.class, RepairInsertResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "string", scope = RepairUpdate.class)
    public JAXBElement<String> createRepairUpdateString(String value) {
        return new JAXBElement<String>(_RepairDeleteString_QNAME, String.class, RepairUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = RepairUpdateResponse.class)
    public JAXBElement<String> createRepairUpdateResponseReturn(String value) {
        return new JAXBElement<String>(_RepairInsertResponseReturn_QNAME, String.class, RepairUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = RepairDeleteResponse.class)
    public JAXBElement<String> createRepairDeleteResponseReturn(String value) {
        return new JAXBElement<String>(_RepairInsertResponseReturn_QNAME, String.class, RepairDeleteResponse.class, value);
    }

}
