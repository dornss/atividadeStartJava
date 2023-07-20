package atividadesJavaStart;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        double sum, avg;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos a serem cadastrados:  ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] vect = new String[n];
        double[] vect2 = new double[n];
        sum = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            vect[i] = sc.nextLine();
            System.out.println("Digite o preço do produto " + (i + 1));
            vect2[i] = sc.nextDouble();
            sc.nextLine();
            sum += vect2[i];
        }

        avg = sum / n;
        System.out.printf("Média dos preços dos produtos: %.2f%n", avg);
        sc.close();
    }
}
