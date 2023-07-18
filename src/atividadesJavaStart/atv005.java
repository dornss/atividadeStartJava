package atividadesJavaStart;

import java.util.Scanner;

public class atv005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		
		double valorHora, horaTrabalhavel, salario;
		
		System.out.println("Nome: ");
		nome = sc.next();
		System.out.println("Valor por hora: ");
		valorHora = sc.nextDouble();
		System.out.println("Horas trabalhadas: ");
		horaTrabalhavel = sc.nextDouble();
		
		salario = valorHora * horaTrabalhavel;
		
		System.out.printf("O valor pago a %s deve ser %.2f", nome, salario);
		
		
		
		sc.close();

	}

}
