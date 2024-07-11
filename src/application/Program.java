package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// Exercicio DevSuperior (classeRectangle)
		
		Rectangle rectangle = new Rectangle();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com a largura e altura do retângulo: ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		//rectangle.area(width, height);
		System.out.printf("AREA = %.2f%n",rectangle.area(width, height));
		System.out.printf("PERIMETRO = %.2f%n", rectangle.perimeter(width, height));
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal(width, height));
		sc.close();
	}

}
