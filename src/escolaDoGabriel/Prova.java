package escolaDoGabriel;

import java.util.Scanner;

public class Prova {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno gabriel = new Aluno();
		
		System.out.println("Digite uma nota ");
		gabriel.nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2 ");
		gabriel.nota2 = sc.nextDouble();
		System.out.println("Digite a nota 3 ");
		gabriel.nota3 = sc.nextDouble();
		
		gabriel.calculaMedia();
		
		
		sc.close();

	}
}
