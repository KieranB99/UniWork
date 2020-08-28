/**
* Author: Kieran Baumann - s5109044
* Date:   15/11/2018
* Week:   19 - Task 1
* Description: Adds up integers from a file and outputs sum.
*/
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class AddingUpFromFile {
	
	String fileName;
	public void InputFileName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter File Name : ");
		fileName = input.nextLine();
		input.close();
	}
	public void AddNumbers() {
		File file = new File(fileName);
		int sum = 0;
		try {
			Scanner scanFile = new Scanner(file);
			while(scanFile.hasNextLine()) {
				try {
				sum = scanFile.nextInt();
				System.out.println(sum);
				sum+=sum;
				}catch (InputMismatchException ex) {
					System.out.println("Invalid data " + scanFile.next());
				}
			}
			System.out.println("Total = "+sum);
			scanFile.close();
			
		}catch (FileNotFoundException e) {
			System.out.println(file + " can not be found");
		}
	}
	
	
	public static void main(String[] args) {
		AddingUpFromFile start = new AddingUpFromFile();
		start.InputFileName();
		start.AddNumbers();
	}

}
