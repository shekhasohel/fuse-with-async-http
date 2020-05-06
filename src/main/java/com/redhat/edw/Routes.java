package com.redhat.edw;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *     com.redhat.edw.Routes
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 20 Apr 2020 17:43
 */
@Component
public class Routes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration("servlet")
                .bindingMode(RestBindingMode.json)
        ;

        rest()
                .get("hello")
                .route()
                .setBody(method("helloRouteHandler", "setHelloWithName"))
                .endRest()
                .get("something")
                .route()
                .setBody().body(()->new HelloResponse("Hello World!"))
                .endRest()
        ;
    }
}
