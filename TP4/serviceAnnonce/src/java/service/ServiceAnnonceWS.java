package service;

import javax.jws.WebService;

@WebService(serviceName = "ServiceAnnonce", portName = "ServiceAnnonce_Port", endpointInterface = "org.apache.ws.axis2.ServiceAnnoncePortType", targetNamespace = "http://ws.apache.org/axis2", wsdlLocation = "WEB-INF/wsdl/ServiceAnnonceWS/serviceAnnonce.wsdl")
public class ServiceAnnonceWS {

    public axis2.apache.org.xsd.CreerNouvelleAnnonceResponse creerNouvelleAnnonce(axis2.apache.org.xsd.CreerNouvelleAnnonceRequest part1) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public axis2.apache.org.xsd.EditerAnnonceExistanteResponse editerAnnonceExistante(axis2.apache.org.xsd.EditerAnnonceExistanteRequest part1) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public axis2.apache.org.xsd.DonnerAnnoncesExistantesResponse donnerAnnoncesExistantes(axis2.apache.org.xsd.DonnerAnnoncesExistantesRequest part1) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void fixerDateParution(axis2.apache.org.xsd.FixerDateParutionRequest part1) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
