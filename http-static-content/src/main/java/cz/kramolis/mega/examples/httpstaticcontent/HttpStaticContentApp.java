package cz.kramolis.mega.examples.httpstaticcontent;

import cz.kramolis.mega.grizzly.BeforeHttpServerStart;
import cz.kramolis.mega.runtime.Context;
import cz.kramolis.mega.runtime.Environment;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.apache.deltaspike.core.api.projectstage.ProjectStage;

@ApplicationScoped
public class HttpStaticContentApp implements Context {

    @Inject
    private Logger logger;

    private void onEnvironmentAvailable(@Observes Environment environment, ProjectStage projectStage) {
        logger.info("Project stage: " + projectStage);
    }

    private void onHttpServerAvailable(@Observes BeforeHttpServerStart beforeHttpServerStart) {
        logger.info("Configure Grizzly HTTP server.");
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Current HTTP server instance: " + beforeHttpServerStart.getHttpServer());
        }

        beforeHttpServerStart.registerStaticContentHttpHandler("/META-INF/web/", "");
    }

}
