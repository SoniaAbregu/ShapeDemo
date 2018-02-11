package ar.com.examen.geopagos;

import ar.com.examen.geopagos.model.IShape;
import ar.com.examen.geopagos.model.ShapeType;

public class ShapeClient {

	public static void main(String[] args) {

		ShapeFactory factory = new ShapeFactory();
		IShape circle = factory.makeShape(ShapeType.CIRCLE, null, null, 20d);
		IShape square = factory.makeShape(ShapeType.SQUARE, 20d, 30d, null);
		IShape triangle = factory.makeShape(ShapeType.TRIANGLE, 50d, 60d, 50d);
		System.out.println(circle.toString());
		System.out.println(square.toString());
		System.out.println(triangle.toString());
		
	}

}
