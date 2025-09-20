/**
 * Program: Example 3 - Conditional 
 * ------------------------------------------------------------------------------------------------------
 * Description: This program display the Price of Insure if the age of the user is greater than 25 the price
 * is 2200 but if the age of the user is less than 25 the price 4800.
 * Validations:
 * 		 The age of the user should be more than 25 years old to know the price of the Insure
 * Created by Lourdes Pampa.
 * Date: 9/12/2025
 */
import java.util.Scanner;
public class cwExample3 {

	public static void main(String[] args) {
		//---------------------------------Variable Declarations------------------------------------
		int userAge;                                                      //Variable to store the age of the user
		int insurePrice;												  //Variable to store the Insure Price
		
		//---------------------------Input: Get the Age from user-----------------------------------
		Scanner input = new Scanner(System.in);                            //Scanner object for reading user input
		
		//Prompt to ask the user to input the Age
		System.out.print("What is the age of the user? ");
		userAge = input.nextInt();                                         //Read the variable as a numeric value
		
		//---------Conditional: Verifying the age of the person to know what is the price------------
		if (userAge < 25) {                                                //Verifying if the value is more than 25
			insurePrice = 4800;
		}else {
			insurePrice = 2200;
		}
		
		//----------------------------Output: Display the result-------------------------------------
		System.out.println("Annual price: $" + insurePrice);
		
		//-----------------------------Finishing: Close scanner--------------------------------------
		input.close();
	}

}
