package hotel_booking_consumer;

import java.util.ArrayList;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import hill_cottage_hotel_producer.HillCottageBill;
import hill_cottage_hotel_producer.HillCottageHotelService;

public class Activator implements BundleActivator {


	
	Scanner sobj = new Scanner(System.in);

	
	
	ServiceReference reference;
	
	

	public void start(BundleContext context) throws Exception {
		
		
		System.out.println("Consumer Started!!!!!!!!!");
		
		reference = context.getServiceReference(HillCottageHotelService.class.getName());
		HillCottageHotelService hCService = (HillCottageHotelService)context.getService(reference);
		
		
		String customerName;
		String phoneNumber;
		int hotel;
		int roomType;
		int numberOfRooms;
		int numberOfDays;
		double stdRoomPrice = 0;
		double deluxeRoomPrice = 0;
		double luxuryRoomType = 0;
		ArrayList<HillCottageBill> list = new ArrayList<HillCottageBill>();
		
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
		System.out.println();
		
		//choosing a hotel
		while(true) {
			
			
			System.out.println("If you want to continue with this service or exit: ");
			System.out.println("                                                   1.Continue");
			System.out.println("                                                   2.Exit");
			System.out.print("Enter your option (Enter the related number): ");
			int isContinue = sobj.nextInt();
			System.out.println();
				
			if(isContinue == 1) {
				
				System.out.println("Choose a Hotel to continue:");
				System.out.println("                            1. Hill Cottage Hotel");
				System.out.println("                            2. Shangrila Hotel");
				System.out.println();
				System.out.print("Enter the Hotel (Enter the number):");
				hotel = sobj.nextInt();
				System.out.println();
				
				//Choosing a room type
				
				if(hotel == 1) {
					
					stdRoomPrice = 10000.00;
					deluxeRoomPrice = 20000.00;
					luxuryRoomType= 30000.00;
					
					System.out.println("===================== Welcome to Hill Cottage Hotel =====================");
					System.out.println();
					
					do {
						
						System.out.println("Choose a Room Type : ");
						System.out.format("%-18s %8s","Room Type","Unit Price");
						System.out.println();
						System.out.format("%-18s %8s","1. Standered Room","Rs. "+stdRoomPrice);
						System.out.println();
						System.out.format("%-18s %8s","2. Deluxe Room","Rs. "+deluxeRoomPrice);
						System.out.println();
						System.out.format("%-18s %8s","3. Luxury Room","Rs. "+luxuryRoomType);
						System.out.println();
						System.out.println();
						System.out.print("Enter the Room Type (Enter the number):");
						roomType = sobj.nextInt();
						System.out.println();
						
						//Input the Number of rooms need
						
						System.out.print("Enter the number of rooms you need : ");
						numberOfRooms = sobj.nextInt();	
						System.out.println();
						
						
						//How many days you stay
						System.out.print("Enter the number of days you stay : ");
						numberOfDays = sobj.nextInt();
						System.out.println();
						
						
						HillCottageBill bill = new HillCottageBill(customerName,phoneNumber,hotel,roomType,numberOfRooms,numberOfDays);
						list.add(bill);
						System.out.println("Do you need to reserve more Rooms:");
						System.out.println("                                  1. Yes");
						System.out.println("                                  2. No");
						int isNeed = sobj.nextInt();
						System.out.println();
						
						if(isNeed == 1) {
							continue;
							
						}else{
							break;
							
						}
						
					}while(true);
					
					
					
				}else if(hotel == 2) {
					
					stdRoomPrice = 10000.00;
					deluxeRoomPrice = 20000.00;
					luxuryRoomType= 30000.00;
					
				}
				
				
				
				hCService.generateReport(list);
				System.out.println();
				System.out.println();
				System.out.print("If you need to do a another booking (y or n): ");
				String isBooking = sobj.nextLine();
				
				if(isBooking == "y" || isBooking == "Y") {
					
					continue;
				}else {
					break;
				}
				
				
			}else if(isContinue == 2){
				
				System.out.println("-----------------Room Booking Service is Closed---------------");
				System.out.println("Thank you fro join with Us");
				break;
				
			}	
			
		
		}
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Consumer Stopped!!!!!!!!!");
	}

}
