package ar.com.examen.geopagos.model;

public class Square extends Shape implements IShape {

	public Square(Double base) {
		super(ShapeType.SQUARE, base, null, null);
	}

	public Double getArea() {
		return this.getBase() * this.getBase();
	}

	@Override
	public String toString() {
		return getType().name() + "[base=" + getBase() + ", Area=" + getArea() + "]";
	}

}
