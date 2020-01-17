package calculetteclient;

import exercice.CalculetteWS;
import exercice.CalculetteWS_Service;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

public class CalculetteClient {

    private static int additionner(int x, int y) {
        exercice.CalculetteWS_Service service = new exercice.CalculetteWS_Service();
        exercice.CalculetteWS port = service.getCalculetteWSPort();
        return port.additionner(x, y);
    }
    
    public static void main(String[] args) throws MalformedURLException {
        URL wsdlLocation = new URL("http://localhost:1111/Calculette/CalculetteWS?wsdl");
        QName serviceName = new QName("http://exercice/", "CalculetteWS");
        CalculetteWS_Service service = new CalculetteWS_Service(wsdlLocation, serviceName);
        CalculetteWS port = service.getCalculetteWSPort();
        System.out.println("Adition de 5 + -5 = " + CalculetteClient.additionner(5, -5));
        System.out.println("Adition de 5 + 15 = " + CalculetteClient.additionner(5, 15));
    }    
}
