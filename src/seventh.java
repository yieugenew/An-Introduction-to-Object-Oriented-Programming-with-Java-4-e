//Eugene Yi
import javax.swing.*;

class Seventh {

	public static void main( String[] args ) {

	int quarters = 0, coins;

	double winningNumber1, winningNumber2, winningNumber3;

	String quartersStr, coinsStr;

	quartersStr = JOptionPane.showInputDialog(null, "Insert any amount of quarters for coins.");

	quarters = Integer.parseInt(quartersStr);

	if (quarters <= 0)

		System.out.print("Thank you for your time. Goodbye.");

	else {

		while (quarters > 0){

			winningNumber1 = (int) (Math.floor(Math.random() * 3)+ 1); // Gives me 1,2,3 randomly

			winningNumber2 = (int) (Math.floor(Math.random() * 3)+ 1);

			winningNumber3 = (int) (Math.floor(Math.random() * 3)+ 1);

			coinsStr = JOptionPane.showInputDialog(null, "Enter number of coins to bet from 1 - 4.");

			coins = Integer.parseInt(coinsStr);

			quarters = quarters - coins;

			if (coins <= 4 && coins > 0)
				if (quarters > 0) {

					System.out.println("	Combination 		Number of Coins Left 		Profit");

			switch ((int) winningNumber1) {

			case 1: System.out.print("GRAPE ");
			break;

			case 2: System.out.print("BELL ");
			break;

			case 3: System.out.print("CHERRY ");
			break;
			}

			switch ((int) winningNumber2) {

			case 1: System.out.print("GRAPE ");
			break;

			case 2: System.out.print("BELL ");
			break;

			case 3: System.out.print("CHERRY ");
			break;
			}

			switch ((int) winningNumber3) {

			case 1: System.out.print("GRAPE ");
			break;

			case 2: System.out.print("BELL ");
			break;

			case 3: System.out.print("CHERRY ");
			break;

			}

			System.out.print("			" + quarters);

			if (winningNumber1 == 2 && winningNumber2 == 2)
				if (winningNumber2 == 2 && winningNumber3 == 2)

					System.out.print(" 	   	        " + (10 * coins) + "\n");

			if (winningNumber1 == 1 && winningNumber2 == 1)
			 	if (winningNumber2 == 1 && winningNumber3 == 1)
		
			 		System.out.print(" 		        " + (7 * coins) + "\n");

			if (winningNumber1 == 3 && winningNumber2 == 3)
			 	if (winningNumber2 == 3 && winningNumber3 == 3)
		
			 		System.out.print(" 		        " + (5 * coins) + "\n");

			if (winningNumber1 == 3 && winningNumber2 == 3)
				if (winningNumber3 != 3)
		
					System.out.print(" 		        " + (3 * coins) + "\n");

			if (winningNumber2 == 3 && winningNumber3 == 3)
				if (winningNumber1 != 3)
		
					System.out.print(" 		        " + (3 * coins) + "\n");
		
			if (winningNumber1 == 3 && winningNumber3 == 3)
				if (winningNumber3 != 3)
		
					System.out.print(" 		        " + (3 * coins) + "\n");
		
			if (winningNumber1 == 3 && winningNumber2 != 3)
				if (winningNumber3 != 3)
		
					System.out.print(" 		        " + (3 * coins) + "\n");
		
			if (winningNumber1 != 3 && winningNumber2 == 3)
				if (winningNumber3 != 3)
		
					System.out.print(" 		        " + (3 * coins) + "\n");
		
			if (winningNumber1 != 3 && winningNumber2 != 3)
				if (winningNumber3 == 3)
		
						System.out.print(" 		        " + (3 * coins) + "\n");
				
			System.out.print("\n");
			
					}
				}
			}

		}
	}


