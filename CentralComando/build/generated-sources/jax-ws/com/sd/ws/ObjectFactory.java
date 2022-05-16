
package com.sd.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sd.ws package. 
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

    private final static QName _InserirDados_QNAME = new QName("http://ws.sd.com/", "inserirDados");
    private final static QName _InserirDadosResponse_QNAME = new QName("http://ws.sd.com/", "inserirDadosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sd.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InserirDados }
     * 
     */
    public InserirDados createInserirDados() {
        return new InserirDados();
    }

    /**
     * Create an instance of {@link InserirDadosResponse }
     * 
     */
    public InserirDadosResponse createInserirDadosResponse() {
        return new InserirDadosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirDados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sd.com/", name = "inserirDados")
    public JAXBElement<InserirDados> createInserirDados(InserirDados value) {
        return new JAXBElement<InserirDados>(_InserirDados_QNAME, InserirDados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirDadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sd.com/", name = "inserirDadosResponse")
    public JAXBElement<InserirDadosResponse> createInserirDadosResponse(InserirDadosResponse value) {
        return new JAXBElement<InserirDadosResponse>(_InserirDadosResponse_QNAME, InserirDadosResponse.class, null, value);
    }

}
