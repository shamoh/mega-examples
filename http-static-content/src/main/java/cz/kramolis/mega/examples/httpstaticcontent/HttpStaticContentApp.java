package cz.kramolis.mega.examples.httpstaticcontent;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.Specializes;
import javax.inject.Inject;

import cz.kramolis.mega.Context;
import cz.kramolis.mega.grizzly.GrizzlyHttpServerUtils;
import cz.kramolis.mega.grizzly.HttpServerHolder;
import org.apache.deltaspike.core.api.projectstage.ProjectStage;

@Specializes
public class HttpStaticContentApp extends Context {

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
