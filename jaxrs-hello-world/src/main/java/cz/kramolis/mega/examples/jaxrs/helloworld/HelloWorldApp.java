package cz.kramolis.mega.examples.jaxrs.helloworld;

import cz.kramolis.mega.jaxrs.BeforeJaxRsStart;
import cz.kramolis.mega.runtime.Context;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class HelloWorldApp implements Context {

    @Inject
    private Logger logger;

    @Inject
    private HelloWorldJaxRsApplication helloWorldJaxRsApplication;

    @Inject
    private HelloWorldConfig config;

    private void onBeforeJaxRsRegister(@Observes BeforeJaxRsStart beforeJaxRsStart) {
        logger.info("Configure JaxRs Application: " + config.getGreeting() + " " + config.getName() + "!");
        beforeJaxRsStart.registerApplication(helloWorldJaxRsApplication, null);
    }

}
