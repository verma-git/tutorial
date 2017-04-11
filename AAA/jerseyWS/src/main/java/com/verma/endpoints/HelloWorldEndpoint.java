package com.verma.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.verma.beansJaxB.MyJaxBean;

@Component
@Path("/hello")
public class HelloWorldEndpoint {
    @GET
    @Path("/world")
    @Produces("application/xml")
    public MyJaxBean getMyFriendsList() {
        return new MyJaxBean("JUGAL", 34);
    }
}
