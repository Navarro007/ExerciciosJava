package exercicio7_areas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
		double A = sc.nextDouble();
		System.out.println("Digite o valor de B");
		double B = sc.nextDouble();
		System.out.println("Digite o valor de C");
		double C = sc.nextDouble();
		
		double pi = 3.14159;
		double areaTriangulo = (A * C) / 2;
		double areaCirculo = pi * Math.pow(C, 2);
		double areaTrapezio = ((A + B) * C) / 2;
		double areaQuadrado = Math.pow(B, 2);
		double areaRetangulo = A * B;
		
		System.out.printf("Triangulo: %.3f%n", areaTriangulo);
		System.out.printf("Círculo: %.3f%n", areaCirculo);
		System.out.printf("Trapézio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retangulo: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
