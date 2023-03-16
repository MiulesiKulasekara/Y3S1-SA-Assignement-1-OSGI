package hotel_booking_producer;

public class CustomerProfile {
	
	private String customerName;
	private String mobileNumber;
	
	public CustomerProfile(String customerName, String mobileNumber) {
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}
	
	

}
