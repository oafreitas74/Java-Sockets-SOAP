
package com.sd.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inserirDados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inserirDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeEscuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCeluda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirDados", propOrder = {
    "tipo",
    "nomeEscuta",
    "nomeCeluda",
    "dados"
})
public class InserirDados {

    protected String tipo;
    protected String nomeEscuta;
    protected String nomeCeluda;
    protected String dados;

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the nomeEscuta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEscuta() {
        return nomeEscuta;
    }

    /**
     * Sets the value of the nomeEscuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEscuta(String value) {
        this.nomeEscuta = value;
    }

    /**
     * Gets the value of the nomeCeluda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCeluda() {
        return nomeCeluda;
    }

    /**
     * Sets the value of the nomeCeluda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCeluda(String value) {
        this.nomeCeluda = value;
    }

    /**
     * Gets the value of the dados property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDados() {
        return dados;
    }

    /**
     * Sets the value of the dados property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDados(String value) {
        this.dados = value;
    }

}
