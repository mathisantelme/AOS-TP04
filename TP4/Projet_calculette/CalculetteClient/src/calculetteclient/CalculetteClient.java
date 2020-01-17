/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculetteclient;

import exercice.CalculetteWS;
import exercice.CalculetteWS_Service;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 *
 * @author Kevin
 */
public class CalculetteClient {

    /* Fonction appelant la fonction du service Web */
    private static int additionner(int x, int y) {
        exercice.CalculetteWS_Service service = new exercice.CalculetteWS_Service();
        exercice.CalculetteWS port = service.getCalculetteWSPort();
        return port.additionner(x, y);
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        URL wsdlLocation = new URL("http://localhost:1111/Calculette/CalculetteWS?wsdl");
        QName serviceName = new QName("http://exercice/", "CalculetteWS");
        CalculetteWS_Service service = new CalculetteWS_Service(wsdlLocation, serviceName);
        CalculetteWS port = service.getCalculetteWSPort();
        System.out.println("Adition de 5 + -5 = " + CalculetteClient.additionner(5, -5));
        System.out.println("Adition de 5 + 15 = " + CalculetteClient.additionner(5, 15));
    }    
}
