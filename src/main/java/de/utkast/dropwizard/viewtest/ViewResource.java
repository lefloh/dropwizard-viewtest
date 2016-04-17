package de.utkast.dropwizard.viewtest;

import io.dropwizard.views.View;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Florian Hirsch
 */
@Path("views")
public class ViewResource {


	@GET
	@Path("mustache")
	@Produces(MediaType.TEXT_HTML)
	public View mustache() {
		return new SimpleView("test.mustache");
	}

	@GET
	@Path("freemarker")
	@Produces(MediaType.TEXT_HTML)
	public View freemarker() {
		return new SimpleView("test.ftl");
	}

}
