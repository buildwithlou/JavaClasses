/**
 * Program: One Dimensional Arrays (Basic Operations)
 * ------------------------------------------------------------------------------------------------------
 * Description: 
 * In this project we are going to find multiple operations about past modules including Arrays. 
 * Created by Lourdes Pampa.
 * Date: 10/3/2025
 */
import java.util.Scanner;
public class Arrays_1D {
	
	//Calculate min and max value of the array Scores
	public static int[] minMax(int[] scores) {
		//-----------------------Variable Declarations----------------------------------------------
		int[] result = new int[2];
		int min = scores[0];
		int max = scores[0];
		
		//Loop for validation which number is minimum and maximum in the array 
		for(int data: scores) {
			
			if(min > data)
				min = data;
			
			if(max < data)
				max = data;
		}
		result[0] = min;
		result[1] = max;
		return result;
	}
	
	//Look it up if the input from the user is inside the main Array
	public static int indexOf(int[] scores, int lookfor) {
		//-----------------------Variable Declarations----------------------------------------------
		int result = 0;
		
		//Loop to find if the input of the user is inside the Array
		for(int i = 0; i < scores.length; i++) {
			if(lookfor == scores[i]) {
				result = i;
				break;
			}else {
				result = -1;
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
		//1.Declare & Create and Array with 5 integer values
		//-----------------------Variable Declarations----------------------------------------------
		int[] scores = new int[5];
		int sum = 0;
		int[] min_max;
		double average;
		int lookfor;
		int position;
		
		//2. Initialize this array
		scores[0] = 90;
		scores[1] = 85;
		scores[2] = 88;
		scores[3] = 92;
		scores[4] = 76;
		
		//3. Basic indexing operations
		System.out.println("First Score (index 0): " + scores[0]);
		System.out.println("Last Score (index = length - 1 ): " + (scores[scores.length - 1]));
		System.out.println("Array length: " + scores.length);
		
		//4. Iterate with classical for-loop
		System.out.print("\nAll scores (Classical for-loop): \n");
		for(int index = 0; index < scores.length; index++) {
			System.out.println("Index " + index + "-->" + scores[index]);
		}
		
		//5. Iterate with enhanced for-loop
		System.out.println("\nAll scores (Enhances for-loop)");
		for(int value : scores) {
			System.out.println("Score: " + value);
			
		}

		//6. Aggregate calculation: sum & average
		System.out.println("\nAggregate calculations: sum & average: ");
		for(int value : scores) {
			sum = sum + value;
			
		}
		average = (double)sum / scores.length;
		System.out.println("Sum = " + sum + ", Average = " + average);
		
		//7. Min and Max
		System.out.println("\nMinimum & Maximum: ");
		min_max = minMax(scores);
		System.out.println("Min = "+ min_max[0] + ", Max = " + min_max[1]);
		
		//8. Linear search score
		System.out.println("\nLinear Search:");
		
		//Ask for the score that want to search
		Scanner input = new Scanner(System.in);
		
		//Prompt to tell the user to put a value so we look it up and see if is inside the main Array
		System.out.println("Enter the value that you want to look it up: ");
		
		//Read the variable as a numeric value
		lookfor = input.nextInt();
		position = indexOf(scores, lookfor);
		
		//Loop to print the result of the IndexOf Method
		if(position != -1) {
			System.out.println("The value " + lookfor + " exist in the Array in this position: " + position);
		}else {
			System.out.println("The value " + lookfor + " does not exist in the Array.");
		}
		
		//-----------------------------Finishing: Close scanner--------------------------------------
		input.close();
	}

}
