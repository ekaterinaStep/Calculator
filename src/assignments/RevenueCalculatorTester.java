package assignments;

import java.util.Scanner;

public class RevenueCalculatorTester {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number of units");
		int quantity = input.nextInt();
		
		System.out.println("Please enter unit price");
		double unitPrice = input.nextDouble();
		
		RevenueCalculator revCalc = new RevenueCalculator();
		revCalc.numberOfUnits = quantity;
		revCalc.unitPrice = unitPrice;
		
		revCalc.calculateRevenue();
		
		
		
	}
}
