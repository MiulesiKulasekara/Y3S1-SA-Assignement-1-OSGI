package com.mtit.service2;

public class ServicePublishImpl implements ServicePublish{

	private double amount = 0;
	
	public static String publishService() {
		
		return "Excute the publish service of ServicePublisher";
	}
	
	public double calculateEstimatedCost(int location, int style, int activity) {
        // Calculate estimated cost based on location, travel style, and activities
		
		calcFeeByStyle obj = new calcFeeByStyle();
		
		calcFeeByActivity obj2 = new calcFeeByActivity();
		
		if(location == 1) {
			amount = 30000;
			amount = amount + obj.calc_fee(activity, style) + obj2.calc_payment(style, activity);
			
		}else if(location == 2) {
			amount = 40000;
			amount = amount + obj.calc_fee(activity, style) + obj2.calc_payment(style, activity);
		}else if(location == 3) {
			amount = 50000;
			amount = amount + obj.calc_fee(activity, style) + obj2.calc_payment(style, activity);
		}else if(location == 4) {
			amount = 450000;
			amount = amount + obj.calc_fee(activity, style) + obj2.calc_payment(style, activity);
		}else if(location == 5) {
			amount = 60000;
			amount = amount + obj.calc_fee(activity, style) + obj2.calc_payment(style, activity);
		}else if(location == 6) {
			amount = 520000;
			amount = amount + obj.calc_fee(activity, style) + obj2.calc_payment(style, activity);
		}else if(location == 7) {
			amount = 240000;
			amount = amount + obj.calc_fee(activity, style) + obj2.calc_payment(style, activity);
		}else if(location == 8) {
			amount = 340000;
			amount = amount + obj.calc_fee(activity, style) + obj2.calc_payment(style, activity);
		}else if(location == 9) {
			amount = 350000;
			amount = amount + obj.calc_fee(activity, style) + obj2.calc_payment(style, activity);
		}else if(location == 10) {
			amount = 360000;
			amount = amount + obj.calc_fee(activity, style) + obj2.calc_payment(style, activity);
		}
        
		return amount;
    }

}
