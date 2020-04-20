package com.redhat.edw;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *     com.redhat.edw.HelloRouteHandler
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 20 Apr 2020 18:12
 */
@Slf4j
@Component("helloRouteHandler")
public class HelloRouteHandler {

    @Value("${name}")
    private String name;

    @Async
    public HelloResponse setHelloWithName() throws Exception {

        /*
         * simulate a very long process (10second)
         */
        Thread.sleep(10000);

        /*
         * this process will still getting called after 10 second regardless of sync or async
         */
        log.info("calling hello for "+name);

        return HelloResponse.builder().content(name).build();
    }
}
