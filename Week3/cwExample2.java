/**
 * Program: Example 2 - Conditional 
 * ------------------------------------------------------------------------------------------------------
 * Description: This program display the Price of the Hotel if the age of the user is greater than 65 the price
 * is going to have a 20$ discount, which is 135$, if the age of the user is less than 65 is going to keep the
 * normal price; 155$.
 * Validations:
 * 		 If the age of the user is greater than 65 is going to receive a 20$ discount.
 * 		 If the age of the user is less than 65 is going to keep the normal price.
 * Created by Lourdes Pampa.
 * Date: 9/12/2025
 */
import java.util.Scanner;
public class cwExample2 {

	public static void main(String[] args) {
		//---------------------------------Variable Declarations------------------------------------
		int hotelRate = 155;											//Constant Variable for the hotel Rate
		int userAge;													//Variable to store the age of the user
		
		//---------------------------Input: Get the Age from user-----------------------------------
				Scanner input = new Scanner(System.in);                 //Scanner object for reading user input
		
	    //Prompt to ask the user to input the Age		
		System.out.print("What is the age of the person? ");
		userAge = input.nextInt();                                      //Read the variable as a numeric value
		
		//---------Conditional: Verifying the age of the person to know what is the price------------
		if (userAge > 65) {                                             //Verifying if the age is more than 65
			hotelRate =  hotelRate-20;
			System.out.print("Your rate: " + hotelRate);
		}else {
			System.out.print("Your rate: " + hotelRate);
			
			
		//-----------------------------Finishing: Close scanner--------------------------------------
		input.close();
		}
	}

}
