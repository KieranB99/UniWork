/**
* Author: Kieran Baumann - s5109044
* Date:   15/11/2018
* Week:   16 - Task 1
* Description: User enters membership and age then calculates the discount depending on input.
*/

var membership, age;
var discount = 0;
var program = false;

do{
	membership = prompt("Enter Membership").toLowerCase();
	age = prompt("Enter Age");
	
	if(age >=60 || age <=16){
		discount+=10;
	}
	
	if(membership == 'bronze'){
		console.log("You get a "+(discount+10)+"% discount");
		program = false;
	}else if (membership == 'silver'){
		console.log("You get a "+(discount+15)+"% discount");
		program = false;
	}else if (membership == 'gold'){
		console.log("You get a "+(discount+25)+"% discount");
		program = false;
	}else{
		console.log("Invalid Choice.");
	}
}while(program);