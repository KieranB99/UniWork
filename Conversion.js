/**
* Author: Kieran Baumann - s5109044
* Date:   04/10/2018
* Week:   12
* Description: Table of squares and cubes starting from 0 to 10.
*/
var britPound = 500
var pound = 470
var fahrenheit = 85
var hour = 2
var minute = 20
var seconds = 26

var kg = pound / 2.205
console.log(pound + " pounds to kilograms is " + (Math.round(kg))+" kilograms")
var euro = britPound / 1.13
console.log(britPound + " british pounds to euros is " + (euro).toFixed(2) + " euros")
var celsuis = ((fahrenheit-32)*5/9)
console.log(fahrenheit + " fahrenheit is the same as "+Math.round(celsuis)+" celsuis")
var totalSeconds = (hour*3600) + (minute*60) + seconds
console.log(hour +" hours " + minute + " minutes and " + seconds +" seconds is equivalent to " + totalSeconds + " seconds.")
