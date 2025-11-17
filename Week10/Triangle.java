/**
 * Program: Find the Triangle Area
 * ---------------------------------------------------------------
 * Description:
 * - Triangle is a subclass of Shape ( Superclass )
 * - Demonstrates use of the inheritance ( extends )
 * - Demonstrates use of the Encapsulation ( Private, Getter / Setter )
 * - Demonstrates use of the Polymorphism ( toString )
 * Created by Lourdes Pampa.
 * Date: 10/31/2025
 * */
package cwChapter11;

public class Triangle extends Shape {
	
	//Attributes
	private double firstSide;
	private double secondSide;
	
	//Constructors
	public Triangle(double firstSide, double secondSide ) {
		super("yellow");								//Changing the color inside the super
		this.firstSide = firstSide;
		this.secondSide = secondSide;
	}

	//Getters and Setters (Encapsulation)
	public double getfirstSide() {
		return firstSide;
	}

	public void setfirstSide(double firstSide) {
		this.firstSide = firstSide;
	}

	public double getsecondSide() {
		return secondSide;
	}

	public void setsecondSide(double secondSide) {
		this.secondSide = secondSide;
	}
	

	//toString() Method (Polymorphism)
	//Returns a description of the triangle shape	
	@Override
	public String toString() {
		return "Triangle [ firstSide = " + firstSide + ", secondSide = " + secondSide + ", color = " + getColor() + " ] ";
	}
	
	//User Method
	public double getArea() {
		return firstSide * secondSide  / 2;
	}

	
	
}
