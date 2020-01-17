
package axis2.apache.org.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Annonce" type="{http://org.apache.axis2/xsd}TypeAnnonce"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "annonce"
})
@XmlRootElement(name = "editerAnnonceExistante_Request")
public class EditerAnnonceExistanteRequest {

    @XmlElement(name = "Annonce", required = true)
    protected TypeAnnonce annonce;

    /**
     * Obtient la valeur de la propriété annonce.
     * 
     * @return
     *     possible object is
     *     {@link TypeAnnonce }
     *     
     */
    public TypeAnnonce getAnnonce() {
        return annonce;
    }

    /**
     * Définit la valeur de la propriété annonce.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAnnonce }
     *     
     */
    public void setAnnonce(TypeAnnonce value) {
        this.annonce = value;
    }

}
