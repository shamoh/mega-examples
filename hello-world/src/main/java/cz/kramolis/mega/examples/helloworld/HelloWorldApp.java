package cz.kramolis.mega.examples.helloworld;

import cz.kramolis.mega.runtime.Context;
import cz.kramolis.mega.runtime.Environment;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class HelloWorldApp implements Context {

    private void onEnvironmentAvailable(@Observes Environment environment) {
        if (environment.getArgs().size() > 0) {
            for (String name : environment.getArgs()) {
                System.out.println("Hello " + name + "!");
            }
        } else {
            System.out.println("Hello World!");
        }
        environment.shutdown();
    }

}
