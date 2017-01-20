
package com.lance.superheroes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSuperheroDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSuperheroDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="superhero" type="{http://superheroes.lance.com/}Superhero"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSuperheroDetailsResponse", propOrder = {
    "superhero"
})
public class GetSuperheroDetailsResponse {

    @XmlElement(required = true)
    protected Superhero superhero;

    /**
     * Gets the value of the superhero property.
     * 
     * @return
     *     possible object is
     *     {@link Superhero }
     *     
     */
    public Superhero getSuperhero() {
        return superhero;
    }

    /**
     * Sets the value of the superhero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Superhero }
     *     
     */
    public void setSuperhero(Superhero value) {
        this.superhero = value;
    }

}
