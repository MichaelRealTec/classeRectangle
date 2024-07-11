package entities;

public class Rectangle {
	// Atributos
	private double width;
	private double height;
	
	// Métodos
	public double area(double width, double height) {
		return width * height;
	}
	
	public double perimeter(double width, double height) {
		return width + width + height + height;
	}
	
	public double diagonal(double width, double height) {
		return Math.sqrt(width * width + height * height);
	}
}
