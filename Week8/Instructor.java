/**
 * Program: Objects and Class Basics
 * ------------------------------------------------------------------------------------------------------
 * Description: In this document we are going to declare our main Class Student, and we are going to see many
 * types of methods and constructors to show how can we set attributes without using so many lines of code.
 *  
 * Created by Lourdes Pampa.
 * Date: 10/17/2025
 */
package Week8;

public class Instructor {
	
	//Attributes
	int instructorID;
	String instructorName;
	String instructorDepartment;
	
	//Constructors
	//Default Constructor with default attributes
	public Instructor() {
		System.out.println("Empty object created");
		instructorID         = 0;
		instructorName       = null;
		instructorDepartment = null;
	}
	
	//Method to assign values to the instructor as ID and Name
	public Instructor(int id, String name) {
		this.instructorID         = id;
		this.instructorName       = name;
		this.instructorDepartment = null;
	}
	
	public Instructor(int id, String name, String department) {
		this.instructorID         = id;
		this.instructorName       = name;
		this.instructorDepartment = department;
	}
	
	public void toDisplay() {
		System.out.println("Instructor ID         : " + instructorID);
		System.out.println("Instructor Name       : " + instructorName);
		System.out.println("Instructor Department : " + instructorDepartment);
	}
	
	

}
