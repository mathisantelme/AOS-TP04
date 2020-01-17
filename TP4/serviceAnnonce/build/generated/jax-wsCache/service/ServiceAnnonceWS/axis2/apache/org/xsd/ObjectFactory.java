
package axis2.apache.org.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the axis2.apache.org.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListeAnnonces_QNAME = new QName("http://org.apache.axis2/xsd", "ListeAnnonces");
    private final static QName _Annonce_QNAME = new QName("http://org.apache.axis2/xsd", "Annonce");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: axis2.apache.org.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreerNouvelleAnnonceRequest }
     * 
     */
    public CreerNouvelleAnnonceRequest createCreerNouvelleAnnonceRequest() {
        return new CreerNouvelleAnnonceRequest();
    }

    /**
     * Create an instance of {@link DonnerAnnoncesExistantesResponse }
     * 
     */
    public DonnerAnnoncesExistantesResponse createDonnerAnnoncesExistantesResponse() {
        return new DonnerAnnoncesExistantesResponse();
    }

    /**
     * Create an instance of {@link TypeListeAnnonces }
     * 
     */
    public TypeListeAnnonces createTypeListeAnnonces() {
        return new TypeListeAnnonces();
    }

    /**
     * Create an instance of {@link FixerDateParutionRequest }
     * 
     */
    public FixerDateParutionRequest createFixerDateParutionRequest() {
        return new FixerDateParutionRequest();
    }

    /**
     * Create an instance of {@link EditerAnnonceExistanteRequest }
     * 
     */
    public EditerAnnonceExistanteRequest createEditerAnnonceExistanteRequest() {
        return new EditerAnnonceExistanteRequest();
    }

    /**
     * Create an instance of {@link TypeAnnonce }
     * 
     */
    public TypeAnnonce createTypeAnnonce() {
        return new TypeAnnonce();
    }

    /**
     * Create an instance of {@link EditerAnnonceExistanteResponse }
     * 
     */
    public EditerAnnonceExistanteResponse createEditerAnnonceExistanteResponse() {
        return new EditerAnnonceExistanteResponse();
    }

    /**
     * Create an instance of {@link DonnerAnnoncesExistantesRequest }
     * 
     */
    public DonnerAnnoncesExistantesRequest createDonnerAnnoncesExistantesRequest() {
        return new DonnerAnnoncesExistantesRequest();
    }

    /**
     * Create an instance of {@link CreerNouvelleAnnonceResponse }
     * 
     */
    public CreerNouvelleAnnonceResponse createCreerNouvelleAnnonceResponse() {
        return new CreerNouvelleAnnonceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeListeAnnonces }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "ListeAnnonces")
    public JAXBElement<TypeListeAnnonces> createListeAnnonces(TypeListeAnnonces value) {
        return new JAXBElement<TypeListeAnnonces>(_ListeAnnonces_QNAME, TypeListeAnnonces.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeAnnonce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.apache.axis2/xsd", name = "Annonce")
    public JAXBElement<TypeAnnonce> createAnnonce(TypeAnnonce value) {
        return new JAXBElement<TypeAnnonce>(_Annonce_QNAME, TypeAnnonce.class, null, value);
    }

}
