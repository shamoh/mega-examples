package cz.kramolis.mega.examples.helloworld;

import java.util.Date;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import cz.kramolis.mega.runtime.Context;
import cz.kramolis.mega.runtime.Environment;

@ApplicationScoped
public class HelloWorldApp implements Context {

    private void onContextAvailable(@Observes Context context, Environment environment) {
        System.out.println("Hello World! " + (new Date()));

        //TODO accept command line arguments
        environment.shutdown();
    }

}
