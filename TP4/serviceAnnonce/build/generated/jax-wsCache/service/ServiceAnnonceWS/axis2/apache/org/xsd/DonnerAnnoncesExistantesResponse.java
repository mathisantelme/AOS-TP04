
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
 *         &lt;element name="ListeAnnonces" type="{http://org.apache.axis2/xsd}TypeListeAnnonces"/>
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
    "listeAnnonces"
})
@XmlRootElement(name = "donnerAnnoncesExistantes_Response")
public class DonnerAnnoncesExistantesResponse {

    @XmlElement(name = "ListeAnnonces", required = true)
    protected TypeListeAnnonces listeAnnonces;

    /**
     * Obtient la valeur de la propriété listeAnnonces.
     * 
     * @return
     *     possible object is
     *     {@link TypeListeAnnonces }
     *     
     */
    public TypeListeAnnonces getListeAnnonces() {
        return listeAnnonces;
    }

    /**
     * Définit la valeur de la propriété listeAnnonces.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeListeAnnonces }
     *     
     */
    public void setListeAnnonces(TypeListeAnnonces value) {
        this.listeAnnonces = value;
    }

}
