/**
 * Program: Geometric System
 * ---------------------------------------------------------------
 * Purpose: 
 * - How to use Inheritance
 * - How to use Encapsulation
 * - How to use Polymorphism 
 * - How to use ArrayList to manage objects dinamically
 * Created by Lourdes Pampa.
 * Date: 10/31/2025 
 * */
package Week10;

import java.util.ArrayList;

public class ShapeTest {

	private static double totalArea;

	public static void main(String[] args) {
		//Create an ArrayList to store multiple shapes
		//ArrayList can grow and shrink dynamically
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Circle(1.0));                   //Circle with radius 5
		shapes.add(new Triangle(3.0, 4.0));	           //Triangle with sides 3, 4	
		shapes.add(new Rectangle(2.0, 3.0));           //Rectangle with width 4, and with height 6
		shapes.add(new Square(3.0));                   //Square with side 3
		
		//Loops in the ArrayList to process all Shapes
		System.out.println("----------------------Shape Information---------------------");
		for(Shape shape: shapes) {
			System.out.println(shape);
			System.out.printf("Area: %.2f " , shape.getArea());
			System.out.println("\n-------------------------------------------------------------");
		}

		//Calculate total area of the all shapes
		for(Shape shape:shapes) {
			totalArea += shape.getArea();               //Polymorphism call
		}
		System.out.printf("Total Area of the all shapes: %.2f\n", totalArea);
		
		//Find the shape with the largest area and the smallest area
		Shape largestShape  = shapes.get(0);	 		//Assuming the largest shape is the first shape
		Shape smallestShape = shapes.get(0);			//Assuming the smallest shape is the first shape
		for(Shape shape: shapes) {
			if(shape.getArea() > largestShape.getArea())
				largestShape = shape;
			if(shape.getArea() < smallestShape.getArea())
				smallestShape = shape;
		}
		
		//Print to know the largest area and the smallest area
		System.out.println("The Largest area is: " + largestShape);
		System.out.println("The Smallest area is: " + smallestShape);
		
	}

}
