package atividadesJavaStart;

import java.util.Scanner;

public class atv004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double area, r;
		
		System.out.println("Digite o raio do círculo: ");
		r = sc.nextDouble();
		
		area = Math.PI * Math.pow(r, 2);
		
		System.out.printf("Area = %.3f", area);
		
	}

}
