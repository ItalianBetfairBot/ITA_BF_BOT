package com.application.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.apache.coyote.ajp.AbstractAjpProtocol;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class ITA_BF_BOTApplication {

	public static void main(String[] args) {
  //      TomcatURLStreamHandlerFactory.disable();
		SpringApplication.run(ITA_BF_BOTApplication.class, args);
    
	}

	@Bean
    public TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        Connector ajpConnector = new Connector("AJP/1.3");
        ajpConnector.setPort(9090);
        ajpConnector.setSecure(false);
        ajpConnector.setAllowTrace(false);
        ajpConnector.setScheme("http");
       ((AbstractAjpProtocol<?>)ajpConnector.getProtocolHandler()).setSecretRequired(false);
    tomcat.addAdditionalTomcatConnectors(ajpConnector);
    return tomcat;
    }

}
