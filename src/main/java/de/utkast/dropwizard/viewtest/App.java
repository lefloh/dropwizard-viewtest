package de.utkast.dropwizard.viewtest;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

import java.util.Map;

/**
 * @author Florian Hirsch
 */
public class App extends Application<Config> {

	public static void main(final String[] args) throws Exception {
		new App().run(args);
	}

	@Override
	public String getName() {
		return "dropwizard-viewtest";
	}

	@Override
	public void initialize(final Bootstrap<Config> bootstrap) {
		bootstrap.addBundle(new ViewBundle<Config>() {
			@Override
			public Map<String, Map<String, String>> getViewConfiguration(Config config) {
				return config.getViews();
			}
		});
		bootstrap.addBundle(new ViewBundle<>());
	}

	@Override
	public void run(final Config configuration, final Environment environment) {
		environment.jersey().register(ViewResource.class);
	}

}
