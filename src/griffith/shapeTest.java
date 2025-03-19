package griffith;

import static org.junit.Assert.assertEquals;

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
	

}
