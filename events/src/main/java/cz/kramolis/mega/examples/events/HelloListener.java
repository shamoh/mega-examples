package cz.kramolis.mega.examples.events;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.ObservesAsync;
import javax.inject.Inject;

@ApplicationScoped
public class HelloListener {

    @Inject
    private Logger logger;

    public void listenToSyncHello(@Observes HelloEvent helloEvent) {
        logger.info("SYNC HelloEvent: " + helloEvent.getMessage());
    }

    public void listenToAsyncHello(@ObservesAsync HelloEvent helloEvent) {
        logger.info("ASYNC HelloEvent: " + helloEvent.getMessage());
    }

}
