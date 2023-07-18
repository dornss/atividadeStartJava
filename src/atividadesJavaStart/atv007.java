package atividadesJavaStart;

import java.util.Scanner;

public class atv007 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double a,b,c, areaQuadrado, areaTriangulo, areaTrapezio;
		
		System.out.println("Digite a medida A: ");
		a = sc.nextDouble();
		System.out.println("Digite a medida B: ");
		b = sc.nextDouble();
		System.out.println("Digite a medida C: ");
		c = sc.nextDouble();
		
		areaQuadrado  = a*a;
		areaTriangulo = (a*b)/2;
		areaTrapezio = (a+b)*c/2;
		
		System.out.printf("Área do quadrado: %.4f%n", areaQuadrado);
        System.out.printf("Área do triângulo retângulo: %.4f%n", areaTriangulo);
        System.out.printf("Área do trapézio: %.4f%n", areaTrapezio);
        
        sc.close();

		
	}
}
