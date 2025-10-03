/**
 * Program: Calculate total calories of a pizza given its diameter
 * ------------------------------------------------------------------------------------------------------
 *  Description: This program collects the information about the size of the pizza that you are going to eat 
 *  			to know how many calories has the pizza, also ask you if you want to know the calories for 
 *  			more pizzas.
 * Created by Lourdes Pampa.
 * Date: 9/26/2025
 */

package cwChapter6;
import java.util.Scanner;
public class cwExample1 {
	/*
	 * Verifies if the diameter is a positive value 
	 * @param positiveDiameter
	 * @return */
	public static double diameterValidation(Scanner input) {
		//-----------------------Variable Declarations----------------------------------------------
		double positiveDiameter = 0;
		
		while(true) {														  //Loop for validation if is a positive number and numeric value
			if(input.hasNextDouble()) {
				positiveDiameter = input.nextDouble();
			
				if(positiveDiameter > 0) {
					break; 													   //Valid positive diameter
				}else {
					System.out.print("Try Again!. Please enter a positive number of the inches for your Pizza: ");
				}
			}else {
				System.out.print("Try Again!. Please enter a numeric value of the inches for your Pizza:");
				input.nextLine();
			}
	
		}
		return positiveDiameter;
	}
	
	/*
	 * Calculates the area of a circle from its diameter
	 * Formula: area = PO * radius ^ 2, radius = diameter / 2 
	 * @param circleDiameter the circle's diameter
	 * @return */
	public static double calcCircleArea(double circleDiameter) {
		//-----------------------Variable Declarations----------------------------------------------
		final double PI = 3.1416;
		double circleRadius;
		double circleArea;  												//PI * radius ^ 2
		
		circleRadius = circleDiameter / 2.0;                               	//Convert diameter to radius
		circleArea = PI * circleRadius * circleRadius;						//Calculate circle area
		return circleArea;                                                  //Send the computed area back to the caller method
	}
	
	/*
	 * Estimates total calories of a round pizza given its diameter
	 * @param diameter
	 * @return total calories
	 * */
	
	public static double pizzaCalories(double diameter) {
		//-----------------------Variable Declarations----------------------------------------------
		final double caloriesSquareInch = 16.7;                             //Static variable to calculate the calorie value
		
		return calcCircleArea(diameter) * caloriesSquareInch; 				//Send the total formula back to the caller method
	}
	
	public static void main(String[] args) {
		//-----------------------Variable Declarations----------------------------------------------
		double calories;
		double inches = 0;
		char userAnswer;
		
		//---------------------------Input: Get the grades from user--------------------------------
		Scanner input = new Scanner(System.in);
		
		//-------------Loop: how many times the user wants to put the pizza size--------------------
		do {
			
			//Prompt to ask the user to input the first pizza size
			System.out.println("How many inches has you pizza? ");
			inches = diameterValidation(input);									 //Calling the method to know if the value is positive
			calories = pizzaCalories(inches); 									 //Calling the method to know the calories

			//Prompt to tell the user the grade the calories value of the pizza
			System.out.printf(inches + " inch pizza has %.2f calories. \n", calories);

			//Prompt to tell the ask the user if they need the calorie value of another pizza		
			System.out.print("Simulate another Pizza (y/n): ");

			userAnswer = input.next().toLowerCase().charAt(0);                   //Read the answer from the user
			//userAnswer = input.nextLine().charAt(0);                          //Another option to read the answer from the user
		}while(userAnswer == 'y');
		
		//-----------------------------Finishing: Close scanner--------------------------------------
		input.close();
	}

}
