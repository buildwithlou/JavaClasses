/**
 * Program: Example 1 - Loops : Student Weighted GPA Simulator 
 * ------------------------------------------------------------------------------------------------------
 * Description: This program collects the information of 3 grades each time the user press to continue with y or n, 
 * 				once we have the grades we double check that the value is more than 0 and less than 100 and that is
 * 				not a letter, this verification with each grade, later we round the variable enter by the user, later
 * 				with the grade rounded we calculate the final grade using the three grades, and we put some feedback
 * 				for the user.
 * Created by Lourdes Pampa.
 * Date: 9/19/2025
 */
package cwChapter5;
import java.util.Scanner;
public class StudentWeightedGPASimulator {
	public static void main(String[] args) {
		//-----------------------Variable Declarations----------------------------------------------
		final int CREDIT_COURSE = 4;
		double firstGrade, secondGrade, thirdGrade;     //Variables to store their Grades
		char userAnswer;
		double firstDecimal,intPart,weightedGPA;
		
		//---------------------------Input: Get the grades from user-----------------------------------;
		Scanner input = new Scanner(System.in);			//Scanner object for reading user input

		//---------------Loop: how many times the user wants to put their grades-----------------------
		do {
			
			//Prompt to ask the user to input the first grade
			System.out.print("Enter grade for Course 1 (0-100): ");
			firstGrade = input.nextDouble();					//Read the variable as a numeric value
			
			
			while(firstGrade < 0 || firstGrade > 100 && input.hasNextDouble()) {
				//Prompt to tell the user the grade is a wrong value
				System.out.println("Error: Grade value must be between 0 to 100 and it must be a numeric value!");
				//Prompt to tell the user to put the correct value again
				System.out.print("Try Again!. Enter grade for Course 1 (0-100): ");
				firstGrade = input.nextDouble();				//Read the variable as a numeric value
			};
				
			//Prompt to ask the user to input the second grade
			System.out.print("Enter grade for Course 2 (0-100): ");
			secondGrade = input.nextDouble();				//Read the variable as a numeric value
			while(secondGrade < 0 || secondGrade > 100 ) {
				//Prompt to tell the user the grade is a wrong value
				System.out.println("Error: Grade value must be between 0 to 100 and it must be a numeric value!");
				//Prompt to tell the user to put the correct value again
				System.out.print("Try Again!. Enter grade for Course 2 (0-100): ");
				secondGrade = input.nextDouble();				//Read the variable as a numeric value
			};
			//Prompt to ask the user to input the third grade
			System.out.print("Enter grade for Course 3 (0-100): ");
			thirdGrade = input.nextDouble();				//Read the variable as a numeric value
			while(thirdGrade < 0 || thirdGrade > 100 ) {
				//Prompt to tell the user the grade is a wrong value
				System.out.println("Error: Grade value must be between 0 to 100 and it must be a numeric value!");
				//Prompt to tell the user to put the correct value again
				System.out.print("Try Again!. Enter grade for Course 3 (0-100): ");
				thirdGrade = input.nextDouble();				//Read the variable as a numeric value
			};
			
			//Round each grade using the rule if > .5
			intPart = Math.floor(firstGrade);
			firstDecimal = firstGrade - intPart;
			if(firstDecimal>= 0.5) {
				Math.ceil(firstGrade);
			}else{
				Math.floor(firstGrade);
			}
				
			intPart = Math.floor(secondGrade);
			firstDecimal = secondGrade - intPart;
			if(firstDecimal>= 0.5) {
				Math.ceil(secondGrade);
			}else {
				Math.floor(secondGrade);
			}
			
			intPart = Math.floor(thirdGrade);
			firstDecimal = thirdGrade - intPart;
			if(firstDecimal >= 0.5) {
				Math.ceil(thirdGrade);
			}else {
				Math.floor(thirdGrade);
			}
			
			//---------------------------------Calculations: weighted GPA----------------------------------------
			weightedGPA = (firstGrade * CREDIT_COURSE + secondGrade * CREDIT_COURSE + thirdGrade * CREDIT_COURSE) / (CREDIT_COURSE * 3);
			
			//---------------------------------Output: Display the result----------------------------------------
			if(weightedGPA >= 90) {
				System.out.println("Feedback: Honor Roll");
			}else if(weightedGPA >= 70) {
				System.out.println("Feedback: Passed");
			}else {
				System.out.println("Feedback: Needs Improvement");
			}
				
			System.out.print("Simulate another GPA (y/n): ");
			userAnswer = input.next().toLowerCase().charAt(0);
		}while(userAnswer == 'y');
		
			//-----------------------------Finishing: Close scanner--------------------------------------
		input.close();
	}

}
