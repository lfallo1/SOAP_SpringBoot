
package com.lance.superheroes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allSuperheroDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allSuperheroDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="superhero" type="{http://superheroes.lance.com/}Superhero" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allSuperheroDetailsResponse", propOrder = {
    "superhero"
})
public class AllSuperheroDetailsResponse {

    @XmlElement(required = true)
    protected List<Superhero> superhero;

    /**
     * Gets the value of the superhero property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superhero property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperhero().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Superhero }
     * 
     * 
     */
    public List<Superhero> getSuperhero() {
        if (superhero == null) {
            superhero = new ArrayList<Superhero>();
        }
        return this.superhero;
    }

}
