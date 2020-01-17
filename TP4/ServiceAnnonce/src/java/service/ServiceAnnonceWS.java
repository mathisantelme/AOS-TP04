/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;

/**
 *
 * @author Kevin
 */
@WebService(serviceName = "ServiceAnnonce", portName = "ServiceAnnonce_Port", endpointInterface = "org.apache.ws.axis2.ServiceAnnoncePortType", targetNamespace = "http://ws.apache.org/axis2", wsdlLocation = "WEB-INF/wsdl/ServiceAnnonceWS/serviceAnnonce.wsdl")
public class ServiceAnnonceWS {

    public axis2.apache.org.xsd.CreerNouvelleAnnonceResponse creerNouvelleAnnonce(axis2.apache.org.xsd.CreerNouvelleAnnonceRequest part1) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public axis2.apache.org.xsd.EditerAnnonceExistanteResponse editerAnnonceExistante(axis2.apache.org.xsd.EditerAnnonceExistanteRequest part1) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public axis2.apache.org.xsd.DonnerAnnoncesExistantesResponse donnerAnnoncesExistantes(axis2.apache.org.xsd.DonnerAnnoncesExistantesRequest part1) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void fixerDateParution(axis2.apache.org.xsd.FixerDateParutionRequest part1) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
