package ar.com.examen.geopagos.model;

public enum ShapeType {
	TRIANGLE("TRIANGLE"), SQUARE("SQUARE"), CIRCLE("CIRCLE");

	private final String name;

	ShapeType(String s) {
		this.name = s;
	}

	public String getName() {
		return name;
	}

}
