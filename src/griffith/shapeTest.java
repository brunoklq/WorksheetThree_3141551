package griffith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


//Student: Bruno Kennedy Lisboa de queiroz
//Student Number: 3141551

public class shapeTest { // class to test the units


	private static final double epsilon = 0.0; // attributes

	@Test
	public void testCircle() { // unit test for circle

		Circle circle = new Circle("Circle ", 3.5); // object
		assertEquals("The Shape: Circle The Radius: 3.5", circle.toString());// assert the values
		assertEquals(Math.PI * 3.5 * 3.5, circle.area(), epsilon);// assert the values
		assertEquals(2 * Math.PI * 3.5, circle.perimeter(), epsilon);// assert the values

	}


	@Test
	public void testRhombus() {// unit test for testRhombus

		Rhombus rhombus = new Rhombus ("Rhombus", 4,5,3);// object

		assertEquals("The Shape: Rhombus Diagonal: 4.0 and 5.0 Side: 3.0", rhombus.toString());

		assertEquals((4*5)/2.0, rhombus.area(), epsilon);// assert the values
		assertEquals(4*3, rhombus.perimeter(), epsilon);// assert the values


	}


	@Test
	public void testRightAngledTriangle() {// unit test for Triangle


		RightAngledTriangle test = new RightAngledTriangle("test", 3 , 4);// object

		assertEquals((3*4) / 2.0, test.area(), epsilon); // assert the values
		assertEquals(3+4+5, test.perimeter(), epsilon);// assert the values


	}


	@Test
	public void testIntegration() {


		ArrayList<shape> shapes = new ArrayList<>(); // arraylist from shape class

		shapes.add(new Circle ("Circle_1", 3.5));// assert the values
		shapes.add(new Circle("Circle_2", 2.0));// assert the values
		shapes.add(new Rhombus("Rombus_1", 4,5,3));// assert the values
		shapes.add(new Rhombus("Rhombus_2,",6,8,5));// assert the values
		shapes.add(new RightAngledTriangle("test_1", 3,4));// assert the values
		shapes.add(new RightAngledTriangle("test_2", 5,12));// assert the values


		for(shape shape: shapes) { // loop to check the value on shape list

			double area = shape.area(); // new instance
			double perimeter = shape.perimeter();// new instance

			assertTrue(area >=0);// assert the values
			assertTrue(perimeter >=0);// assert the values

		}

	}


}
