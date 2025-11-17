/**
 * Program: Find the Circle Area
 * ---------------------------------------------------------------
 * Description:
 * - Circle is a subclass of Shape ( Superclass )
 * - Demonstrates use of the inheritance ( extends )
 * - Demonstrates use of the Encapsulation ( Private, Getter / Setter )
 * - Demonstrates use of the Polymorphism ( toString )
 * Created by Lourdes Pampa.
 * Date: 10/31/2025
 * */
package Week10;


/*Circle is the subclass of shape*/
public class Circle extends Shape {
	//Attribute
	private double radius;
	
	//Constructors
	public Circle(double radius) {
		super("red");							//Changing the color inside the super
		this.radius = radius;
	}
	
	//Getters and Setters (Encapsulation)
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//User Method
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	//toString() Method (Polymorphism)
	//Returns a description of the circle shape 
	@Override
	public String toString() {
		return "Circle [ radius = " + getRadius() + ", color = " + getColor() + " ] ";
	}
	
}
