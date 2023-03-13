package hill_cottage_hotel_producer;

import java.util.List;

public class HillCottageHotelServiceImp implements HillCottageHotelService{

	@Override
	public double calcTotalAmount(double roomAmount, int numberOfRooms, int numberOfDays) {
		// TODO Auto-generated method stub
		return roomAmount*numberOfRooms*numberOfDays;
	}

	@Override
	public void generateReport(List<HillCottageBill> obj) {
		
		double totalAmount = 0;
		
		System.out.println("======================= Hill Cottage Hotel Bill =======================");
		
		System.out.format("%-18s %10s %10s %10s","Room Type","Number of Rooms","Number of days of stay");
		System.out.println();
		System.out.format("%-18s %10s %10s %10s","Room Type","Number of Rooms","Number of days of stay","Amount");
		System.out.println();
		System.out.println("==========================================================================");
		
		for(HillCottageBill bil : obj) {
			double amount = calcTotalAmount(bil.getRoomAmount(),bil.getNumberOfRooms(),bil.getNumberOfDays());
			System.out.format("%-18s %10s %10s %10s",bil.getRoomType(),bil.getNumberOfRooms(),bil.getNumberOfDays(),amount);
			System.out.println();
			
			totalAmount += amount; 
				
		}
		
		System.out.println("==========================================================================");
		System.out.format("%-18s %10s %10s %10s","","","","Total = "+totalAmount);
		
		
	}

}
