/**
 * Program: Find the Rectangle Area
 * ---------------------------------------------------------------
 * Description:
 * - Rectangle is a subclass of Shape ( Superclass )
 * - Demonstrates use of the inheritance ( extends )
 * - Demonstrates use of the Encapsulation ( Private, Getter / Setter )
 * - Demonstrates use of the Polymorphism ( toString )
 * Created by Lourdes Pampa.
 * Date: 10/31/2025
 * */
package Week10;

public class Rectangle extends Shape{
	//Attributes
	private double width;
	private double height;
	
	//Constructors
	public Rectangle(double width, double height) {
		super("pink");                         //Changing the color inside the super
		this.width = width;
		this.height = height;
	}

	
	//Getters and Setters (Encapsulation) 
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	//toString() Method (Polymorphism)
	//Returns a description of the circle shape
	@Override
	public String toString() {
		return "Rectangle [ width = " + width + ", height = " + height + ", color = " + getColor() + " ] ";
	}
	
	//User Method
	public double getArea() {
		return width * height;
	}
	
	
	
}
