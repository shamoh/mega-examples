package cz.kramolis.mega.examples.jaxrs.helloworld;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class HelloWorldResource {

    @Inject
    private HelloWorldConfig config;

    public static String formatMessage(final String greeting, final String name) {
        return greeting + " " + name + "!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return formatMessage(config.getGreeting(), config.getName());
    }

    //
    // utils
    //

    @Path("/{name}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello(@PathParam("name") String name) {
        if (name == null) {
            name = config.getName();
        }
        return formatMessage(config.getGreeting(), name);
    }

}
