/**
 * Program: Object Oriented Thinking
 * ------------------------------------------------------------------------------------------------------
 * Description: In this Document we are using setters and getters to actually change the information of the 
 * variable from the document Student, also we create a menu to show the list of the actual students, add 
 * students and filter them by major, we also use for each to convert more code in less code. (line 53 to 59)
 *  
 * Created by Lourdes Pampa.
 * Date: 10/24/2025
 */
package Week9;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
	//Method: Add a new student
	public static void addStudent(Scanner input, ArrayList<Student> students) {
		
		//Variable Declarations
		int    id, typeOption;
		double gpa;
		String name, major, type;
		
		System.out.println("========Add New Student=========");
		
		//Get input for student info
		System.out.println("Student ID   : ");
		id    = input.nextInt();
		System.out.println("Student Name : ");
		name  = input.nextLine();
		System.out.println("Student GPA  : ");
		gpa   = input.nextDouble();
		System.out.println("Student Major: ");
		major = input.nextLine();
		System.out.println("Student Type: 1. Graduate || 2. Undergrate");
		typeOption = input.nextInt();
		
		//Conditional to show student type basing in numbers
		if(typeOption == 1)
			type = "Graduate";
		else
			type = "Undergraduate";
		
		students.add(new Student(id,name, gpa, major,type));
		System.out.println("New Student Created sucessfully!");
	}

	//Method: Display Student Data
	public static void displayStudent(ArrayList<Student> students) {

		System.out.println("========Student Data=========");
		
//		for(int index = 0; index < students.size(); index++) {
//			System.out.println((index + 1) + ". " + students.get(index));
//		}
		
		//Using for each to convert the lines 54 to 56 to this reduced code 
		for(Student student: students) {
			System.out.println(student);
		}
	}
	
	//Method: Display Student by Type (Undergraduate or Graduate)
	public static void displayStudentbyType(Scanner input, ArrayList<Student> students) {
		
		//Variable Declarations
		int option;
		String typeStudent;
		
		System.out.println("========Student Data by Type=========");
		System.out.println("Choose type to display: ");
		System.out.println("1. Undergraduate");
		System.out.println("2. Graduate");
		System.out.println("\nOption: ");
		
		option = input.nextInt();
		
		//Conditional to filter student type by numbers
		if (option == 1) 
			typeStudent = "U";
		else
			typeStudent = "G";
		
		for(Student student: students) {
			//Using "equalsIgnoreCase" is basically saying "==" when we want to compare in this case we dont have to use else 
			if( student.getStudentType().equalsIgnoreCase(typeStudent)) {
				System.out.println(student);
			}
		}
			
		
	}
	
	public static void main(String[] args) {
		//Variables Declarations
		int option;
		
		//Input; get the option from the user
		Scanner input = new Scanner(System.in);
		
		//Create an ArrayList to store Student objects
		ArrayList<Student> students = new ArrayList<>();
		
		
		//Instantiate two students and assign attributes values (Create a cope of Student.java document)
		Student John  = new Student();                                                                  //John is an object, and we used the student class with default attributes
		
		Student Kile  = new Student(1000283771, "Kile Lopez", 3.1, "Biology", "G");             	    //Kile is an object, and we used the student class with GPA in default attribute
		
		Student Alice = new Student(1000458871, "Alice White" , 3.9, "Computer Science", "G");  	    //Alice is an object, and we are giving the attributes in the parameter

		Student Marco = new Student(1000458550,"Marco Sandoval", 2.8, "Artificial Intelligence", "U");  //Marco is an object, and we are giving the attributes in the parameter
		
		//Update student object
		John.setStudentID(1000834122);
		John.setStudentName("John Nellis");
		John.setStudentMajor("Information Systems Technology");
		John.setStudentType("G");
		
		//Add students to ArrayList
		students.add(Alice);
		students.add(John);
		students.add(Kile);
		students.add(Marco);
		
		do {
			//Display Menu 
			System.out.println("\n==========================Student Manager Menu===========================");
			System.out.println("1. Add New Student");
			System.out.println("2. Display Student");
			System.out.println("3. Display Student by Type");
			System.out.println("0. Exit");
			
			System.out.println("\nChoose an option");
			option = input.nextInt();
			
			switch (option) {
				case 1:
					addStudent(input, students);
					break;
				case 2:
					displayStudent(students);
					break;
				case 3:
					displayStudentbyType(input, students);
					break;
				default:
					System.out.println("Invalid option!");
			}
			
		}
		while(option != 0);
		
		
		//Closing Scanner
		input.close();

		
		
	}

}

