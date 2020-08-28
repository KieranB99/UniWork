/**
* Author: Kieran Baumann - s5109044
* Date:   11/10/2018
* Week:   12
* Description: Table of squares and cubes starting from 0 to 10.
*/
var firstNum = 0;
var secondNum;
var thirdNum;
console.log("Number\t"+"Square\t"+"Cube\t");
for (i = 0; i < 11; i++) {
	secondNum = firstNum * firstNum;
	thirdNum = firstNum * firstNum * firstNum;
	console.log(firstNum+"\t\t"+secondNum+"\t\t"+thirdNum);
	firstNum++;
}
