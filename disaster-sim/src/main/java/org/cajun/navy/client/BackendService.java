package org.cajun.navy.client;

import org.cajun.navy.model.Incident;
import org.cajun.navy.model.Responder;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient(configKey = "backend")
public interface BackendService {

    @POST
    @Path("/incidents")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response createIncident(Incident incident);

    @POST
    @Path("/responder-service/responder")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response createResponder(Responder responder);

}
