package escolaDoGabriel_OOP;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o nome do aluno: ");
	        String nome = sc.nextLine();

	        Aluno gabriel = new Aluno();
	        gabriel.setNome(nome);

	        System.out.println("Digite a nota 1: ");
	        double nota1 = sc.nextDouble();
	        gabriel.setNota1(nota1);

	        System.out.println("Digite a nota 2: ");
	        double nota2 = sc.nextDouble();
	        gabriel.setNota2(nota2);

	        System.out.println("Digite a nota 3: ");
	        double nota3 = sc.nextDouble();
	        gabriel.setNota3(nota3);

	        gabriel.calculaMedia();

	        sc.close();;
	    }
}
