package flightbookingsubscriber;

public class calLaggageFee {
	private double weight;
	private double fee;
	
	public double cal_fee_by_fee(double Weight) {
		this.weight=Weight;
		
		if(weight<=20) {
			fee=0.0;
		}else {
			weight=weight-20;
			fee=weight*1000;
		}
		
		return fee;
	}
}
