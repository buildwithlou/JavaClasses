/**
 * Program: Circle Area
 * ------------------------------------------------------------------------------------------------------
 * Description: This program calculates the area of a circle based on a radius value entered by the user.
 * Formula: area = PI * radius * radius. 
 * Created by Lourdes Pampa.
 * Date: 9/5/2025
 */
package cwChapter2;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		//-----------------------Variable Declarations----------------------------------------
		final double PI = 3.14159;               //Constant for the value of PI
		double radius; 		                     //To store the radius entered by the user
		double area;		                     //To store the calculated area of the circle
		
		//------------------Input: Get the radius from user-----------------------------------
		Scanner input = new Scanner(System.in);  //Scanner object for reading user input 
		System.out.print("Enter radius: ");
		radius = input.nextDouble();			 //Read radius as double value                                                            
		//-------------------Processing: Calculate the area-----------------------------------
		area = PI * radius * radius;			 //Formula to calculate the circle area
												
		//----------------------Output: Display the result------------------------------------
		System.out.println("The area of the circle is: " + area);
	}

}
