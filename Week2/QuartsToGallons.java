/**
 * Program: Quarts To Gallons 
 * ------------------------------------------------------------------------------------------------------
 * Description: This program calculates the amount of Gallons needed to do a painting job, the user enter the total amount of quarts required
 * and the program do the conversion from quarts to gallons, also calculate the gallons needed for the job and the remaining quarts that don't
 * make a full gallon.
 * Formulas:
 *     gallons = quarts needed / quarts in gallon,
 *     extra quarts = quarts needed % quarts in gallon. 
 * Created by Lourdes Pampa.
 * Date: 9/5/2025
 */

import java.util.Scanner;

public class QuartsToGallons {

	public static void main(String[] args) {
		//-----------------------Variable Declarations----------------------------------------
		final int quartsInGallon = 4;                   //Constant variable which hold the number of quarts in a gallon
		int quartsNeeded;                               //Total number of quarts required to do a painting job 
 		int gallons;					                //Number of full gallons
		int extraQuarts;                                //Remaining quarts that don't make a full gallon 	
		
		//------------------Input: Get the radius from user-----------------------------------
		Scanner input = new Scanner(System.in);        //Scanner object for reading user input
		System.out.print("Enter the total number of quarts required to do the painting job: ");
		quartsNeeded = input.nextInt();			       //Read the variable as a numeric value
		
		//-------------------Processing: Calculate the area-----------------------------------
		gallons = quartsNeeded / quartsInGallon;        //Formula to calculate the quarts needed for the painting job
		extraQuarts = quartsNeeded % quartsInGallon;    //Formula to calculate the number of remaining quarts that don't make a full gallon 
												
		//----------------------Output: Display the result------------------------------------
		System.out.println("Gallons needed for the painting job: " + gallons + " gallons.");
		System.out.println("Number of remaining quarts: " + extraQuarts + " quarts.");
	}

}
