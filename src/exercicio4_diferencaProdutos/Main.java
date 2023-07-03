package exercicio4_diferencaProdutos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro:");
		int A = sc.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		int B = sc.nextInt();
		System.out.println("Digite o terceiro número inteiro:");
		int C = sc.nextInt();
		System.out.println("Digite o quarto número inteiro");
		int D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.println("A diferença é: " + diferenca);
		
		sc.close();
	}
}
