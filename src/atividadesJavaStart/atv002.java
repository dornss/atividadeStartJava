package atividadesJavaStart;

import java.util.Scanner;

public class atv002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, soma;
		
		System.out.println("Digite o valor de X: ");
		x = sc.nextDouble();
		System.out.println("Digite o valor de y: ");
		y = sc.nextDouble();
		
		soma = x+y; 
		
		System.out.printf("Soma = %f", soma);	
		
		sc.close();
	}

}
