
package org.apache.ws.axis2;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import axis2.apache.org.xsd.CreerNouvelleAnnonceRequest;
import axis2.apache.org.xsd.CreerNouvelleAnnonceResponse;
import axis2.apache.org.xsd.DonnerAnnoncesExistantesRequest;
import axis2.apache.org.xsd.DonnerAnnoncesExistantesResponse;
import axis2.apache.org.xsd.EditerAnnonceExistanteRequest;
import axis2.apache.org.xsd.EditerAnnonceExistanteResponse;
import axis2.apache.org.xsd.FixerDateParutionRequest;
import axis2.apache.org.xsd.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceAnnonce_PortType", targetNamespace = "http://ws.apache.org/axis2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceAnnoncePortType {


    /**
     * 
     * @param part1
     * @return
     *     returns axis2.apache.org.xsd.CreerNouvelleAnnonceResponse
     */
    @WebMethod(action = "creerNouvelleAnnonce")
    @WebResult(name = "creerNouvelleAnnonce_Response", targetNamespace = "http://org.apache.axis2/xsd", partName = "part1")
    public CreerNouvelleAnnonceResponse creerNouvelleAnnonce(
        @WebParam(name = "creerNouvelleAnnonce_Request", targetNamespace = "http://org.apache.axis2/xsd", partName = "part1")
        CreerNouvelleAnnonceRequest part1);

    /**
     * 
     * @param part1
     * @return
     *     returns axis2.apache.org.xsd.EditerAnnonceExistanteResponse
     */
    @WebMethod(action = "editerAnnonceExistante")
    @WebResult(name = "editerAnnonceExistante_Response", targetNamespace = "http://org.apache.axis2/xsd", partName = "part1")
    public EditerAnnonceExistanteResponse editerAnnonceExistante(
        @WebParam(name = "editerAnnonceExistante_Request", targetNamespace = "http://org.apache.axis2/xsd", partName = "part1")
        EditerAnnonceExistanteRequest part1);

    /**
     * 
     * @param part1
     * @return
     *     returns axis2.apache.org.xsd.DonnerAnnoncesExistantesResponse
     */
    @WebMethod(action = "donnerAnnoncesExistantes")
    @WebResult(name = "donnerAnnoncesExistantes_Response", targetNamespace = "http://org.apache.axis2/xsd", partName = "part1")
    public DonnerAnnoncesExistantesResponse donnerAnnoncesExistantes(
        @WebParam(name = "donnerAnnoncesExistantes_Request", targetNamespace = "http://org.apache.axis2/xsd", partName = "part1")
        DonnerAnnoncesExistantesRequest part1);

    /**
     * 
     * @param part1
     */
    @WebMethod(action = "fixerDateParution")
    @Oneway
    public void fixerDateParution(
        @WebParam(name = "fixerDateParution_Request", targetNamespace = "http://org.apache.axis2/xsd", partName = "part1")
        FixerDateParutionRequest part1);

}
