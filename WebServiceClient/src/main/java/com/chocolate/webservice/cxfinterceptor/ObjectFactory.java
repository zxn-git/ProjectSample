
package com.chocolate.webservice.cxfinterceptor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chocolate.webservice.cxfinterceptor package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _AddStudent_QNAME = new QName("http://cxfinterceptor.webservice.chocolate.com/", "addStudent");
    private final static QName _AddStudentResponse_QNAME = new QName("http://cxfinterceptor.webservice.chocolate.com/", "addStudentResponse");
    private final static QName _GetAllStudent_QNAME = new QName("http://cxfinterceptor.webservice.chocolate.com/", "getAllStudent");
    private final static QName _GetAllStudentResponse_QNAME = new QName("http://cxfinterceptor.webservice.chocolate.com/", "getAllStudentResponse");
    private final static QName _GetStudent_QNAME = new QName("http://cxfinterceptor.webservice.chocolate.com/", "getStudent");
    private final static QName _GetStudentResponse_QNAME = new QName("http://cxfinterceptor.webservice.chocolate.com/", "getStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chocolate.webservice.cxfinterceptor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link GetAllStudent }
     * 
     */
    public GetAllStudent createGetAllStudent() {
        return new GetAllStudent();
    }

    /**
     * Create an instance of {@link GetAllStudentResponse }
     * 
     */
    public GetAllStudentResponse createGetAllStudentResponse() {
        return new GetAllStudentResponse();
    }

    /**
     * Create an instance of {@link GetStudent }
     * 
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxfinterceptor.webservice.chocolate.com/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxfinterceptor.webservice.chocolate.com/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxfinterceptor.webservice.chocolate.com/", name = "getAllStudent")
    public JAXBElement<GetAllStudent> createGetAllStudent(GetAllStudent value) {
        return new JAXBElement<GetAllStudent>(_GetAllStudent_QNAME, GetAllStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxfinterceptor.webservice.chocolate.com/", name = "getAllStudentResponse")
    public JAXBElement<GetAllStudentResponse> createGetAllStudentResponse(GetAllStudentResponse value) {
        return new JAXBElement<GetAllStudentResponse>(_GetAllStudentResponse_QNAME, GetAllStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxfinterceptor.webservice.chocolate.com/", name = "getStudent")
    public JAXBElement<GetStudent> createGetStudent(GetStudent value) {
        return new JAXBElement<GetStudent>(_GetStudent_QNAME, GetStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxfinterceptor.webservice.chocolate.com/", name = "getStudentResponse")
    public JAXBElement<GetStudentResponse> createGetStudentResponse(GetStudentResponse value) {
        return new JAXBElement<GetStudentResponse>(_GetStudentResponse_QNAME, GetStudentResponse.class, null, value);
    }

}
