package cz.kramolis.mega.examples.events;

import cz.kramolis.mega.runtime.Context;
import cz.kramolis.mega.runtime.Environment;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.EventMetadata;
import javax.inject.Inject;

@ApplicationScoped
public class EventsApp implements Context {

    @Inject
    private Logger logger;

    @Inject
    private Event<HelloEvent> events;

    private void onEnvironmentAvailable(@Observes Environment environment) {
        events.fire(new HelloEvent("SYNC from bean " + System.currentTimeMillis()));
        events.fireAsync(new HelloEvent("ASYNC from bean " + System.currentTimeMillis()));

        environment.shutdown();
    }

    public void processPayload(@Observes Object event, EventMetadata meta) {
        logger.info("processPayload (" + meta + ") : [" + event.getClass() + "] " + event);
    }

}
