package cz.kramolis.mega.examples.httpstaticcontent;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import cz.kramolis.mega.grizzly.GrizzlyHttpServerUtils;
import cz.kramolis.mega.grizzly.HttpServerHolder;
import cz.kramolis.mega.runtime.Context;
import org.apache.deltaspike.core.api.projectstage.ProjectStage;

@ApplicationScoped
public class HttpStaticContentApp implements Context {

    @Inject
    private Logger logger;

    @Inject
    private ProjectStage projectStage;

    @Inject
    private GrizzlyHttpServerUtils grizzlyHttpServerUtils;

    private void onHttpServerAvailable(@Observes HttpServerHolder httpServerHolder) {
        logger.info("Configure Grizzly HTTP server.");
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Current HTTP server instance: " + httpServerHolder.getHttpServer());
        }
        grizzlyHttpServerUtils.registerStaticContentHttpHandler("/META-INF/web/", "");
    }

}
