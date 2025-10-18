/**
 * Program: Objects and Class Basics
 * ------------------------------------------------------------------------------------------------------
 * Description: In this document we are going to declare our main Class Student, and we are going to see many
 * types of methods and constructors to show how can we set attributes without using so many lines of code.
 *  
 * Created by Lourdes Pampa.
 * Date: 10/17/2025
 */
package cwChapter9;

public class Student {
	//Attributes 
	int studentID;
	String studentName;
	double studentGPA;
	
	//Default Constructor
	public Student() {
		System.out.println("Empty object created");
		studentID   = 0;
		studentName = null;
		studentGPA  = 0.0;
	}
	
	//Constructor with parameters 
	public Student(int id, String name) {
		//This refers to the Student class
		this(id, name, 0.0);     	//This line is going to replace the three next lines
//		this.studentID   = id;
//		this.studentName = name;
//		this.studentGPA  = 0.0;
	}
	
	//Method to assign or update three values attributes at the same time in just one line
	public Student(int id, String name, double gpa) {
		this.studentID   = id;
		this.studentName = name;
		this.studentGPA  = gpa;
	}
	
	//User method: zero-arg version
	public void display() {
		System.out.println("Student ID  : " + studentID);
		System.out.println("Student Name: " + studentName);
	}
	
	//User method: one-argument overloaded, print the GPA if requested
	public void display(boolean showGPA) {
		if(showGPA) {
			display();				//This line is calling the method display, this helps us to reduce lines of code
//			System.out.println("ID  : " + studentID);
//			System.out.println("Name: " + studentName);
			System.out.println("Student GPA : " + studentGPA);
		}else {
			display();
		}
	}
	
}
