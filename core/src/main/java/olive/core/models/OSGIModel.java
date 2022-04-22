package olive.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import olive.core.services.OSGIService;


@Model(adaptables = SlingHttpServletRequest.class , defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class OSGIModel {

	@OSGiService 
	OSGIService osgiService;
	
	public String getObjectName()
	{
		return osgiService.getObjectName();
	}
	
	public boolean getTrueOrFalse()
	{
		return osgiService.getTrueOrFalse();
	}
	
	public int getObjectCount() 
	{
		return osgiService.getObjectCount();
	}
	
	public String[] getObjectRegionalAvailability()
	{
		return osgiService.getObjectRegionalAvailability();
	}
	
	public String getPaymentMode()
	{
		return osgiService.getPaymentMode();
	}
	
}

