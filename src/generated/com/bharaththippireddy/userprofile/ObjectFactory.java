
package com.bharaththippireddy.userprofile;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bharaththippireddy.userprofile package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bharaththippireddy.userprofile
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertFeetToYardsResponse }
     * 
     */
    public ConvertFeetToYardsResponse createConvertFeetToYardsResponse() {
        return new ConvertFeetToYardsResponse();
    }

    /**
     * Create an instance of {@link ConvertFeetToYardsRequest }
     * 
     */
    public ConvertFeetToYardsRequest createConvertFeetToYardsRequest() {
        return new ConvertFeetToYardsRequest();
    }

    /**
     * Create an instance of {@link GetUserProfile }
     * 
     */
    public GetUserProfile createGetUserProfile() {
        return new GetUserProfile();
    }

    /**
     * Create an instance of {@link GetUserProfileResponse }
     * 
     */
    public GetUserProfileResponse createGetUserProfileResponse() {
        return new GetUserProfileResponse();
    }

}
