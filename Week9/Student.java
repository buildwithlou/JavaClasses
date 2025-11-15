/**
 * Program: Objects and Class Basics
 * ------------------------------------------------------------------------------------------------------
 * Description: In this document we are starting to use encapsulation with getters and setters, first
 * we have to put our variables as private, and with getters, we can print the actual information of the variables,
 * only using set you can update the information of the variable, we also update the display method with new 
 * attributes like Major and Type. (Graduate, UnderGraduate)
 *  
 * Created by Lourdes Pampa.
 * Date: 10/24/2025
 */
package Week9;

public class Student {
	//Attributes 
	private int    studentID;
	private String studentName;
	private double studentGPA;
	private String studentMajor;
	private String studentType;	    //Undergraduate or Graduate student
	
	//Default Constructor: zero-arguments (default values)
	public Student() {
		System.out.println("Empty object created");
		studentID   = 0;
		studentName = null;
		studentGPA  = 0.0;
		studentMajor = null;
		studentType = null;
	}
	
	
	//Method to assign or update three values attributes at the same time in just one line
	public Student(int id, String name, double gpa, String major, String type) {
		this.studentID   = id;
		this.studentName = name;
		this.studentGPA  = gpa;
		this.studentMajor = major;
		this.studentType = type;
	}
	
	//Getters and Setters

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentGPA() {
		return studentGPA;
	}

	public void setStudentGPA(double studentGPA) {
		this.studentGPA = studentGPA;
	}
	
	public String getStudentMajor() {
		return studentMajor;
	}


	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}


	public String getStudentType() {
		return studentType;
	}


	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}


	
	//User method: zero-arg version
	public void display() {
		System.out.println("Student ID  : "  + studentID);
		System.out.println("Student Name: "  + studentName);
		System.out.println("Student Major: " + studentMajor);
		System.out.println("Student Type: "  + studentType);
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
	
	public String toString() {
		//Display the student information in one line 
		return "Student ID: " + studentID + " | Student Name: " + studentName + " | Student GPA: " + studentGPA + " | Student Major:  " + studentMajor + " | Student Type: " + studentType;
	}
	
	
	
}
