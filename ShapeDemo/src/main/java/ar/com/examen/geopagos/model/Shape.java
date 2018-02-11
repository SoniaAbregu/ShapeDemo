package ar.com.examen.geopagos.model;

public abstract class Shape {
	private ShapeType type;
	private Double base;
	private Double height;
	private Double diameter;

	public Shape(ShapeType type, Double base, Double height, Double diameter) {
		this.type = type;
		this.base = base;
		this.height = height;
		this.diameter = diameter;
	}

	public ShapeType getType() {
		return type;
	}

	public void setType(ShapeType type) {
		this.type = type;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getDiameter() {
		return diameter;
	}

	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}

}
