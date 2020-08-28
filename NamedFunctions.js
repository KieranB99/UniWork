/**
* Author: Kieran Baumann - s5109044
* Date:   22/10/2018
* Week:   17 Task 2
* Description: User inputs array, function reverses and outputs result.
*/
function arrReverse(){
	var userInput, array;
	userInput = prompt("Enter Items, seperate with a comma");
	array = userInput.split(",");
	array = array.reverse();
	return array;
}
console.log(arrReverse());
 
