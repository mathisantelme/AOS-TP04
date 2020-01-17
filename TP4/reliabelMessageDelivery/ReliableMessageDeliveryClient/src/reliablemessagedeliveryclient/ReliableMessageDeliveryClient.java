package reliablemessagedeliveryclient;

import exercice.ReliableMessageDeliveryWS;
import exercice.ReliableMessageDeliveryWS_Service;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

public class ReliableMessageDeliveryClient {
    
    private static int additionner(int x, int y) {
        exercice.ReliableMessageDeliveryWS_Service service = new exercice.ReliableMessageDeliveryWS_Service();
        exercice.ReliableMessageDeliveryWS port = service.getReliableMessageDeliveryWSPort();
        return port.additionner(x, y);
    }

    public static void main(String[] args) throws MalformedURLException {
        URL wsdlLocation = new URL("http://localhost:1111/ReliableMessageDelivery/ReliableMessageDeliveryWS?wsdl");
        QName serviceName = new QName("http://exercice/", "ReliableMessageDeliveryWS");
        ReliableMessageDeliveryWS_Service service = new ReliableMessageDeliveryWS_Service(wsdlLocation, serviceName);
        ReliableMessageDeliveryWS port = service.getReliableMessageDeliveryWSPort();
        System.out.println("Adition de 5 + -5 = " + ReliableMessageDeliveryClient.additionner(5, -5));
        System.out.println("Adition de 5 + 15 = " + ReliableMessageDeliveryClient.additionner(5, 15));
    }   
}
