/**
* Author: Kieran Baumann - s5109044
* Date:   01/11/18
* Week:   15
* Description: Reads user input, adds then shows the average of all the numbers.
*/
var numsEntered, total, inputNum;
numsEntered = 0;
total = 1;
for (i=0;i<1;numsEntered++){
	inputNum = prompt("Enter Salary: ");
	total = parseInt(total) + parseInt(inputNum);
	if(inputNum == -1){
		console.log("Average is " + total / numsEntered);
		console.log("Total is "+ total);
		i++
	}
}
