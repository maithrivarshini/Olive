package olive.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import olive.core.config.OSGIConfig;

@Component(service = OSGIService.class, immediate = true)
@Designate(ocd = OSGIConfig.class,factory = true)

public class OSGIService {
	
	private String objectName;
	private boolean trueOrFalse;
	private int objectCount;
	private String[] objectRegionalAvailability;
	private String paymentMode;
	
	@Activate
	protected void activate(OSGIConfig osgiConfig)
	{
		objectName  = osgiConfig.objectName();
		trueOrFalse = osgiConfig.trueOrFalse();
		objectCount = osgiConfig.objectCount();
		objectRegionalAvailability = osgiConfig.objectRegionalAvailability();
		paymentMode = osgiConfig.paymentMode();
	}
	
	public String getObjectName()
	{
		return objectName;
	}
	
	public boolean getTrueOrFalse()
	{
		return trueOrFalse;
	}
	
	public int getObjectCount() 
	{
		return objectCount;
	}
	
	public String[] getObjectRegionalAvailability()
	{
		return objectRegionalAvailability;
	}
	
	public String getPaymentMode()
	{
		return paymentMode;
	}
	
}

