
package axis2.apache.org.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TypeListeAnnonces complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TypeListeAnnonces">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Annonce" type="{http://org.apache.axis2/xsd}TypeAnnonce" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeListeAnnonces", propOrder = {
    "annonce"
})
public class TypeListeAnnonces {

    @XmlElement(name = "Annonce")
    protected List<TypeAnnonce> annonce;

    /**
     * Gets the value of the annonce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annonce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnonce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAnnonce }
     * 
     * 
     */
    public List<TypeAnnonce> getAnnonce() {
        if (annonce == null) {
            annonce = new ArrayList<TypeAnnonce>();
        }
        return this.annonce;
    }

}
