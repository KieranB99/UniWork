/**
* Author: Kieran Baumann - s5109044
* Date:   04/10/2018
* Week:   12
* Description: Converting values.
*/
public class Conversions {

	public static void main(String[] args) {
		//pound to kg divide the mass value by 2.205
		// Fahrenheit to Celsius (0 - 32) x 5/9
		double britPound = 500;
		double pound = 460;
		double fahrenheit = 83;
		double hour = 2;
		double minutes = 50;
		double seconds = 25;
		
		double kg = pound / 2.205;
		System.out.println(pound + " pounds to kilograms is " +(Math.round(kg))+" kilograms");
		
		double euro = pound / 1.13;
		System.out.println(britPound + " britsh Pounds to euros is " + String.format("%.2f", euro)+ " euros"); //Decimal Place - https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
		
		double celsuis = ((fahrenheit-32)*5/9);
		System.out.println(fahrenheit + " farenheit is "+Math.round(celsuis)+" in celsuis");
		
		double totalSeconds = (hour*3600) + (minutes *60) + seconds;
		System.out.println(hour +" hours " + minutes + " minutes " + seconds +" seconds is equivalent to " + totalSeconds + " seconds.");
		

	}

}
