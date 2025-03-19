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
		
		
	}
	

}
