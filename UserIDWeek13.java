/**
* Author: Kieran Baumann - s5109044
* Date: 10/10/18
* Week: Week 13
* Description: Takes first and second name then creates an ID
*/
import java.util.Scanner;
public class UserIDWeek13 {

	public static void main(String[] args) {
		String firstName;
		String secondName;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("First name: ");
		firstName = scan.nextLine();
		System.out.print("Second Name: ");
		secondName = scan.nextLine();
		System.out.println("Hello "+firstName+" "+secondName);
		System.out.println("Your ID is " + firstName.charAt(0)+ secondName);
	}
}
