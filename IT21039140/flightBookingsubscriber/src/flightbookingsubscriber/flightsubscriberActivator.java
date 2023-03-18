package flightbookingsubscriber;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import com.mtit.service.filghtServicePublish;
import com.mtit.service.flightServicePublishIMPL;

public class flightsubscriberActivator implements BundleActivator {
	
	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {

		System.out.println("------start subscriber service------");
		
		serviceReference=context.getServiceReference(filghtServicePublish.class.getName());
		filghtServicePublish servicepublish=(filghtServicePublish)context.getService(serviceReference);
		flightServicePublishIMPL obj=new flightServicePublishIMPL();
		
		Scanner sc = new Scanner(System.in);
		
		
		int destNum;
		int start;
		String flightClass;
		double bagKg;
		String seatType;
		double total_fee;
		String yn=null;
		String fname;
		String lname;
		String phone;
		String Id;
		
		System.out.println("Enter your Fist Name :");
		fname=sc.next();
		
		System.out.println("Enter your Last Name :");
		lname=sc.next();
		
		System.out.println("Enter your Phone number :");
		phone=sc.next();
		
		System.out.println("Enter your Passport number");
		Id=sc.next();
		
		
		
		do{
			
			System.out.println("---------------------------------------");
			System.out.print("Enter the prefered flight date in yyyy-mm-dd format: ");
	        String inputDate = sc.next();
	        System.out.println("==============================================");
	        
	        LocalDate currentDate = LocalDate.now();
	        LocalDate enteredDate = LocalDate.parse(inputDate);
	        
	        if(enteredDate.isBefore(currentDate)||enteredDate.isEqual(currentDate)) {
	        	System.out.println(enteredDate +"  this date cannot be entered due to it being a previous or it's today");
	        }else {
	        	
			
				System.out.println("------------------travel destinations/stareting plase------------------");
				System.out.println("1.India");
				System.out.println("2.Australia");
				System.out.println("3.Japan");
				System.out.println("4.France");
				System.out.println("5.Itali");
				System.out.println("---------------------------------------");
				obj.prices();
				System.out.println("==============================================");
				
				System.out.println("---------------------------------------");
				System.out.println("Enter the starting place number");
				start=sc.nextInt();
				System.out.println("Enter the destination number");
				destNum=sc.nextInt();
				System.out.println("==============================================");
				
				System.out.println("--------------------Classes of the Flight----------------------------");
				System.out.println("f. first class wiil add extra RS 75000");
				System.out.println("b. business class wiil add extra RS 35000");
				System.out.println("e. economi class wiil add extra ");
				System.out.println("Enter the preferd class");
				flightClass=sc.next();
				System.out.println("==============================================");
				
				System.out.println("-------------------laggage weight-------------------------------");
				System.out.println("First 20Kg will be free of charge for extra weight we will charge Rs 1000 per 1Kg");
				System.out.println("Enter weight of Laggages");
				bagKg=sc.nextInt();
				System.out.println("==============================================");
				
				System.out.println("--------------------seat type------------------------------------");
				System.out.println("if you want a wendow seat enter'w/W' window seat will add another Rs 5000");
				seatType=sc.next();
				System.out.println("==============================================");
				
				
				
				
				total_fee=obj.clac_flight_fee(destNum, start,flightClass,seatType);
				
				total_fee=total_fee+obj.cal_fee_by_weight(bagKg);
				
				System.out.println("---------------------------------------");
				System.out.println("Name : "+fname+" "+lname);
				System.out.println("Phone number : "+phone);
				System.out.println("Passport number : "+Id);
				System.out.println("the date :"+enteredDate);
				System.out.println("your total fee is :" + total_fee);
				System.out.println("==============================================");
			
	        }
	        
	        System.out.println("do you need to book another filght if so enter(y or Y)");
	        yn=sc.next();
	        
	        
		}while(yn.equals("y")||yn.equals("Y"));
		
		System.out.println(servicepublish.flightPublishService());
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("good byee");
		context.ungetService(serviceReference);
	}

}
