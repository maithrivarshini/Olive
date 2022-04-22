package olive.core.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "Olive OSGI config" , description = "OSGI Configuration for Plumstreet")

public @interface OSGIConfig {
	
	@AttributeDefinition(name = "Object Name", description = "Enter the name of the Object" , type = AttributeType.STRING )
	public String objectName();
	
	@AttributeDefinition(name = "Object Count", description = "Enter the count of Objects", type = AttributeType.INTEGER)
	public int objectCount();
	
	@AttributeDefinition(name = "Real Object", description = "Is the Object Real", type = AttributeType.BOOLEAN)
	public boolean trueOrFalse();
	
	@AttributeDefinition(name = "Object Regional Availability", description = "Enter the regoins where the Object is available" 
			, type = AttributeType.STRING )
	public String[] objectRegionalAvailability() default { "Andhra Pradesh" , "Telangana" };
	
	@AttributeDefinition(name = "Payment Mode", description = "Enter the Mode of Payment" ,
			options = {
					@Option(label = "UPI" , value = "upi"),
					@Option(label = "Amazon Pay" , value = "amazonPay"),
					@Option(label = "Card" , value = "card"),
					@Option(label = "Cash on Delivery" , value = "cashOnDelivery")		
			})
	public String paymentMode();

}
