
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
 *         &lt;element name="validation_OK" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "validationOK"
})
@XmlRootElement(name = "editerAnnonceExistante_Response")
public class EditerAnnonceExistanteResponse {

    @XmlElement(name = "validation_OK")
    protected boolean validationOK;

    /**
     * Obtient la valeur de la propriété validationOK.
     * 
     */
    public boolean isValidationOK() {
        return validationOK;
    }

    /**
     * Définit la valeur de la propriété validationOK.
     * 
     */
    public void setValidationOK(boolean value) {
        this.validationOK = value;
    }

}
