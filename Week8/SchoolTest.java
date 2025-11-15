/**
 * Program: Objects and Class Basics
 * ------------------------------------------------------------------------------------------------------
 * Description: In this project we are going to see many options to declare objects and how can we reduce 
 * multiples lines to just one line.
 *  
 * Created by Lourdes Pampa.
 * Date: 10/17/2025
 */
package Week8;

public class SchoolTest {

	public static void main(String[] args) {
		// Instantiate two students and assign attributes values (Create a cope of Student.java document)
		Student John = new Student();                                     //John is an object, and we used the student class with default attributes
		
		Student Kile = new Student(1000283771, "Kile Lopez");             //Kile is an object, and we used the student class with GPA in default attribute
		
		Student Alice     = new Student(1000458871, "Alice White" , 3.9); //Alice is an object, and we are giving the attributes in the parameter
//		Alice.setAttributes(1000458871, "Alice White" , 3.9);			  //We replace next lines in just one line using setAttributes 
//		Alice.studentID   = 1000458871;
//		Alice.studentName = "Alice White";
//		Alice.studentGPA  = 3.9;
		
		Student Marco     = new Student(1000458550,"Marco Sandoval", 3.8);//Marco is an object, and we are giving the attributes in the parameter
//		Marco.setAttributes(1000458550,"Marco Sandoval", 3.8);			  //We replace next lines in just one line using setAttributes
//		Marco.studentID   = 1000458550;
//		Marco.studentName = "Marco Sandoval";
//		Marco.studentGPA  = 3.8;
		
		//Print the student objects
		System.out.println("===============Students List==============");
		System.out.println("First Student :" + Kile);					  //Print the memory id for the object Kile
		Kile.display(false);										      //This method is not going to show the GPA, calls display with 0 arguments
//		System.out.println("ID  : " + Kile.studentID);
//		System.out.println("Name: " + Kile.studentName);
//		System.out.println("GPA : " + Kile.studentGPA);
		
		//Print the student objects 		
		System.out.println("\nSecond Student :" + John);				  //Print the memory id for the object John
		John.display(true);												  //This method is going to show the values as default attributes
//		System.out.println("ID  : " + John.studentID);
//		System.out.println("Name: " + John.studentName);
//		System.out.println("GPA : " + John.studentGPA);
		
		//Print the student objects 		
		System.out.println("\nThird Student :" + Alice);			      //Print the memory id for the object Alice
		Alice.display();                                                  //This method is not going to show the GPA
//		System.out.println("ID  : " + Alice.studentID);
//		System.out.println("Name: " + Alice.studentName);
//		System.out.println("GPA : " + Alice.studentGPA);
		
		//Print the student objects
		System.out.println("\nFourth Student :" + Marco);				  //Print the memory id for the object Marco
		Marco.display(true);										      //This method is not going to show the GPA
//		System.out.println("ID  : " + Marco.studentID);
//		System.out.println("Name: " + Marco.studentName);
//		System.out.println("GPA : " + Marco.studentGPA);
		
		
		
		//Section for Instructors
		Instructor Jaime = new Instructor();
		Instructor Rene = new Instructor(12223, "Rene Barrientos");
		Instructor Luis = new Instructor(12224, "Luis Berry", "Entec");
		
		System.out.println("===============Instructors List==============");
		System.out.println("\nFirst Instructor " + Jaime);
		Jaime.toDisplay();
		System.out.println("\nSecond Instructor " + Rene);
		Rene.toDisplay();
		System.out.println("\nThird Instructor " + Luis);
		Luis.toDisplay();
		
		
		
		
		
		
		System.out.println("\n=========================================");

		//Print Different objects
		System.out.println("\nAlice == Marco -> " + (Alice == Marco));	  //Is false because they are different even though they have the same attributes
		
		//Point Alice to the same object as Marco
		//Alice = Marco;											      //Making both objects have the same memory id
		System.out.println("\nAlice == Marco -> " + (Alice == Marco));	  //Is true because we make them have the same memory id in line 32
		System.out.println("Address: " + Marco);
		System.out.println("Address: " + Alice);		
		
		//Comparison using String object
		String studentA = new String(Alice.studentName);
		String studentB = new String(Marco.studentName);
		
		System.out.println("\nstudentA == studentB --> " + (studentA == studentB));
		
		studentA = Alice.studentName;
		studentB = Marco.studentName;
		
		System.out.println("\nstudentA == studentB --> " + (studentA.equals(studentB)));
		
	}

}
