package cz.kramolis.mega.examples.jaxrs.helloworld;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Application;

//TODO support @ApplicationPath
@ApplicationScoped
public class HelloWorldJaxRsApplication extends Application {

    private final Set<Class<?>> classes;

    public HelloWorldJaxRsApplication() {
        final HashSet<Class<?>> c = new HashSet<>();
        c.add(HelloWorldResource.class);
        classes = Collections.unmodifiableSet(c);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }

}
