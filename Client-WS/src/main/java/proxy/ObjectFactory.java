
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ConversioneutotoDh_QNAME = new QName("http://WS/", "conversioneutotoDh");
    private static final QName _ConversioneutotoDhResponse_QNAME = new QName("http://WS/", "conversioneutotoDhResponse");
    private static final QName _Getcompte_QNAME = new QName("http://WS/", "getcompte");
    private static final QName _GetcompteResponse_QNAME = new QName("http://WS/", "getcompteResponse");
    private static final QName _Listcompte_QNAME = new QName("http://WS/", "listcompte");
    private static final QName _ListcompteResponse_QNAME = new QName("http://WS/", "listcompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversioneutotoDh }
     * 
     * @return
     *     the new instance of {@link ConversioneutotoDh }
     */
    public ConversioneutotoDh createConversioneutotoDh() {
        return new ConversioneutotoDh();
    }

    /**
     * Create an instance of {@link ConversioneutotoDhResponse }
     * 
     * @return
     *     the new instance of {@link ConversioneutotoDhResponse }
     */
    public ConversioneutotoDhResponse createConversioneutotoDhResponse() {
        return new ConversioneutotoDhResponse();
    }

    /**
     * Create an instance of {@link Getcompte }
     * 
     * @return
     *     the new instance of {@link Getcompte }
     */
    public Getcompte createGetcompte() {
        return new Getcompte();
    }

    /**
     * Create an instance of {@link GetcompteResponse }
     * 
     * @return
     *     the new instance of {@link GetcompteResponse }
     */
    public GetcompteResponse createGetcompteResponse() {
        return new GetcompteResponse();
    }

    /**
     * Create an instance of {@link Listcompte }
     * 
     * @return
     *     the new instance of {@link Listcompte }
     */
    public Listcompte createListcompte() {
        return new Listcompte();
    }

    /**
     * Create an instance of {@link ListcompteResponse }
     * 
     * @return
     *     the new instance of {@link ListcompteResponse }
     */
    public ListcompteResponse createListcompteResponse() {
        return new ListcompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversioneutotoDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversioneutotoDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "conversioneutotoDh")
    public JAXBElement<ConversioneutotoDh> createConversioneutotoDh(ConversioneutotoDh value) {
        return new JAXBElement<>(_ConversioneutotoDh_QNAME, ConversioneutotoDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversioneutotoDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversioneutotoDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "conversioneutotoDhResponse")
    public JAXBElement<ConversioneutotoDhResponse> createConversioneutotoDhResponse(ConversioneutotoDhResponse value) {
        return new JAXBElement<>(_ConversioneutotoDhResponse_QNAME, ConversioneutotoDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getcompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Getcompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getcompte")
    public JAXBElement<Getcompte> createGetcompte(Getcompte value) {
        return new JAXBElement<>(_Getcompte_QNAME, Getcompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetcompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetcompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getcompteResponse")
    public JAXBElement<GetcompteResponse> createGetcompteResponse(GetcompteResponse value) {
        return new JAXBElement<>(_GetcompteResponse_QNAME, GetcompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listcompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listcompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listcompte")
    public JAXBElement<Listcompte> createListcompte(Listcompte value) {
        return new JAXBElement<>(_Listcompte_QNAME, Listcompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListcompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListcompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listcompteResponse")
    public JAXBElement<ListcompteResponse> createListcompteResponse(ListcompteResponse value) {
        return new JAXBElement<>(_ListcompteResponse_QNAME, ListcompteResponse.class, null, value);
    }

}
