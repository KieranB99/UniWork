/**
* Author: Kieran Baumann - s5109044
* Date:   11/10/2018
* Week:   12
* Description: 2 arrays to hold the user inputs and the grades then creates an average.
*/
var units = ["CF","PoP","DaD","N&CS","APP","FC&S"];
var grades = [];
var average;
var inputgrades;
var sum;
for (i = 0; i < 6; i++){
	inputgrades = prompt("Enter grade for "+units[i]);
	grades[i] = inputgrades;
}
//second loop for printing the grade and the unit together
for (i = 0; i < 6; i++){
	console.log(units[i]+": \t"+grades[i]);
}
average = ((parseInt(grades[0])+parseInt(grades[1])+parseInt(grades[2])+parseInt(grades[3])+parseInt(grades[4])+parseInt(grades[5]))/6);
console.log("The average of the grades are "+average);

