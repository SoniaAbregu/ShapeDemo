package ar.com.examen.geopagos.model;

public interface IShape {

	public Double getBase();

	public Double getHeight();

	public Double getDiameter();

	public Double getArea();

	public ShapeType getType();
}