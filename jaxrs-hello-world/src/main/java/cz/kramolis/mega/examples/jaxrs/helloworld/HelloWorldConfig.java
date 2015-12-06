package cz.kramolis.mega.examples.jaxrs.helloworld;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.apache.deltaspike.core.api.config.ConfigProperty;

@ApplicationScoped
public class HelloWorldConfig {

    @Inject
    @ConfigProperty(name = "hello.greeting")
    private String greeting;

    @Inject
    @ConfigProperty(name = "hello.name")
    private String name;

    public String getGreeting() {
        return greeting;
    }

    public String getName() {
        return name;
    }

}
