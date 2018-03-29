package com.application.ms1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("app1")
public class Endpoint {
	
	@Produces({MediaType.APPLICATION_JSON})
	@GET
	@Path("/sum")
	public int sum() {
		
		return 5;
	}
	
}
