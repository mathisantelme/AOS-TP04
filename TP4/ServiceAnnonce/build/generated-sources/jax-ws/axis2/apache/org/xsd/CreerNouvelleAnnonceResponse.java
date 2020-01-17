
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
 *         &lt;element name="nouvelleAnnonce_Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "nouvelleAnnonceId"
})
@XmlRootElement(name = "creerNouvelleAnnonce_Response")
public class CreerNouvelleAnnonceResponse {

    @XmlElement(name = "nouvelleAnnonce_Id")
    protected int nouvelleAnnonceId;

    /**
     * Obtient la valeur de la propriété nouvelleAnnonceId.
     * 
     */
    public int getNouvelleAnnonceId() {
        return nouvelleAnnonceId;
    }

    /**
     * Définit la valeur de la propriété nouvelleAnnonceId.
     * 
     */
    public void setNouvelleAnnonceId(int value) {
        this.nouvelleAnnonceId = value;
    }

}
