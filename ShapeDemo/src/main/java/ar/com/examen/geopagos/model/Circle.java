package ar.com.examen.geopagos.model;

public class Circle extends Shape implements IShape {

	public Circle(Double diameter) {
		super(ShapeType.CIRCLE, null, null, diameter);
	}

	public Double getArea() {
		return Math.PI * Math.pow(this.getDiameter()/2, 2);
	}

	@Override
	public String toString() {
		return getType().name() + "[Diameter=" + getDiameter() + ", Area=" + getArea()
				+ "]";
	}

}
