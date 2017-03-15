
package it.lutech.servizio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operazioneFault" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operazioneFault"
})
@XmlRootElement(name = "operazioneFault")
public class OperazioneFault {

    @XmlElement(required = true)
    protected String operazioneFault;

    /**
     * Recupera il valore della proprietà operazioneFault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperazioneFault() {
        return operazioneFault;
    }

    /**
     * Imposta il valore della proprietà operazioneFault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperazioneFault(String value) {
        this.operazioneFault = value;
    }

}
