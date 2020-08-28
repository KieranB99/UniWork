/**
* Author: Kieran Baumann - s5109044
* Date: 10/10/18
* Week: Week 13
* Description: Takes the user inputs and creates an average
*/
import java.util.Scanner;
public class UnitsandGradesWeek13 {

	public static void main(String[] args) {
		String gradesinput;
		int average;
		String[] grades = new String[6];
		String[] units = {"CF","PoP","DaD","N&CS","APP","FC&S"};
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.print("Enter grade for " + units[i]+" :");
			gradesinput= scan.nextLine();
			grades[i] = gradesinput;
		}
		
		//second loop for printing each array
		System.out.println("Units and grades are: ");
		for(int i = 0; i < 6; i++) {
			System.out.println(units[i]+":\t"+grades[i]);	
		}
		
		average = Integer.parseInt(grades[0])+Integer.parseInt(grades[1])+Integer.parseInt(grades[2])+Integer.parseInt(grades[3])+Integer.parseInt(grades[4])+Integer.parseInt(grades[5]);
		System.out.println("The average is: " +(average/6));
		
	}
}