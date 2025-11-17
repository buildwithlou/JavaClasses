/**
 * Program: Find the Square Area
 * ---------------------------------------------------------------
 * Description:
 * - Square is a subclass of Rectangle (Parent Class <- Child Class)
 * - Demonstrates use of the inheritance ( extends )
 * - Demonstrates use of the Encapsulation ( Private, Getter / Setter )
 * - Demonstrates use of the Polymorphism ( toString )
 * Created by Lourdes Pampa.
 * Date: 10/31/2025
 * */
package Week10;

//Multilevel Inheritance (Shape <- Rectangle <-- Square)
public class Square extends Rectangle{
	
	//Constructor
	public Square(double side) {
		//Call the Rectangle constructor (parent class)
		super(side, side);
	}
	
	//toString() Method (Polymorphism)
	//Returns a description of the Square shape 
	public String toString() {
		return "Square [ side = " + getWidth() + ", color = " + getColor() + " ] ";
	}
	

}
