package assignments;

import java.util.Scanner;

public class VendingMachineChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter price in cents");
				
		VendingMachine vm = new VendingMachine();
		vm.cents = input.nextInt();
		
		vm.VendingMachine();
	
	}
}
