/**
* Author: Kieran Baumann - s5109044
* Date:   18/10/18
* Week:   14
* Description: Heads or Tails, generates random number then checks with the user input.
*/
var randomNum, choice;
randomNum = Math.floor(Math.random()*2); //random number between 1 and 0 
choice = prompt("Heads (1) or Tails (2)");
if (choice == randomNum){
	console.log("You Guessed Correctly");
}else{
	console.log("You guessed incorrect");
}