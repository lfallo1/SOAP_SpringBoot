package com.lance.wsdlfirst;

import javax.xml.namespace.QName;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.ImportResource;

import com.ctc.wstx.compat.QNameCreator;
import com.lance.wsdlfirst.services.CustomersOrdersWSImpl;
import com.lance.wsdlfirst.services.UserProfileServiceImpl;

@Configuration
@ImportResource({ "classpath:META-INF/cxf/cxf.xml" })
public class EndpointConfiguration {

	@Autowired
    private ApplicationContext applicationContext;
	
	// services will be available at hostname:post/services
    @Bean
    public ServletRegistrationBean servletRegistrationBean(ApplicationContext context) {
        return new ServletRegistrationBean(new CXFServlet(), "/services/*");
    }
	
    // configure individual services
    
    @DependsOn("servletRegistrationBean")
    @Bean
    public EndpointImpl customerOrdersService() {
        Bus bus = (Bus) applicationContext.getBean(Bus.DEFAULT_BUS_ID);
        EndpointImpl endpoint = new EndpointImpl(bus, new CustomersOrdersWSImpl());
        QName serviceName = QNameCreator.create("http://customerorders.services.lance.com/", "CustomerOrdersService", "");
        endpoint.setServiceName(serviceName);
        endpoint.setWsdlLocation("wsdl/CustomerOrders.wsdl");
        endpoint.publish("/CustomerOrders");
        return endpoint;
    }
    
    @DependsOn("servletRegistrationBean")
    @Bean
    public EndpointImpl userService() {
        Bus bus = (Bus) applicationContext.getBean(Bus.DEFAULT_BUS_ID);
        EndpointImpl endpoint = new EndpointImpl(bus, new UserProfileServiceImpl());
        QName serviceName = QNameCreator.create("http://bharaththippireddy.com/userProfile", "UserProfileService", "");
        endpoint.setServiceName(serviceName);
        endpoint.setWsdlLocation("wsdl/UserProfile.wsdl");
        endpoint.publish("/UserProfileService");
        return endpoint;
    }
	
}
