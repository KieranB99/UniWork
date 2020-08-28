/**
* Author: Kieran Baumann - s5109044
* Date:   04/10/2018
* Week:   12
* Description: Table of squares and cubes starting from 0 to 10.
*/
public class SquaresandCubes {

	public static void main(String[] args) {

		int firstNum = 0;
		int secondNum;
		int thrirdNum;
		System.out.println("Number\t"+"Square\t"+"Cube\t");
		for(int i=0; i < 11; i++) {
			secondNum = firstNum * firstNum; //square
			thrirdNum = firstNum * firstNum * firstNum; //cube
			System.out.println(firstNum + "\t" + secondNum + "\t" + thrirdNum);
			firstNum++;
		}
	}

}