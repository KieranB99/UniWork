/**
* Author: Kieran Baumann - s5109044
* Date:   01/11/18
* Week:   15
* Description: Reads user input, reverses word then move first letter to the end of the word, checks if it matches original word.
*/
var firstLetter, word, reverseWord, finalWord;
var endProgram = false;

while (!endProgram){
	finalWord = "";
	reverseWord = "";
	word = prompt("Enter Word : ");
	firstLetter = word.charAt(0);
	
	for(i=word.length-1; i>=1; i--){
		reverseWord = reverseWord+word.charAt(i);
	}
	finalWord = firstLetter+reverseWord;
	if (word == "quit"){
		endProgram = true;
	}else if (finalWord == word){
		console.log("Is "+word + " same as " +finalWord+" ... True");
		
	}else{
		console.log("Is "+word+ " same as " + finalWord + "... False");
	}
}