package cz.kramolis.mega.examples.helloworld;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import cz.kramolis.mega.runtime.Context;

@ApplicationScoped
public class HelloWorldApp implements Context {

    private void onContextAvailable(@Observes Context context) {
        System.out.println("Hello World!");
        //TODO accept command line arguments
    }

}
