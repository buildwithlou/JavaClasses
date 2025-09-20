/**
 * Program: Elections Statistics
 * ------------------------------------------------------------------------------------------------------
 * Description: This program display the name of three Political Parties, also calculates the statistics to know how many
 * votes each party has and the percentage of each political party and verifies if the number of votes is a positive number,
 * if the must is an integer value and if the votes are not zero.
 * Formulas:
 * 		 total Number Of Votes = number Of Votes 1 + number Of Votes 2 + number Of Votes 3;  
 *		 percent Political Party 1 = (number Of Votes 1 / total Number Of Votes) * 100;                 
 * 		 percent Political Party 2 = (number Of Votes 2 / total Number Of Votes) * 100;				 
 * 		 percent Political Party 3 = (number Of Votes 3 / total Number Of Votes) * 100;
 * Validations:
 * 		 Accept positive values for number of votes
 * 		 Votes must be integer values
 * 		 Total votes cannot be zero 
 * 		 
 * Created by Lourdes Pampa.
 * Date: 9/12/2025
 */


import java.util.Scanner;

public class ElectionStatistics_v2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//--------------------------------------------------Variable Declarations-------------------------------------------------------------------
		String politicalParty1, politicalParty2, politicalParty3;                  //Variable to hold the name of each Political Party 
		double numberOfVotes1 = 0.0, numberOfVotes2 = 0.0, numberOfVotes3 = 0.0;   //Variable to hold the number of votes of each Political Party
		double totalNumberOfVotes;                                                 //Variable to hold the sum of the total votes 
		double percentPP1, percentPP2, percentPP3;                                 //Variable to hold the percentage of each Political Party
				
		//-----------------------------------------------Input: Get the radius from user------------------------------------------------------------
		Scanner input = new Scanner(System.in);                                        //Scanner object for reading user input
		
		//Prompt for the name and votes of the First Political Party
		System.out.print("Enter the name of the First Political Party: ");
		politicalParty1 = input.next();                                                //Read the variable as a text value
		System.out.print("Enter the number of votes for the first Political Party " + politicalParty1 + ": ");
		
		//--------------------------------------Conditional: Verifying the votes for First Political Party--------------------------------------------
		if(input.hasNextDouble()) {													   //Verifying if the value is a Double
			numberOfVotes1 = input.nextDouble();						               //Read the variable as a numeric value
			if(numberOfVotes1 < 0) {
				System.out.println("Error: Vote count cannot be negative value!");
				return;																   //Stop execution 
			}
			input.nextLine();
		}else {
			System.out.print("Error: Vote count must be numeric value!");
			return;																       //Stop execution 
		}
			
		//Prompt for the name and votes of the Second Political Party		
		System.out.print("Enter the name of the Second Political Party: "); 
		politicalParty2 = input.next();                                                //Read the variable as a text value
		System.out.print("Enter the number of votes for the Second Political Party " + politicalParty2 + ": ");
		
		//--------------------------------------Conditional: Verifying the votes for Second Political Party--------------------------------------------
		if(input.hasNextDouble()) {                                                    //Verifying if the value is a Double
			numberOfVotes2 = input.nextDouble();                                       //Read the variable as a numeric value
			if(numberOfVotes2 < 0) {
				System.out.println("Error: Vote count cannot be negative value!");
				return;																   //Stop execution
			}
			input.nextLine();
		}else {
			System.out.print("Error: Vote count must be numeric value!");
			return;																       //Stop execution 
		}
		
		
		//Prompt for the name and votes of the Third Political Party
		System.out.print("Enter the name of the Third Political Party: ");
		politicalParty3 = input.next();                                                //Read the variable as a text value
		System.out.print("Enter the number of votes for the Third Political Party " + politicalParty3 + ": ");
		
		//--------------------------------------Conditional: Verifying the votes for Third Political Party--------------------------------------------
		if(input.hasNextDouble()) {                                                    //Verifying if the value is a Double
			numberOfVotes3 = input.nextDouble();                                       //Read the variable as a numeric value
			if(numberOfVotes3 < 0) {
				System.out.println("Error: Vote count cannot be negative value!");
				return;																   //Stop execution
			}
			input.nextLine();
		}else {
			System.out.print("Error: Vote count must be numeric value!");
			return;																       //Stop execution 
		}
		
		//-----------------------------------------------Processing: Calculate the total votes---------------------------------------------------------		
		totalNumberOfVotes = numberOfVotes1 + numberOfVotes2 + numberOfVotes3;    //Formula to calculate the sum of the total votes
		
		//Conditional to verify if the total number of votes is 0
		if(totalNumberOfVotes == 0) {
			System.out.println("Error: The total number of Votes cannot be Zero!");
			input.close();
			return;
		}
		
		 percentPP1 = (numberOfVotes1/totalNumberOfVotes) * 100.0;                 //Formula to calculate the percentage of votes of the First Political Party
		 percentPP2 = (numberOfVotes2/totalNumberOfVotes) * 100.0;				   //Formula to calculate the percentage of votes of the First Political Party
		 percentPP3 = (numberOfVotes3/totalNumberOfVotes) * 100.0;                 //Formula to calculate the percentage of votes of the First Political Party
		
		 
		//------------------------------------------------------Output: Display the result-------------------------------------------------------------
		 System.out.println("The name for the Political Parties are: " + politicalParty1 + " , " + politicalParty2 + " & " + politicalParty3 );
		 System.out.println("\n-----------------------Vote Statistics----------------------");
		 System.out.println("\nThe number of the total votes: " + totalNumberOfVotes);
		 System.out.println("\nThe percentage for the First Political Party " + politicalParty1 + " is: " + String.format("%.2f",  percentPP1) + "%");
		 System.out.println("The percentage for the Second Political Party " + politicalParty2 + " is: " + String.format("%.2f",  percentPP2) + "%");
		 System.out.println("The percentage for the Third Political Party " + politicalParty3 + " is: " + String.format("%.2f",  percentPP3) + "%");
		 
		 //-----------------------------------------------Output: Display the winner Political Party---------------------------------------------------
		 System.out.println("\n----------------------Election Results----------------------");
		 
		 //Conditional to determine the Winner political party using logical operators
		 if(percentPP1 > percentPP2 && percentPP1 > percentPP3) {				 	//Winner Political Party 1
			 System.out.println("\nThe winner Political Party is: " +  politicalParty1 + " with " + String.format("%.2f",  percentPP1) + "%");	
		 }else if(percentPP2 > percentPP1 && percentPP2 > percentPP3) {				//Winner Political Party 2
			 System.out.println("\nThe winner Political Party is: " +  politicalParty2 + " with " + String.format("%.2f",  percentPP2) + "%");	
		 }else if(percentPP3 > percentPP1 && percentPP3 > percentPP2){				//Winner Political Party 3
			 System.out.println("\nThe winner Political Party is: " +  politicalParty3 + " with " + String.format("%.2f",  percentPP3) + "%");	
		 }else {
			 if( numberOfVotes1 == numberOfVotes2 && numberOfVotes1 == numberOfVotes3) {
				 System.out.println("\nThree Political Parties - way tie!");
			 }else if(numberOfVotes1 == numberOfVotes2 && numberOfVotes1 > numberOfVotes3) {
				 System.out.println("\nThe Winners Political Parties are: " + politicalParty1 + " with " + String.format("%.2f",  percentPP1) + " and " + politicalParty2 + " with " + String.format("%.2f",  percentPP2));
			 }else if(numberOfVotes1 == numberOfVotes3 && numberOfVotes1 > numberOfVotes2) {
				 System.out.println("\nThe Winners Political Parties are: " + politicalParty1 + " with " + String.format("%.2f",  percentPP1) + " and " + politicalParty3 + " with " + String.format("%.2f",  percentPP3));
			 }else if(numberOfVotes2 == numberOfVotes3 && numberOfVotes2 > numberOfVotes1) {
				 System.out.println("\nThe Winners Political Parties are: " + politicalParty2 + " with " + String.format("%.2f",  percentPP2) + " and " + politicalParty3 + " with " + String.format("%.2f",  percentPP3));
			 }
		 }
		 
		 
		 
		//-------------------------------------------------------Finishing: Close scanner---------------------------------------------------------------
		input.close();                     
	}

}
