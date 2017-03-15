package it.lutech.servizio;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-03-15T15:24:34.588+01:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "servizio", 
                  wsdlLocation = "classpath:wsdl/servizio.wsdl",
                  targetNamespace = "http://lutech.it/servizio/") 
public class Servizio_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://lutech.it/servizio/", "servizio");
    public final static QName ServizioSOAP = new QName("http://lutech.it/servizio/", "servizioSOAP");
    static {
        URL url = Servizio_Service.class.getClassLoader().getResource("wsdl/servizio.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(Servizio_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/servizio.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public Servizio_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Servizio_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Servizio_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Servizio_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Servizio_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Servizio_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Servizio
     */
    @WebEndpoint(name = "servizioSOAP")
    public Servizio getServizioSOAP() {
        return super.getPort(ServizioSOAP, Servizio.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Servizio
     */
    @WebEndpoint(name = "servizioSOAP")
    public Servizio getServizioSOAP(WebServiceFeature... features) {
        return super.getPort(ServizioSOAP, Servizio.class, features);
    }

}
