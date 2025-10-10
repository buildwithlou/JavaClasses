/**
 * Program: Array Conversion
 * ------------------------------------------------------------------------------------------------------
 *  Description: This program performs conversions between different number bases (binary, octal,
 *               hexadecimal, and decimal) using basic Java syntax, control structures, methods, and arrays.
 *               The program allows users to interact with arrays, perform conversions, and display results
 *               formatted according to the selected number base.
 * Created by Lourdes Pampa.
 * Date: 10/10/2025
 */
//-----------------------------IMPORTS------------------------------
import java.util.Random;
import java.util.Scanner;

public class ArrayConversion {
    //-----------------------------METHODS------------------------------
    // ---------------------- displayMenu ----------------------
    public static void displayMenu() {       
        System.out.println("====================================");           //This menu allows the user to choose from different options.
        System.out.println("      Array Conversion Menu");                        
        System.out.println("1. Convert numberts to Binary");
        System.out.println("2. Convert numberts to Octal");
        System.out.println("3. Convert numberts to Hexadecimal");
        System.out.println("4. Quit");
        System.out.println("====================================");
    }

    // ---------------------- fillWithRandomValues ----------------------
    public static void fillWithRandomValues(int[][] array, int base, Random random) {
        int max = 0;                                                            //Variable to hold the maximum value for each case

        switch (base) {                                                         //Switch used to decide the range of random numbers
            case 2:
                max = 1;                                                        //Binary values: 0 or 1
                break;
            case 8:
                max = 7;                                                        //Octal values: 0 to 7
                break;
            case 16:
                max = 15;                                                       //Hexadecimal values: 0 to 15
                break;
            default:
                max = 9;                                                        //Just in case (for decimal or others)
        }

        //Loop to fill array with random numbers between 0 and max
        for (int i = 0; i < array.length; i++) {                                //Iterate over each element in the 2 Dimension array
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(max + 1);                          //Assign a random number between 0 and 'max' (inclusive)
            }
        }
    }

     // -------------------------- displayArrays --------------------------
    public static void displayArrays(int[][] array, int[] converted, int base) {
        System.out.println("\nTwo dimensional array for " + getBaseName(base) + ":");               //Print header indicating which base is being displayed
        //Loop through each row of the 2 Dimension array
        for (int i = 0; i < array.length; i++) {
            //Loop through each element (column) in the row
            for (int j = 0; j < array[i].length; j++) {

                //For hexadecimal: convert 10–15 to A–F
                if (base == 16 && array[i][j] >= 10) {
                    char hexChar = (char) ('A' + (array[i][j] - 10));
                    System.out.print(hexChar + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }

            //Convert each row to decimal value
            int decimalValue = 0;                                                                   //Variable to hold the decimal value
            //Loop to calculate the decimal equivalent of the current row         
            for (int j = 0; j < array[i].length; j++) {  
                decimalValue = decimalValue * base + array[i][j];
            }

            System.out.println(getBaseName(base).toLowerCase() + " --> decimal: " + decimalValue);   //Print the decimal equivalent of the row 

        }
    }

    // ---------------------- convertToBase ----------------------
    public static int[] convertToBase(int[][] array) {
        //-----------------------Variable Declarations---------------------
        //Get the number of rows and columns from the 2 Dimension array
        int rows = array.length;                                                                    //Variable of number of row in the Dimensional Array
        int cols = array[0].length;                                                                 //Variable of number of columns the elements per row 
        //Create a new 1 Dimension array large enough to hold all elements
        int[] result = new int[rows * cols];                                                        //Array to store all elements
        //Index to track the current position in the 1D array
        int index = 0;                                                                              //variable to trak the position while coping elements from dimensions

        //Loop to convert the 2 Dimension array to a single 1 Dimension array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[index] = array[i][j];
                //Move to the next position in the 1 Dimension Array
                index++;        
            }
        }

        return result;
    }

    //---------------------- getBaseName -------------------------
    public static String getBaseName(int base) {
        String baseName;                                                                             //Variable to hold the name of the base

        //Switch used to return a string name for the base
        switch (base) {                                                                              //Determine the name of the base
            case 2:
                baseName = "Binary";                                                                 //Base 2
                break;
            case 8:
                baseName = "Octal";                                                                  //Base 8
                break;
            case 16:
                baseName = "Hexadecimal";                                                            //Base 16
                break;
            default:
                baseName = "Decimal";                                                                //Default base ( base 10 )
        }

        return baseName;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                                       //Scanner object to read user input from the console
        Random random = new Random();                                                                 //Random object to generate random numbers

        // reate a 2D array with 3 rows and 4 columns
        int[][] array = new int[3][4];

        boolean keepRunning = true;                                                                   //Variable to control the main program loop

        while (keepRunning) {
            //Show menu with options to the user
            displayMenu();

            System.out.print("Enter your choice: ");                                                //Ask the user to enter their choice
            int choice = input.nextInt();                                                             //Variable to hold the choice from the user

            int base = 0;                                                                             //Default base

            //Check user choice using switch
            switch (choice) {
                case 1:
                    base = 2;                                                                         // Binary
                    break;
                case 2:
                    base = 8;                                                                         // Octal
                    break;
                case 3:
                    base = 16;                                                                        // Hexadecimal
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");                                //Message if the user decide to finish the program
                    keepRunning = false;
                    continue;                                                                         //Skip rest of the loop
                default:
                    System.out.println("Invalid choice. Please Try again.");                        //Message to notify the user that the input was incorrect
                    continue;
            }

            //Fill the array with random numbers depending on base
            fillWithRandomValues(array, base, random);

            //Convert the 2D array to 1D array (for display)
            int[] oneDimensionalArray = convertToBase(array);

            //Display the arrays
            displayArrays(array, oneDimensionalArray, base);

            System.out.println();                                                                     //Line break before showing the menu again
            
        }
        //------------------------Close scanner---------------------------
        input.close();
    }

}
