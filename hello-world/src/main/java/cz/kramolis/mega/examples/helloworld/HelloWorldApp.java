package cz.kramolis.mega.examples.helloworld;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import cz.kramolis.mega.runtime.Context;
import cz.kramolis.mega.runtime.Environment;

@ApplicationScoped
public class HelloWorldApp implements Context {

    private void onEnvironmentAvailable(@Observes Environment environment) {
        //TODO access command line arguments
        System.out.println("Hello World!");

        environment.shutdown();
    }

}
