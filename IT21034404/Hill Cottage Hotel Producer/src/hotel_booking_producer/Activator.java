package hotel_booking_producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Hill Cottage Hotel Producer started!!!!!!!!");
		HillCottageHotelService hillCottageHotel = new HillCottageHotelServiceImp();
		
		serviceRegistration = context.registerService(HillCottageHotelService.class.getName(), hillCottageHotel, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Hill Cottage Hotel Producer stoped!!!!!!!!");
	}

}
