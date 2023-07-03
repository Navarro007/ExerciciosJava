package exercicio5_numSalFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionario:");
		int number = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas:");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Digite quanto o funcionário ganha por hora");
		double porHora = sc.nextDouble();
		
		double salary = horasTrabalhadas * porHora;
		
		System.out.println("Number = " + number);
		System.out.printf("Salary = U$ %.2f%n", salary);
		
		sc.close();
	}

}
