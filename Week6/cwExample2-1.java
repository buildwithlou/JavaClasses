/**
 * Program: Flipping a coin simulation
 * ------------------------------------------------------------------------------------------------------
 * Description: This program collects numbers from the user and create random number and the display we 
 * are waiting is a "Heads" or "Tails".
 * 
 * Exercise:Create a Java program that simulates flipping a coin multiple times using a method, you will define a method
 * that returns either "Heads" or "Tails" based on a random value and then use it in your main program to display the results.
 * Prompt the user to enter the number of coin flips (validate input is greater than 0) 
 * Create a Random object with a seed value of 2 for testing.
 * Call the coinFlip() method repeatedly based on the user input
 *  
 * Created by Lourdes Pampa.
 * Date: 9/26/2025
 */

package cwChapter6;

import java.util.Scanner;
import java.util.Random;

public class cwExample2 {
	public static int numberValidation(Scanner input) {
		//-----------------------Variable Declarations----------------------------------------------
		int validNumber = 0;
		
		while(true) {											//Loop for validation if is a positive number and numeric value
			if(input.hasNextInt()) {
				validNumber = input.nextInt();					//Read the variable as a numeric value
				if(validNumber >= 0) {
					break;
				}else {
					System.out.print("Try Again!. Please enter a positive number to flip the coin");
				}
			}else {
				System.out.print("Try Again!. Please enter a numeric value to flip the coin");
				input.nextLine();
			}
		}
		return validNumber;		
	}
	public static String coinFlip(Random value) {
		//-----------------------Variable Declarations----------------------------------------------
		String result = " ";
		int randValue;
		
		randValue = value.nextInt(2);                              //Generate 0 or 1
		
		if( randValue == 0) {									   //Conditional to print either "Heads" or "Tails"
			result = "Heads";
		}else {
			result = "Tails";
		}
		return result;
	}
	public static void main(String[] args) {
		//-----------------------Variable Declarations----------------------------------------------
		int numberCoinFlips;
		String result;
		Scanner input = new Scanner(System.in);
		Random value = new Random(2);
		
		System.out.print("Enter the number of coin flips: ");
		numberCoinFlips = numberValidation(input);
		for(int i = 0; i < numberCoinFlips; i++) {
			result = coinFlip(value);
			System.out.println(result);
		}
		
		//-----------------------------Finishing: Close scanner--------------------------------------
		input.close();
	}

}
