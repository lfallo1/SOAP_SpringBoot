package com.lance.wsdlfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 	<jaxws:endpoint id="customerOrdersWs" address="/customerOrders" 
	wsdlLocation="WEB-INF/wsdl/CustomerOrders.wsdl"
	implementor="com.lance.wsdlfirst.impl.CustomersOrdersWSImpl"
	xmlns:customerOrders="http://customerorders.services.lance.com/"
	serviceName="customerOrders:CustomerOrdersService">
</jaxws:endpoint>

<cxf:bus>
	<cxf:features>
		<cxf:logging />
	</cxf:features>
</cxf:bus>
 */

@SpringBootApplication
public class WsdlfirstDemoApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(WsdlfirstDemoApplication.class, args);
	}
 
    // Used when deploying to a standalone servlet container, i.e. tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WsdlfirstDemoApplication.class);
    }
}
