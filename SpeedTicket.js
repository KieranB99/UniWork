/**
* Author: Kieran Baumann - s5109044
* Date:   18/10/18
* Week:   14
* Description: Checks speed and outputs fine in response to the speed.
*/
var speedLimit, carSpeed, difference;
speedLimit = prompt("Enter Speed Limit: ");
carSpeed = prompt ("Enter Car Speed: ");

if (carSpeed > speedLimit){
	difference = carSpeed - speedLimit;
	if (difference <=4) { console.log("Over the speed limit - just - please be careful of your speed in future"); }
	else if (difference <=9) { console.log("5 miles or over limit - fined £50");}
	else if (difference <=14) { console.log("10 miles or over limit - fined £100");}
	else if (difference <=19) { console.log("15 miles or over limit - fined £150 and 3 points on license");}
	else if (difference >=20) { console.log("20 miles or over limit - fined £1000 and disqualified from driving");}
	else{
		console.log("Under the speed limit - no fine")
	}
}




