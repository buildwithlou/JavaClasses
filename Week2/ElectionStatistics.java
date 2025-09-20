/**
 * Program: Elections Statistics
 * ------------------------------------------------------------------------------------------------------
 * Description: This program display the name of three Political Parties, also calculates the statistics to know how many
 * votes each party has and the percentage of each political party.
 * Formulas:
 * 		 total Number Of Votes = number Of Votes 1 + number Of Votes 2 + number Of Votes 3;  
		 percent Political Party 1 = (number Of Votes 1 / total Number Of Votes) * 100;                 
		 percent Political Party 2 = (number Of Votes 2 / total Number Of Votes) * 100;				 
		 percent Political Party 3 = (number Of Votes 3 / total Number Of Votes) * 100;
 * Created by Lourdes Pampa.
 * Date: 9/5/2025
 */

import java.util.Scanner;

public class ElectionStatistics {

	public static void main(String[] args) {
		//-----------------------Variable Declarations----------------------------------------
		String politicalParty1, politicalParty2, politicalParty3;                  //Variable to hold the name of each Political Party 
		double numberOfVotes1, numberOfVotes2, numberOfVotes3;                     //Variable to hold the number of votes of each Political Party
		double totalNumberOfVotes;                                                 //Variable to hold the sum of the total votes 
		double percentPP1, percentPP2, percentPP3;                                 //Variable to hold the percentage of each Political Party
				
		//------------------Input: Get the radius from user-----------------------------------
		Scanner input = new Scanner(System.in);                                    //Scanner object for reading user input
		
		//Prompt for the name and votes of the First Political Party
		System.out.print("Enter the name of the First Political Party: ");
		politicalParty1 = input.next();                                            //Read the variable as a text value
		System.out.print("Enter the number of votes for the first Political Party " + politicalParty1 + ": ");
		numberOfVotes1 = input.nextDouble();						               //Read the variable as a numeric value
		
		//Prompt for the name and votes of the Second Political Party		
		System.out.print("Enter the name of the Second Political Party: "); 
		politicalParty2 = input.next();                                            //Read the variable as a text value
		System.out.print("Enter the number of votes for the Second Political Party " + politicalParty2 + ": ");
		numberOfVotes2 = input.nextDouble();                                       //Read the variable as a numeric value
		
		//Prompt for the name and votes of the Third Political Party
		System.out.print("Enter the name of the Third Political Party: ");
		politicalParty3 = input.next();                                            //Read the variable as a text value
		System.out.print("Enter the number of votes for the Third Political Party " + politicalParty3 + ": ");
		numberOfVotes3 = input.nextDouble();                                       //Read the variable as a numeric value
		
		//-------------------Processing: Calculate the area-----------------------------------
		 totalNumberOfVotes = numberOfVotes1 + numberOfVotes2 + numberOfVotes3;    //Formula to calculate the sum of the total votes
		 percentPP1 = (numberOfVotes1/totalNumberOfVotes) * 100.0;                 //Formula to calculate the percentage of votes of the First Political Party
		 percentPP2 = (numberOfVotes2/totalNumberOfVotes) * 100.0;				   //Formula to calculate the percentage of votes of the First Political Party
		 percentPP3 = (numberOfVotes3/totalNumberOfVotes) * 100.0;                 //Formula to calculate the percentage of votes of the First Political Party
		
												
		//----------------------Output: Display the result------------------------------------
		 System.out.println("The name for the Political Parties are: " + politicalParty1 + " , " + politicalParty2 + " & " + politicalParty3 );
		 System.out.println("\n-----------------------Vote Statistics----------------------");
		 System.out.println("\nThe number of the total votes: " + totalNumberOfVotes);
		 System.out.println("\nThe percentage for the First Political Party " + politicalParty1 + " is: " + percentPP1 + "%");
		 System.out.println("The percentage for the Second Political Party " + politicalParty2 + " is: " + percentPP2 + "%");
		 System.out.println("The percentage for the Third Political Party " + politicalParty3 + " is: " + percentPP3 + "%");
	}

}
