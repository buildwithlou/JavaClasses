/**
* Program: Example 1 - Correction of errors in the code
* ------------------------------------------------------------------------------------------------------
* Description: This program receives an integer to know if is even or odd, and if the integer is positive,
* negative or zero.
* Created by Lourdes Pampa.
* Date: 9/12/2025
*/

import java.util.Scanner;

public class cwExample1{

public static void main(String[] arg) {
//create scanner object for input by user
Scanner inp = new Scanner(System.in);
int inputUser;
//ask user to input a number
System.out.println("Please enter an integer: ");
inputUser = inp.nextInt();
//verify if number is odd
if (inputUser % 2 == 0) {
System.out.println("Number entered is even.");
} else {
System.out.println("Number entered is odd.");
}
//check if input is positive, negative or zero
if (inputUser >= 0) {
System.out.println("Number is positive.");
} else if (inputUser < 0) {
System.out.println("Number is negative.");
} else
System.out.println("Number is zero.");
//Close scanner
inp.close();
}

}