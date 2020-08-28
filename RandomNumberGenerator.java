/**
* Author: Kieran Baumann - s5109044
* Date:   15/11/2018
* Week:   19 - Task 1
* Description: Methods that create random numbers then return said number.
*/
import java.util.ArrayList;

public class RandomNumberGenerator {
	
	public int RangetoOneHundred() {
		int randNumber = (int) (Math.random() * (100 - 1))+1;;
		//System.out.println(randNumber);
		return randNumber;
	}
	
	public int SpecifiedMaxNumber(int max) {
		int randNumber = (int) (Math.random()* (max - 1))+1;
		System.out.println(randNumber);
		return randNumber;
	}
	public int SpecifiedMaxandMinNumber(int max, int min) {
		int randNumber = (int) (Math.random()* (max - min))+min;
		System.out.println(randNumber);
		return randNumber;
	}
	
	public void RandomNumbersToArray() {
		ArrayList<Integer> numberArray = new ArrayList<Integer>();
		
			for (int i = 0; i < 10; i++) {
				int randNumber2 = RangetoOneHundred();
				while(numberArray.size()!=10) {
					if (numberArray.contains(randNumber2)){
						numberArray.remove(i);
					}else {
						numberArray.add(RangetoOneHundred());
					}
				}
			}
		System.out.println(numberArray);
		
	
	}
	public void CallMethods() {
		RangetoOneHundred(); //Method a)
		SpecifiedMaxNumber(50); //Method b)
		SpecifiedMaxandMinNumber(20, 10); //Method c) (Max, Min)
		RandomNumbersToArray(); //Method d)
	}

	public static void main(String[] args) {
		RandomNumberGenerator start = new RandomNumberGenerator();
		start.CallMethods();
	}

}
