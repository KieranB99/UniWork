/**
* Author: Kieran Baumann - s5109044
* Date:   22/11/18
* Week:   16 - Task 2
* Description: Generates 2 random numbers, user has to guess higher or lower than the previous card.
*/
import java.util.Random;
import java.util.Scanner;
public class HigherOrLower {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int randomCardNumber, secondCardNumber;
		String choice;
		boolean game = true;
		boolean validInput = false;
		randomCardNumber = new Random().nextInt(12)+1; // random 0 and 13
		
		do {
			secondCardNumber = new Random().nextInt(12)+1; // random 0 and 13
			System.out.println(randomCardNumber);
			
			do {
				System.out.println("Higher or lower?");
				choice = input.nextLine();
				if(choice.equalsIgnoreCase("h")||choice.equalsIgnoreCase("l")) {
					validInput = true;
				}
				}while(!validInput);
				validInput = false;
				if (choice.equalsIgnoreCase("h") && secondCardNumber>=randomCardNumber || choice.equalsIgnoreCase("l") && secondCardNumber<=randomCardNumber) {
					System.out.println("Correct");
					randomCardNumber = secondCardNumber; //use next card as the first
				}else {
					System.out.println("Incorrect, the card was " + secondCardNumber);
					System.out.println("Would you like to play again? (Y)es (N)o");
					choice = input.nextLine();
					if (choice.equalsIgnoreCase("n")) {
						game = false;
				}
			}

		}while(game);
		input.close();
	}
}
