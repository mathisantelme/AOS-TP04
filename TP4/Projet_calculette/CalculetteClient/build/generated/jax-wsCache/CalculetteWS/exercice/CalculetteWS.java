
package exercice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculetteWS", targetNamespace = "http://exercice/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculetteWS {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String hello(
        @WebParam(name = "name", partName = "name")
        String name);

    /**
     * 
     * @param x
     * @param y
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    public int additionner(
        @WebParam(name = "x", partName = "x")
        int x,
        @WebParam(name = "y", partName = "y")
        int y);

}
