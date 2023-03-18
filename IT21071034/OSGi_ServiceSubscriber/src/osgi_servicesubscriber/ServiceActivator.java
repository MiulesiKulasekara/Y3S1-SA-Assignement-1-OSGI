package osgi_servicesubscriber;

import com.mtit.service2.ServicePublish;
import com.mtit.service2.ServicePublishImpl;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class ServiceActivator implements BundleActivator {

	//declare the variables
	public int location;
	public int style;
	public int activity;
	
	Scanner myscanner = new Scanner(System.in);
	
	//build the service reference
	ServiceReference serviceReference;

	
	public void start(BundleContext context) throws Exception {
		
		//tell the when subscriber start
		System.out.println("Start Subscriber Service");
	
		//previously registered service now refer
		serviceReference = context.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish)context.getService(serviceReference);
		System.out.println(ServicePublish.publishService());
		
		System.out.println("=====================Welcome to Travel Budget Planning Unit=====================");
		System.out.println();
		System.out.println("=====================Travel is an INVESTMENT in yourself :) =====================");
		System.out.println();
		
		System.out.println("---------------Destination Section---------------");
		System.out.println();
		
		System.out.println("1. India                           Rs.30000.00");
		System.out.println("2. Sigiriya                        Rs.40000.00");
		System.out.println("3. Hanthana Mountain               Rs.50000.00");
		System.out.println("4. The Maldives                    Rs.45000.00");
		System.out.println("5. Hawaii (USA)                    Rs.60000.00");
		System.out.println("6. Italy                           Rs.52000.00");
		System.out.println("7. France                          Rs.24000.00");
		System.out.println("8. Ireland                         Rs.34000.00");
		System.out.println("9. Japan                           Rs.35000.00");
		System.out.println("10. Scotland                       Rs.36000.00");
		System.out.println();
		
		System.out.println("---------------Travel Style Section---------------");
		System.out.println();
		
		System.out.println("1. Backpaker                       Rs.2000000.00");
		System.out.println("2. Luxury Traveler                 Rs.3000000.00");
		System.out.println("3. Adventure / Active Travel       Rs.2500000.00");
		System.out.println("4. Group Tour / Cruise Traveler    Rs.1000000.00");
		System.out.println("5. Private Tour                    Rs.1500000.00");
		System.out.println("6. Slow / Long Term Traveler       Rs.1200000.00");
		System.out.println();
		
		System.out.println("---------------Activity Section---------------");
		System.out.println();
		
		System.out.println("1. Sightseeing                     Rs.1000.00");
		System.out.println("2. Hiking                          Rs.5000.00");
		System.out.println("3. Visiting Museums                Rs.3000.00");
		System.out.println("4. Pack and Paddle                 Rs.2000.00");
		
		System.out.println();
		
		System.out.println("Your prefered destination location : ");
		location = myscanner.nextInt();
		
		System.out.println("Your prefered travel style : ");
		style = myscanner.nextInt();
		
		System.out.println("Your prefered activities : ");
		activity = myscanner.nextInt();
		
		System.out.println();
		System.out.println();
		System.out.println("==========================================");
		System.out.println("---------------Your Package---------------");
		
		System.out.println();
		System.out.println("Destination : "+location);
		System.out.println("Travel Style : "+style);
		System.out.println("Activity : "+activity);
		
		ServicePublish obj = new ServicePublishImpl();
		
		double total;
		
		total = obj.calculateEstimatedCost(location, style, activity);
		
		System.out.println("Total Travel Budget : "+total);
		System.out.println();
		System.out.println("==========================================");
		System.out.println("---------------Thank You!~~---------------");
		System.out.println();
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Good Bye! Have a nice day!");
		
		//un get service
		context.ungetService(serviceReference);
		
	}

}
