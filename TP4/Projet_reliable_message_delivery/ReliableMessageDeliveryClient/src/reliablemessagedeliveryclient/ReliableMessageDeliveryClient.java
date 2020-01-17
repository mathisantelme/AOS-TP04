/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reliablemessagedeliveryclient;

import exercice.ReliableMessageDeliveryWS;
import exercice.ReliableMessageDeliveryWS_Service;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 *
 * @author Kevin
 */
public class ReliableMessageDeliveryClient {
    
    private static int additionner(int x, int y) {
        exercice.ReliableMessageDeliveryWS_Service service = new exercice.ReliableMessageDeliveryWS_Service();
        exercice.ReliableMessageDeliveryWS port = service.getReliableMessageDeliveryWSPort();
        return port.additionner(x, y);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        URL wsdlLocation = new URL("http://localhost:1111/ReliableMessageDelivery/ReliableMessageDeliveryWS?wsdl");
        QName serviceName = new QName("http://exercice/", "ReliableMessageDeliveryWS");
        ReliableMessageDeliveryWS_Service service = new ReliableMessageDeliveryWS_Service(wsdlLocation, serviceName);
        ReliableMessageDeliveryWS port = service.getReliableMessageDeliveryWSPort();
        System.out.println("Adition de 5 + -5 = " + ReliableMessageDeliveryClient.additionner(5, -5));
        System.out.println("Adition de 5 + 15 = " + ReliableMessageDeliveryClient.additionner(5, 15));
    }   
}
