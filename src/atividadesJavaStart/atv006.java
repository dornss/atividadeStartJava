package atividadesJavaStart;

import java.util.Scanner;


public class atv006 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		double d, comb, cons;
		
		System.out.println("Distância percorrida: ");
		d = sc.nextDouble();
		System.out.println("Combustível gasto: ");
		comb = sc.nextDouble();
		
		cons = d/comb;
		
		System.out.printf("Consumo medio = %.3f", cons);
		
		sc.close();

	}

}
