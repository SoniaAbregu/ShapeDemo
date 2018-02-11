package ar.com.examen.geopagos;

import ar.com.examen.geopagos.exceptions.NoShapeTypeException;
import ar.com.examen.geopagos.model.Circle;
import ar.com.examen.geopagos.model.IShape;
import ar.com.examen.geopagos.model.ShapeType;
import ar.com.examen.geopagos.model.Square;
import ar.com.examen.geopagos.model.Triangle;

public class ShapeFactory {

	public IShape makeShape(ShapeType type, Double base, Double height, Double diameter){
		IShape shape = null;
		
		if(type == null){
			throw new NoShapeTypeException("Shape type not valid");
		}
		
		switch (type) {
		case CIRCLE:
			shape = new Circle(diameter);
			break;
		case SQUARE:
			shape = new Square(base);
			break;
		case TRIANGLE:
			shape = new Triangle(base, height);
			break;
		default:
			throw new NoShapeTypeException("Shape type not valid");
		}
		return shape;
	}
}
