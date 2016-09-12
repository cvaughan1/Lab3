package powers;

import java.util.Scanner;

public class Lab3Powers {

	public static void main(String[] args) {

		System.out.println("Learn your squares and cubes!");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equals("y")) {
			
			// Accepting input (intNext) from the user
			
			System.out.println("Enter an Integer: ");
			int intNext = sc.nextInt();

			// Setting up the board.
			
			System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
			System.out.println("------" + "  " + "-------" + "  " + "------");

			// i stops at intNext. Repeated for every integer cycle in while.
			
			for (int i = 1; i <= intNext; i++) {

				// Calculate the exponents using Math method
				
				int numberSq = (int) Math.pow(i, 2);
				int numberCubed = (int) Math.pow(i, 3);
				
				// Format and Display the results

				String message = i + "\t" + numberSq + "\t" + numberCubed;

				System.out.println(message);
				
			}

			// Continue block

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();

		}

		sc.close();

	}// psvm

}// class
