package conversor_OOP;

import java.util.Locale;
import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cotação atual: ");
        double cotacaoAtual = sc.nextDouble();

        System.out.println("Quantos dólares serão comprados?");
        double dolaresComprados = sc.nextDouble();

        Cotacao cotacao = new Cotacao(cotacaoAtual);
        System.out.printf("%.2f", cotacao.converter(dolaresComprados));

        sc.close();
    }

}