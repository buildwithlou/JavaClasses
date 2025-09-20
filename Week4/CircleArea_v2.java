/**
 * Program: Circle Area
 * ------------------------------------------------------------------------------------------------------
 * Description: This program calculates the area of a circle based on a radius value entered by the user,
 * Also verifies if the value entered by the user is Double and if it is more than 0.
 * Formula: 
 * 			area = PI * radius * radius.
 * Validations:
 * 			Accept the value as integer
 * 			Radius cannot be zero 
 * Created by Lourdes Pampa.
 * Date: 9/12/2025
 */


import java.util.Scanner;

public class CircleArea_v2 {

	public static void main(String[] args) {
		//-----------------------Variable Declarations----------------------------------------------
		final double PI = 3.14159;               //Constant for the value of PI
		double radius; 		                     //To store the radius entered by the user
		double area;		                     //To store the calculated area of the circle
		
		//------------------Input: Get the radius from user-----------------------------------------
		Scanner input = new Scanner(System.in);  //Scanner object for reading user input 
		System.out.print("Enter radius: ");
		
		//-------------------Conditional: Verifying if the value is Double---------------------------
		if(input.hasNextDouble()) {					 //Verifying if the value is a Double
			radius = input.nextDouble();			 //Read radius as double value
		
			if(radius > 0) {
				//-------------------Processing: Calculate the area-----------------------------------
				area = PI * radius * radius;			 //Formula to calculate the circle area
				
				//----------------------Output: Display the result------------------------------------
				System.out.println("The area of the circle is: " + area);
				
			}else {
				System.out.println("Error: Radius must be positive!");
			}
		}else {
			System.out.println("Error: Please enter a valid number!");
		}
		 
		//---------------------------------Finishing: Close scanner-----------------------------------
		input.close();                                                               
		
	}

}
