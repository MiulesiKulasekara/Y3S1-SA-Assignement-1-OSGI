package hill_cottage_hotel_producer;

import java.util.List;

public interface HillCottageHotelService {
	
	double calcTotalAmount(double roomAmount, int numberOfRooms, int numberOfDays);
	void generateReport(List<HillCottageBill> obj);

}