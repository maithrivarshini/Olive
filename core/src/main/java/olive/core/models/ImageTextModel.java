package olive.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(adaptables = Resource.class , defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class ImageTextModel {

	@Inject 
	private String image;

	@Inject 
	private String alttext;
	
	@Inject 
	private String caption;
	
	@Inject 
	private String width;
	
	@Inject 
	private String height;
	
	/*
	 * Above can also be written as 

	@Inject
	private String image;
	private String alttext;
	private String caption;
	private String width;
	private String height;
	 */
	
	@PostConstruct
    public void activate() {
        alttext = "Hello! " + caption;
    }
	
	
	public String getImage() {
		return image;
	}

	public String getAlttext() {
		return alttext;
	}

	public String getCaption() {
		return caption;
	}

	public String getWidth() {
		return width;
	}

	public String getHeight() {
		return height;
	}

	 

}

