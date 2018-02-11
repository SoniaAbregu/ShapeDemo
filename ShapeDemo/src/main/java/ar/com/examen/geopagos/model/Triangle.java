package ar.com.examen.geopagos.model;

public class Triangle extends Shape implements IShape {

	public Triangle(Double base, Double height) {
		super(ShapeType.TRIANGLE, base, height, null);
	}
	
	public Double getArea() {
		return (this.getBase() * this.getHeight()) / 2;
	}

	@Override
	public String toString() {
		return getType().name() + "[base=" + getBase() + ", height=" + getHeight() + ",  area)=" + getArea() +  "]";
	}

}
