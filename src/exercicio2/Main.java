package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int primeiroNumero = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int segundoNumero = sc.nextInt();
		int soma = primeiroNumero + segundoNumero;
		
		System.out.println("A soma destes 2 números é: " + soma);
		
		sc.close();
	}
		
}
