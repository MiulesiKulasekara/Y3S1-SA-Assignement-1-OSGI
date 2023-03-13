package hill_cottage_hotel_producer;

public class HillCottageBill {
	
	private String customerName;
	private String phoneNumber;
	private int hotel;
	private int roomTypeNumber;
	private int numberOfRooms;
	private int numberOfDays;
	
	public HillCottageBill(String customerName, String phoneNumber, int hotel, int roomTypeNumber, int numberOfRooms,
			int numberOfDays) {
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.hotel = hotel;
		this.roomTypeNumber = roomTypeNumber;
		this.numberOfRooms = numberOfRooms;
		this.numberOfDays = numberOfDays;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public int getHotel() {
		return hotel;
	}

	public int getRoomTypeNumber() {
		return roomTypeNumber;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}
	
	public double getRoomAmount() {
		if (this.roomTypeNumber == 1) {
			return 10000.00;
			
		}else if(this.roomTypeNumber == 2) {
			return 30000.00;
			
		}else if(this.roomTypeNumber == 3) {
			return 60000.00;
			
		}else {
			return 0;
		}
		
	}
	
	public String getRoomType() {
		if (this.roomTypeNumber == 1) {
			return "Standered Room";
			
		}else if(this.roomTypeNumber == 2) {
			return "Deluxe Room";
			
		}else if(this.roomTypeNumber == 3) {
			return "Luxury Room";
			
		}else {
			return null;
		}
		
	}

}
