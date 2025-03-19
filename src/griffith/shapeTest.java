package griffith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class shapeTest {
	
	
	private static final double epsilon = 0.0;
	
	@Test
	public void testCircle() {
		
		Circle circle = new Circle("Circle ", 3.5);
        assertEquals("The Shape: Circle The Radius: 3.5", circle.toString());
        assertEquals(Math.PI * 3.5 * 3.5, circle.area(), epsilon);
        assertEquals(2 * Math.PI * 3.5, circle.perimeter(), epsilon);
		
	}


	@Test
	public void testRhombus() {
		
		Rhombus rhombus = new Rhombus ("Rhombus", 4,5,3);
		
		assertEquals("The Shape: Rhombus Diagonal: 4.0 and 5.0 Side: 3.0 ", rhombus.toString());
		
		assertEquals((4*5)/2.0, rhombus.area(), epsilon);
		assertEquals(4*3, rhombus.perimeter(), epsilon);
		
		
	}
	
	
	@Test
	public void testRightAngledTriangle() {
		
		
		RightAngledTriangle test = new RightAngledTriangle("test", 3 , 4);
		
		assertEquals((3*4) / 2.0, test.area(), epsilon);
		assertEquals(3+4+5, test.perimeter(), epsilon);
		
		
	}
	
	
	@Test
	public void testIntegration() {
		
		
		ArrayList<shape> shapes = new ArrayList<>();
		
		shapes.add(new Circle ("Circle_1", 3.5));
		shapes.add(new Circle("Circle_2", 2.0));
		shapes.add(new Rhombus("Rombus_1", 4,5,3));
		shapes.add(new Rhombus("Rhombus_2,",6,8,5));
		shapes.add(new RightAngledTriangle("test_1", 3,4));
		shapes.add(new RightAngledTriangle("test_2", 5,12));
		
		
		for(shape shape: shapes) {
			
			double area = shape.area();
			double perimeter = shape.perimeter();
			
			assertTrue(area >=0);
			assertTrue(perimeter >=0);
			
		}
		
	}
	

}
