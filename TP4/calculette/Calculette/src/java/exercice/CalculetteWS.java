package exercice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@SOAPBinding(style=Style.RPC)
@WebService(serviceName = "CalculetteWS")
public class CalculetteWS {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "additionner")
    public int additionner(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        return x+y;
    }
}
