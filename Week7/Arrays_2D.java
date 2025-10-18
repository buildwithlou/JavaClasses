/**
 * Program: Two Dimensional Array (Basic Operations)
 * ------------------------------------------------------------------------------------------------------
 * Description: In this project we are going to use two dimensional Array, we are going to print the original form
 * as they ask ( 3 rows * 4 columns) and then we are going to get the sum of the rows of the array and the columns
 * of the array.
 *  
 * Created by Lourdes Pampa.
 * Date: 10/3/2025
 */
public class Arrays_2D {
	
	//Method to know the sum of the Rows inside the matrix
	public static int rowSumsMatrix(int[][] matrix) {
		int sum = 0;
		//Conditional to sum the rows of the Array changing positions
		for (int row = 0; row < matrix.length; row++) {
			
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
				sum = sum + matrix[row][col];
			}
			System.out.println(" --> " + sum);  //New line after each row
			sum = 0;
		}
		return sum;
		
	}
	
	//Method to know the sum of the Columns inside the matrix
	public static int colSumsMatrix(int[][] matrix) {
		int sum = 0;
		//Conditional to sum the columns of the Array changing positions
		for (int col = 0; col< matrix[0].length; col++) { 
			
			for (int row = 0; row < matrix.length; row++) {
				System.out.print(matrix[row][col] + " ");
				sum = sum + matrix[row][col];
			}
			System.out.println(" --> " + sum);  //New line after each row
			sum = 0;
		}
		return sum;
	}

	public static void printMatrix(int[][] matrix) {
		//Conditional to print the Array in the original form
		for (int row = 0; row < matrix.length; row++) { 
			
			for (int col = 0; col < matrix[row].length; col++) 
				System.out.print(matrix[row][col] + " ");
			
			System.out.println(" ");  //New line after each row
		}
			
	}
	
	public static void main(String[] args) {
		//Create a 3 * 4 matrix (3 rows and 4 columns)
		int[][] matrix = new int[3][4];
		
		//Initialize values with a pattern
		for (int row = 0; row < matrix.length; row++) 
			for (int col = 0; col < matrix[row].length; col++) 
				matrix[row][col] = (row + 1) * 10 + (col + 1);
				
				
		System.out.println("\nOriginal Matrix");		
		printMatrix(matrix);
		
		//Row sums
		System.out.println("\nSums by Rows");
		rowSumsMatrix(matrix);
		
		//Column sums
		System.out.println("\nSums by Cols");
		colSumsMatrix(matrix);
		
			
		
	}

}
