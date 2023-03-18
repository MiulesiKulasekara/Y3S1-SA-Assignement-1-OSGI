package com.mtit.service;

public class flightServicePublishIMPL implements filghtServicePublish {
	
	private int desti;
	private int start1;
	private String Class;
	private double feeBy_class;
	private double fee;
	private double base_amount;
	private double tax;
	private double weight;
	private double weight_fee;
	
	public flightServicePublishIMPL() {
		desti=0;
		start1=0;
		fee=0.0;
		base_amount=0.0;
		tax=5000;
	}

	@Override
	public String flightPublishService() {
		// TODO Auto-generated method stub
		return "Execute the publish service of flightServicePublisher";
	}

	@Override
	public void prices() {
		// TODO Auto-generated method stub
		System.out.println("1--->2 or 2--->1 is Rs 100000");
		System.out.println("2--->3 or 3--->1 is Rs 200000");
		System.out.println("3--->4 or 4--->3 is Rs 300000");
		System.out.println("4--->5 or 5--->4 is Rs 400000");
		System.out.println("1--->3 or 3--->1 is Rs 500000");
		System.out.println("2--->4 or 4--->2 is Rs 600000");
		System.out.println("3--->5 or 5--->3 is Rs 700000");
		System.out.println("1--->5 or 5--->1 is Rs 800000");
		System.out.println("2--->5 or 5--->2 is Rs 700000");
		
	}

	@Override
	public double clac_flight_fee(int dest, int start, String type, String seat) {
		// TODO Auto-generated method stub
		this.desti=dest;
		this.start1=start;
		this.Class=type;
		
		if ((start1==1&&desti==2)||(start1==2&&desti==1)){
			base_amount=100000.00;
			fee=cal_fee_by_class(type,base_amount,seat);
		}
		else if ((start1==2&&desti==3)||(start1==3&&desti==2)){
			base_amount=200000.00;
			fee=cal_fee_by_class(type,base_amount,seat);
		}
		else if ((start1==3&&desti==4)||(start1==4&&desti==3)) {
			base_amount=300000.00;
			fee=cal_fee_by_class(type,base_amount,seat);
		}
		else if ((start1==4&&desti==5)||(start1==5&&desti==4)){
			base_amount=400000.00;
			fee=cal_fee_by_class(type,base_amount,seat);
		}
		else if ((start1==1&&desti==3)||(start1==3&&desti==1)){
			base_amount=500000.00;
			fee=cal_fee_by_class(type,base_amount,seat);
		}
		else if((start1==2&&desti==4) ||(start1==4&&desti==2)){
			base_amount=600000.00;
			fee=cal_fee_by_class(type,base_amount,seat);
		}
		else if((start1==3&&desti==5)||(start1==5&&desti==3)) {
			base_amount=700000.00;
			fee=cal_fee_by_class(type,base_amount,seat);
		}
		else if((start1==1&&desti==5)||(start1==5&&desti==1)) {
			base_amount=800000.00;
			fee=cal_fee_by_class(type,base_amount,seat);
		}
		else if((start1==2&&desti==5)||(start1==5&&desti==2)) {
			base_amount=700000.00;
			fee=cal_fee_by_class(type,base_amount,seat);
		}
		else {
			return 0.0;
		}
		fee=fee+tax;
		return fee;	
	}

	@Override
	public double cal_fee_by_class(String type, double bace, String seat) {
		// TODO Auto-generated method stub
		switch(type) {
		case "f":
			feeBy_class=bace+75000;
			if(seat.equals("w")||seat.equals("W"))
				feeBy_class=feeBy_class+5000;
			break;
		case "b":
			feeBy_class=bace+35000;
			if(seat.equals("w")||seat.equals("W"))
				feeBy_class=feeBy_class+5000;
			break;
		case "e":
			feeBy_class=bace;
			if(seat.equals("w")||seat.equals("W"))
				feeBy_class=feeBy_class+5000;
			break;
		default:
			return 0.0;
		}
		
		return feeBy_class;
	}

	@Override
	public double cal_fee_by_weight(double Weight) {
		// TODO Auto-generated method stub
		
		this.weight=Weight;
		
		if(weight<=20) {
			weight_fee=0.0;
		}else {
			weight=weight-20;
			weight_fee=weight*1000;
		}
		
		return weight_fee;
	}
	
}
