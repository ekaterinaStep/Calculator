package assignments;

public class VendingMachine {
	int cents;
	
	public void VendingMachine() {
		if (cents == 100)
			System.out.println("Your change is 4 quarters, 0 dimes, and 0 nickels.");
		if (cents == 95)
			System.out.println("Your change is 3 quarters, 2 dimes, and 0 nickels.");
		if (cents == 90)
			System.out.println("Your change is 3 quarters, 1 dime, and 1 nickel.");
		if (cents == 85)
			System.out.println("Your change is 3 quarters, 1 dime, and 0 nickels.");
		if (cents == 80)
			System.out.println("Your change is 3 quarters, 0 dimes, and 1 nickel.");
		if (cents == 75)
			System.out.println("Your change is 3 quarters, 0 dimes, and 0 nickels.");
		if (cents == 70)
			System.out.println("Your change is 2 quarters, 2 dimes, and 0 nickels.");
		if (cents == 65)
			System.out.println("Your change is 2 quarters, 1 dime, and 1 nickel.");
		if (cents == 60)
			System.out.println("Your change is 2 quarters, 1 dime, and 0 nickels.");
		if (cents == 55)
			System.out.println("Your change is 2 quarters, 0 dimes, and 1 nickel.");
		if (cents == 50)
			System.out.println("Your change is 2 quarters, 0 dimes, and 0 nickels.");
		if (cents == 45)
			System.out.println("Your change is 1 quarter, 2 dimes, and 0 nickels.");
		if (cents == 40)
			System.out.println("Your change is 1 quarter, 1 dime, and 1 nickel.");
		if (cents == 35)
			System.out.println("Your change is 1 quarter, 1 dime, and 0 nickels.");
		if (cents == 30)
			System.out.println("Your change is 1 quarter, 0 dimes, and 1 nickel.");
		if (cents == 25)
			System.out.println("Your change is 1 quarter, 0 dimes, and 0 nickels.");
		if (cents == 20)
			System.out.println("Your change is 0 quarters, 2 dimes, and 0 nickels.");
		if (cents == 15)
			System.out.println("Your change is 0 quarters, 1 dime, and 1 nickel.");
		if (cents == 10)
			System.out.println("Your change is 0 quarters, 1 dime, and 0 nickels.");
		if (cents == 5)
			System.out.println("Your change is 0 quarters, 0 dimes, and 1 nickel.");
		
	}
}
