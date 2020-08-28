/**
* Author: Kieran Baumann - s5109044
* Date:   11/10/2018
* Week:   16 - Task 2
* Description: Generates 2 random numbers, user has to guess higher or lower than the previous card.
*/
var randomCardNumber, secondCardNumber, choice;
var game = true;
var validInput = false;

randomCardNumber = Math.floor(Math.random()*13)+1;

do{
	secondCardNumber = Math.floor(Math.random()*13)+1;
	console.log(randomCardNumber);
	do{
		choice = prompt("(H)igher or (L)ower").toLowerCase();
		console.log(choice)
		if(choice == 'h' || choice == 'l'){
		validInput = true;
		}
	}while(!validInput);
	validInput = false;
	if (choice == "h" && secondCardNumber>=randomCardNumber || choice == "l" && secondCardNumber<=randomCardNumber){
		console.log("Correct");
		randomCardNumber = secondCardNumber;
	}else{
		console.log("Incorrect, the card was "+secondCardNumber);
		choice = prompt("Would you like to play again? (Y)es (N)o").toLowerCase();
		if(choice == "n"){
			game = false;
		}
	}
}while(game);	

		
		
		
		
		
		
