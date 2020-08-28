/**
* Author: Kieran Baumann - s5109044
* Date:   15/11/2018
* Week:   16 - Task 1
* Description: User enters membership and age then calculates the discount depending on input.
*/
import java.util.Scanner;
public class LeisureCentre {

	public static void main(String[] args) {
		String membership;
		int age;
		int discount = 0;
		boolean program = true;
		
		Scanner inputAge = new Scanner(System.in);
		Scanner inputMember = new Scanner(System.in);
		
		do{
			System.out.print("Enter membership: ");
			membership = inputMember.nextLine();
			System.out.println("Enter age: ");
			age = inputAge.nextInt();
			
			if (age >= 60 || age <= 16) {
				discount +=10;
			}
			
			if (membership.equalsIgnoreCase("bronze")){
				System.out.println("You get a "+ (discount+10) + "% discount");
				program = false;
			}else if (membership.equalsIgnoreCase("silver")) {
				System.out.println("You get a "+ (discount+15) + "% discount");
				program = false;
			}else if (membership.equalsIgnoreCase("Gold")) {
				System.out.println("You get a "+ (discount+25) + "% discount");
				program = false;
				
			}else {
				System.out.println("Invalid Choice. \n");
			}
		}while(program);
		inputAge.close();
		inputMember.close();
	}
}
