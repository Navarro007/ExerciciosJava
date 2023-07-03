package exercicio6_pecas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código da primeira peça:");
		int codPrimeiraPeca = sc.nextInt();
		System.out.println("Digite o número de peças:");
		int numPrimeiraPeca = sc.nextInt();
		System.out.println("Digite o valor unitátio da primeira peça");
		double unitarioPrimeiraPeca = sc.nextDouble();
		System.out.println("Digite o código da segunda peça:");
		int codSegundaPeca = sc.nextInt();
		System.out.println("Digite o número de peças:");
		int numSegundaPeca = sc.nextInt();
		System.out.println("Digite o valor unitátio da segunda peça");
		double unitarioSegundaPeca = sc.nextDouble();
		
		double valorPrimeiraPeca = unitarioPrimeiraPeca * numPrimeiraPeca;
		double valorSegundaPeca = unitarioSegundaPeca * numSegundaPeca;
		double valorTotal = valorPrimeiraPeca + valorSegundaPeca;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
	}
}
