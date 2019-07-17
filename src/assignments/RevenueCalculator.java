package assignments;

public class RevenueCalculator {
	double unitPrice;
	int numberOfUnits;
	double discountRate;
		
	public void calculateRevenue() {
		if (numberOfUnits>=100 && numberOfUnits<=120)
		{			
			discountRate = 0.10;
			double revenue = numberOfUnits*(unitPrice-(unitPrice*discountRate));
			double afterDiscount = numberOfUnits*unitPrice - revenue;
			System.out.println("Revenue is: "+revenue);
			System.out.println("After Discount: "+afterDiscount);
		}
		
		else if (numberOfUnits>120)
		{
			discountRate = 0.15;
			double revenue = numberOfUnits*(unitPrice-(unitPrice*discountRate));
			double afterDiscount = numberOfUnits*unitPrice - revenue;
			System.out.println("Revenue is: "+revenue);
			System.out.println("After Discount: "+afterDiscount);
		}
		else {
			discountRate = 0;
			double revenue = numberOfUnits*(unitPrice-(unitPrice*discountRate));
			double afterDiscount = numberOfUnits*unitPrice - revenue;
			System.out.println("Revenue is: "+revenue);
			System.out.println("After Discount: "+afterDiscount);
		}
		
		
	}
	
	
}
