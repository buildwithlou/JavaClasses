/**
 * Program: Giving a color to a Shape
 * ---------------------------------------------------------------
 * Description:
 * - Shape is the Super class of the project 
 * - Demonstrates use of the inheritance ( extends )
 * - Demonstrates use of the Encapsulation ( Private, Getter / Setter )
 * - Demonstrates use of the Polymorphism ( toString )
 * Created by Lourdes Pampa.
 * Date: 10/31/2025
 */
package Week10;

public abstract class Shape {
	//Fields (Attributes)
	//Common attribute for all shapes
	private String color;
	
	//Constructors
	public Shape() {
		color = "undefined";
		//super();									//Super is not necessary, we can delete it if we want
	}
	
	public Shape(String color) {
		super();
		this.color = color;
	}
	
	//Getters and Setters (Encapsulation)
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//toString() Method (Polymorphism)
	//Return a generic description of the shape
	public String toString() {
		return "Shape [color = " + color + " ] ";
	}

	//Abstract method 
	//This method must be implemented by each subclass 
	public abstract double getArea();
	
}
