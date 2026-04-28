package org.demo;

public class SICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	SimpleInterest obj = new SimpleInterest();
	
	System.out.println(obj.calculate(2000, 5, 2));
	
	double ans = obj.calculate(20, 10, 2);
	System.out.println(ans);

	}

}
