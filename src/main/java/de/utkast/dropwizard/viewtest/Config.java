package de.utkast.dropwizard.viewtest;

/**
 * @author Florian Hirsch
 */
import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import java.util.Map;

public class Config extends Configuration {

	private Map<String, Map<String, String>> views;

	public Map<String, Map<String, String>> getViews() {
		return views;
	}

	public void setViews(Map<String, Map<String, String>> views) {
		this.views = views;
	}

}
