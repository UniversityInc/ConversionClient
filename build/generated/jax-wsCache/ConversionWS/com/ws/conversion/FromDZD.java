
package com.ws.conversion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FromDZD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FromDZD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="devise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromDZD", propOrder = {
    "montant",
    "devise"
})
public class FromDZD {

    protected float montant;
    protected String devise;

    /**
     * Gets the value of the montant property.
     * 
     */
    public float getMontant() {
        return montant;
    }

    /**
     * Sets the value of the montant property.
     * 
     */
    public void setMontant(float value) {
        this.montant = value;
    }

    /**
     * Gets the value of the devise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevise() {
        return devise;
    }

    /**
     * Sets the value of the devise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevise(String value) {
        this.devise = value;
    }

}
