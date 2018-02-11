package ar.com.examen.geopagos;

import org.junit.Test;

import ar.com.examen.geopagos.exceptions.NoShapeTypeException;
import ar.com.examen.geopagos.model.Circle;
import ar.com.examen.geopagos.model.IShape;
import ar.com.examen.geopagos.model.ShapeType;
import ar.com.examen.geopagos.model.Square;
import ar.com.examen.geopagos.model.Triangle;
import junit.framework.TestCase;

public class ShapeTest extends TestCase {

	public void testCircleShape() {
		ShapeFactory factory = new ShapeFactory();
		IShape circle = factory.makeShape(ShapeType.CIRCLE, 12312d, 543d, 10d);
		
		assertTrue(circle instanceof Circle);
		assertNull(circle.getBase());
		assertNull(circle.getHeight());
		assertEquals(10d, circle.getDiameter());
		assertEquals((Math.PI * Math.pow(10d/2, 2)), circle.getArea());
	}

	public void testTriangleShape() {
		ShapeFactory factory = new ShapeFactory();
		IShape triangle = factory.makeShape(ShapeType.TRIANGLE, 12312d, 543d, 10d);
		
		assertTrue(triangle instanceof Triangle);
		assertEquals(12312d, triangle.getBase());
		assertEquals(543d, triangle.getHeight());
		assertNull(triangle.getDiameter());
		Double expectedArea = (triangle.getBase() * triangle.getHeight())/2; 
		assertEquals( expectedArea, triangle.getArea());
	}

	public void testSquareShape(){
		ShapeFactory factory = new ShapeFactory();
		IShape square = factory.makeShape(ShapeType.SQUARE, 12312d, 543d, 10d);
		
		assertTrue(square instanceof Square);
		assertEquals(12312d, square.getBase());
		assertNull(square.getHeight());
		assertNull(square.getDiameter());
		Double expectedArea = square.getBase() * square.getBase(); 
		assertEquals( expectedArea, square.getArea());	
	}
	
	@Test
	public void testNoShapeTypeException() {
		ShapeFactory factory = new ShapeFactory();
		try{
			factory.makeShape(null, 10d, 20d, 40d);	
			fail();
		}catch(NoShapeTypeException e){
			String message = "Shape type not valid";
			assertEquals(e.getMessage(), message);
		}
	}

}
