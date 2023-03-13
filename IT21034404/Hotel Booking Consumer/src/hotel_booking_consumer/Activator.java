package hotel_booking_consumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

//	private static BundleContext context;
	
	Scanner sobj = new Scanner(System.in);
//
//	static BundleContext getContext() {
//		return context;
//	}
	
	

	public void start(BundleContext bundleContext) throws Exception {
		String customerName;
		String phoneNumber;
		int hotel;
		int roomType;
		int numberOfRooms;
		int numberOfDays;
		double stdRoomPrice = 0;
		double deluxeRoomPrice = 0;
		double luxuryRoomType = 0;
		
		System.out.println("Hotel Booking Consumer Started!");
		System.out.println();
		System.out.println();
		System.out.println("============================== Welcome to OceanTravel Agency ==============================");
		System.out.println("                              \nMake your tour amazing with us\n                               ");
		
		System.out.println("------------------------------ Welcome to Hotel Booking Service ------------------------------");
		
		//Input name and mobile number
		
		System.out.print("Enter your name : ");
		customerName = sobj.nextLine();
		System.out.print("Enter your Mobile Number : ");
		phoneNumber = sobj.nextLine();
		
		//choosing a hotel
		
		System.out.println("Choose a Hotel to continue:");
		System.out.println("                            1. Hill Cottage Hotel");
		System.out.println("                            2. Shangrila Hotel");
		System.out.println();
		System.out.print("Enter the Hotel (Enter the number):");
		hotel = sobj.nextInt();
		
		//Choosing a room type
		
		if(hotel == 1) {
			
			stdRoomPrice = 10000.00;
			deluxeRoomPrice = 20000.00;
			luxuryRoomType= 30000.00;
			
		}else if(hotel == 2) {
			
			stdRoomPrice = 10000.00;
			deluxeRoomPrice = 20000.00;
			luxuryRoomType= 30000.00;
			
		}
		
		System.out.println("Choose a Room Type : ");
		System.out.format("%-18s %8s","Room Type","Unit Price");
		System.out.println();
		System.out.format("%-18s %8s","Standered Room","Rs. "+stdRoomPrice);
		System.out.println();
		System.out.format("%-18s %8s","Deluxe Room","Rs. "+deluxeRoomPrice);
		System.out.println();
		System.out.format("%-18s %8s","Room Type","Rs. "+luxuryRoomType);
		System.out.println();
		System.out.print("Enter the Room Type (Enter the number):");
		roomType = sobj.nextInt();
		
		
		
		//Input the Number of rooms need
		
		System.out.print("Enter the number of rooms you need : ");
		numberOfRooms = sobj.nextInt();	
		
		
		//How many days you stay
		System.out.print("Enter the number of days you stay : ");
		numberOfDays = sobj.nextInt();	
		
		
//		Activator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
//		Activator.context = null;
	}

}
